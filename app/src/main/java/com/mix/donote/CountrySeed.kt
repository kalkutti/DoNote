package com.mix.donote

class CountrySeed {

    fun seed(): List<Country> {
        val countries = listOf<Country>(
            Country(625, "Brazil"),
            Country(845, "Canada"),
            Country(345, "China"),
            Country(745, "Dominican Republic"),
            Country(563, "Germany"),
            Country(653, "India"),
            Country(769,"Netherlands"),
            Country(463, "Norway"),
            Country(547, "Peru"),
            Country(556, "Philippines"),
            Country(843, "Poland"),
            Country(945, "Romania"),
            Country(568, "South Africa"),
            Country(767, "Spain"),
            Country(457, "Sweden"),
            Country(363, "United Kingdom"),
            Country(265, "United States")
        )
        return countries
    }
}

class Country(private val id: Int, val name: String) {

}
