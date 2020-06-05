package main.kotlin

import java.math.BigDecimal
import java.math.RoundingMode

object Fails {


    // FAILS
    @JvmStatic
    fun round(number: Double?, places: Int?): Double? {
        if (number == null || places == null) return null

        return round(number.toBigDecimal(), places)?.toDouble()
    }

    @JvmStatic
    fun round(number: BigDecimal?, places: Int?): BigDecimal? {
        if (number == null || places == null) return null

        return number.setScale(places, RoundingMode.HALF_UP)
    }
}