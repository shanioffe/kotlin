fun main() {
    println("Hello world!")

    // vals are constant, vars are mutable
    val firstName: String = "Shannon"
    var weight = 120
    val isKotlin: Boolean = true

    // concatenation
    val combined = firstName + weight
    println(combined)

    // strings!
    val string = "KOTLIN"
    println(string[0])
    println(string[1])
    println(string.isEmpty())
    println(string.length)
    println(string.substring(2, 4))
    println("The string is $string") //string interpolation

    // conditionals
    val examScore = 88
    if(examScore > 70) {
        println("You passed!")
    } else {
        println("You failed :(")
    }

    // collections
    val namesConst = listOf("Shannon", "Carson", "Everly", "Samara")
    val names = mutableListOf<String>("Shannon", "Carson", "Everly", "Samara")
    names.add("Murray")

    // loops
    for(name in names) {
        println(name)
    }
    for(i in 1..5){
        println(i)
    }
    for(i in 5 until 10){
        println(i)
    }

    // functinos
    foo("Shannon")

    // nullable strings
    var instagramBio: String? = null
    instagramBio = "this is me!"
    if (instagramBio != null) {
        println(instagramBio.toUpperCase())
    }

    //shorthand^ =>>>
    println(instagramBio?.toUpperCase())
}

// functions
private fun foo(name: String) {
    println("hello, $name")
}
