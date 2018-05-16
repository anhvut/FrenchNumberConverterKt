package com.avt.frenchnumberconverter

fun convertToLetter(i: Int): String {
    val empty = ""
    val frenchNumberWords = arrayOf(
            empty,
            "un",
            "deux",
            "trois",
            "quatre",
            "cinq",
            "six",
            "sept",
            "huit",
            "neuf",
            empty,
            "onze",
            "douze",
            "treize",
            "quatorze",
            "quinze",
            "seize"
    )
    val frenchTensWords = arrayOf("zéro", "dix", "vingt", "trente", "quarante", "cinquante", "soixante",
            "soixante-dix", "quatre-vingts", "quatre-vingt-dix")

    val units = i % 10
    val tens = i / 10
    val tensAsString = frenchTensWords[tens]
    if(units != 0 && tens != 0 && i > 16){
        return tensAsString + "-" + frenchNumberWords[units]
    }
    if (units == 0) {
        return tensAsString
    }
    return frenchNumberWords[i]

}