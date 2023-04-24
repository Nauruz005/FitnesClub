package ui

import domain.FitnesClubUseCase

class FitnesClubAdapter(private val fitnesClubUseCase: FitnesClubUseCase) {
    fun PrintInfoClientById(id: Int) {
        val client = fitnesClubUseCase.getClientId(id)
        if (client != null) {
            println("Имя клиента: ${client.name}, его(её) id: ${client.id}")
        }
    }
    fun PrintInfoAllPriceOfSoldTicket(){
        val ticket = fitnesClubUseCase.getAllPriceOfSoldTicket()
        println("Общая стоимость всех абонементов равна ${ticket}")
    }
}