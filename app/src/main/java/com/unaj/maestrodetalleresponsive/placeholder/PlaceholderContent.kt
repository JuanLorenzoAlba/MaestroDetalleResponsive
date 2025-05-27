package com.unaj.maestrodetalleresponsive.placeholder

object PlaceholderContent {

    /**
     * Lista de sitios web de ejemplo.
     */
    val ITEMS: List<PlaceholderItem> = listOf(
        PlaceholderItem("1", "Amazon", "https://www.amazon.com"),
        PlaceholderItem("2", "Google", "https://www.google.com"),
        PlaceholderItem("3", "Android", "https://www.android.com"),
    )

    /**
     * Un ítem que representa un sitio web.
     */
    data class PlaceholderItem(
        val id: String,
        val websiteName: String,
        val websiteUrl: String
    ) {
        override fun toString(): String = websiteName
    }
}
