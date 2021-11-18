import org.thymeleaf.TemplateEngine
import org.thymeleaf.context.Context
import org.thymeleaf.templatemode.TemplateMode
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver
import java.io.FileWriter
import java.util.*

fun main() {
    val templateEngine = TemplateEngine()
    val templateResolver = ClassLoaderTemplateResolver()
    templateResolver.templateMode = TemplateMode.XML
    templateEngine.setTemplateResolver(templateResolver)

    val imageBytes = ClassLoader.getSystemResource("new.png").readBytes()
    val imageBase64 = Base64.getMimeEncoder().encodeToString(imageBytes)

    val context = Context()
    context.setVariable("imageBase64", imageBase64)

    templateEngine.process("template.svg", context, FileWriter("C:/Temp/processed.svg"))
}
