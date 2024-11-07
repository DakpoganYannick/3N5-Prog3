package org.example

fun main()
{
    try {
        trouveru(arrayOf("waves","waves1","waves2"), "waves3")
        print("L'élement est dans le tableau")
    }
    catch (e:IllegalArgumentException)
    {
        print("Non")
    }


}


fun trouveru(tabString: Array<String>, elementRecherché: String): Int {

    if (tabString.contains(elementRecherché)) {
        return tabString.indexOf(elementRecherché)
    }
    else{
        throw IllegalArgumentException()
    }


}