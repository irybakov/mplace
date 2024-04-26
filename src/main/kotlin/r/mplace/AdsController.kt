package r.mplace

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/ads")
class AdsController(private val repo: AdsRepository) {

    @GetMapping
    fun findAll(): List<Ad> {
        return repo.findAll().toList()
    }
}