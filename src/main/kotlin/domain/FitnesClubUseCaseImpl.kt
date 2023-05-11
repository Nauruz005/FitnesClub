package domain

import model.Client

class FitnesClubUseCaseImpl(private val repository: FitnesClubRepository): FitnesClubUseCase {

//Ищет клиента по его id
    override fun getClientId(id: Int): Client? = repository.getClients().find { it.id == id }

//Высчитывает общую стоимость всех купленных абонементов
    override fun getAllPriceOfSoldTicket(): Int = repository.getTickets().sumOf { it.price }
}