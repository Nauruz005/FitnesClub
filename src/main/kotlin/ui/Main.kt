import data.sourse.FitnesClubDataSourseImpl
import ui.DI

fun main(){
val  adapter = DI.createFitnesClubAdapter()
    println(adapter.PrintInfoClientById(1))
    println(adapter.PrintInfoClientById(5))
    println(adapter.PrintInfoAllPriceOfSoldTicket())
}