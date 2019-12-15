fun main(){
    val animalerie = Animalerie()

    animalerie.ajouteranimal(Chien())
    animalerie.ajouteranimal(Chat())
    animalerie.ajouteranimal(Perroquet())
    animalerie.ajouteranimal(Abeille())

    for (animalerie in animalerie.list){
        animalerie.quiSuisJe()
        animalerie.parler()
    }
}