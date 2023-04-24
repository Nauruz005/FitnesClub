package domain

import model.Client

interface FitnesClubUseCase {
    fun getClientId(id: Int): Client?
    fun getAllPriceOfSoldTicket(): Int
}