package r.mplace

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("ADS")
data class Ad(@Id var id: Long, val title: String, val owner: String, val description: String)