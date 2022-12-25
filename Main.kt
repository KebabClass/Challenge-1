import kotlin.system.exitProcess

fun main() {
    // User introduction.
    println("Hello, before you can purchase alcohol we need to verify your age and the country you are purchasing from.")
    println()

    // Accepted countries and the different ages for these countries.
    val allCountries = listOf("South Africa", "Germany", "USA")
    val southAfrica = 18
    val germany = 16
    val uSA = 21

    // Asking the user what country they are from.
    println("What country are you registering from: ")
    val userCountry = readln()

    // Making sure the user is from an accepted country and that they entered a valid country.
    if (userCountry.toIntOrNull() == null) {
        val country = userCountry

        if (country in allCountries) {
            println("$country is a valid location that we supply to!")

        } else {
            println("Sorry we don't supply $country,\n" +
                    "make sure your spelling is correct, if the error persists it means you are registering from a country that we don't supply.\n" +
                    "Here is a list of countries that we currently supply:")

            println()
            println(allCountries)
            println()
            exitProcess(0)
        }

    } else {
        println("Error: Invalid Country name")
        exitProcess(0)
    }


    // Asking the user how old they are.
    println("How old are you?: ")
    val userAge = readln()

    if (userAge.toIntOrNull() != null) {
        val age = userAge.toInt()

        if (userCountry == allCountries[0] && age >= southAfrica) {
            println("You are old enough to create an account!")

        } else if (userCountry == allCountries[1] && age >= germany)
            println("You are old enough to create an account!")

        else if (userCountry == allCountries[2] && age >= uSA) {
            println("You are old enough to create an account!")

        } else {
            println("Sorry you are not old enough to register an account.")
            exitProcess(0)
        }

    } else {
        println("Error: Invalid age")
        exitProcess(0)
    }


    // Gathering extra user data.
    println("Please enter your first name: ")
    val userName = readln()

    println("Please enter your email: ")
    val userEmail = readln()

    println("Hello $userName you are $userAge years old and signed up from $userCountry with the following email address $userEmail")
}
