package com.avt.frenchnumberconverter

import org.junit.Test
import kotlin.test.assertEquals

class ConverterKtTest {
    @Test
    fun `should convert 0-19 to zéro à dix-neuf`() {
        assertEquals("zéro", convertToLetter(0))
        assertEquals("un", convertToLetter(1))
        assertEquals("deux", convertToLetter(2))
        assertEquals("trois", convertToLetter(3))
        assertEquals("quatre", convertToLetter(4))
        assertEquals("cinq", convertToLetter(5))
        assertEquals("six", convertToLetter(6))
        assertEquals("sept", convertToLetter(7))
        assertEquals("huit", convertToLetter(8))
        assertEquals("neuf", convertToLetter(9))
        assertEquals("dix", convertToLetter(10))
        assertEquals("onze", convertToLetter(11))
        assertEquals("douze", convertToLetter(12))
        assertEquals("treize", convertToLetter(13))
        assertEquals("quatorze", convertToLetter(14))
        assertEquals("quinze", convertToLetter(15))
        assertEquals("seize", convertToLetter(16))
        assertEquals("dix-sept", convertToLetter(17))
        assertEquals("dix-huit", convertToLetter(18))
        assertEquals("dix-neuf", convertToLetter(19))
    }

    @Test
    fun `should convert 20 to vingt`() {
        assertEquals("vingt", convertToLetter(20))
    }

    @Test
    fun `should convert tens from 20 to 90`() {
        assertEquals("vingt", convertToLetter(20))
        assertEquals("trente", convertToLetter(30))
        assertEquals("quarante", convertToLetter(40))
        assertEquals("cinquante", convertToLetter(50))
        assertEquals("soixante", convertToLetter(60))
        assertEquals("soixante-dix", convertToLetter(70))
        assertEquals("quatre-vingts", convertToLetter(80))
        assertEquals("quatre-vingt-dix", convertToLetter(90))
    }

    @Test
    fun `should convert from 22-29`(){
        assertEquals("vingt-deux", convertToLetter(22))
        assertEquals("vingt-trois", convertToLetter(23))
        assertEquals("vingt-quatre", convertToLetter(24))
        assertEquals("vingt-cinq", convertToLetter(25))
        assertEquals("vingt-six", convertToLetter(26))
        assertEquals("vingt-sept", convertToLetter(27))
        assertEquals("vingt-huit", convertToLetter(28))
        assertEquals("vingt-neuf", convertToLetter(29))
        assertEquals("trente-trois", convertToLetter(33))
    }


    @Test
    fun `should convert 21`(){
        assertEquals("vingt-et-un", convertToLetter(21))
    }

}
