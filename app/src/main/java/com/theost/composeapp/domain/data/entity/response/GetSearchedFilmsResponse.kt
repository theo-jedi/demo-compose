package com.theost.composeapp.domain.data.entity.response

import com.theost.composeapp.domain.data.entity.ListFilmDto
import kotlinx.serialization.Serializable

@Serializable
data class GetSearchedFilmsResponse(
    val keyword: String,
    val pagesCount: Int,
    val films: List<ListFilmDto>
)
