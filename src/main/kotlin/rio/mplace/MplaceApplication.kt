package rio.mplace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MplaceApplication

fun main(args: Array<String>) {
	runApplication<MplaceApplication>(*args)
}
