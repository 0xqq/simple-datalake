package thbaymet.github.io

import thbaymet.github.io.providers.DataProvider

class SimpleDatalake {
  val getProjectName: String = "SimpleDatalake"

}

object SimpleDatalake extends scala.App {
  println("Welcome to SimpleDatalake project.")

  val customers = DataProvider.getCustomers
  customers.foreach(println)

  val agreements = DataProvider.getAgreements
  agreements.foreach(println)

}
