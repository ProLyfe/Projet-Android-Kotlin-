fun main(args: Array<String>) {

    println("======== Plus ou moins ========\n")
    println("Joueur 1 choisissez un nombre entre 1 et 100 :\n")
    val J1nombre = readLine()!!.toInt()
    var J2nombre: Int
    var essaies=0

    while (true) {
        print("Joueur 2 entrez un nombre :")
        J2nombre = readLine()!!.toInt()

        when(J2nombre.compareTo(J1nombre)) {
            -1 -> { println("Plus grand"); essaies++ }
            0 -> { essaies++; println("Bravo ! Nombre d'essaies $essaies"); return }
            1 -> { println("Plus petit"); essaies++ }
        }
    }
}