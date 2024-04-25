package r.mplace

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/ads")
class AdsController(val repo: AdsRepository) {

    @GetMapping
    fun findAll() {
        ResponseEntity.ok(repo.findAll())
    }
}