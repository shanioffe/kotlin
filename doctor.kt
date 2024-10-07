import java.time.LocalDate

fun main() {
    doctor("Steve", LocalDate.of(2024, 7, 20), "high blood pressure", true, false)
    doctor("Steve", LocalDate.of(2024, 8, 20), "high blood pressure", true, true)
    doctor("Steve", LocalDate.now(), "high blood pressure", false, true)

    doctor("Brenda", LocalDate.of(2024, 7, 21), "anxiety", true, true)
    doctor("Brenda", LocalDate.now(), "anxiety", false, true)
}

fun doctor(name: String, date: LocalDate, problem: String, smoker: Boolean, healthyDiet: Boolean) {
    if(date != LocalDate.now()){
        typeWriterEffect("\nDate: $date")
        typeWriterEffect("Doctor: \"Hello $name! How can I help you today?\"")
        typeWriterEffect("$name: \"Hello doctor. I'm having a problem with $problem.\"")
        typeWriterEffect("Doctor: \"Sorry to hear that, let's find out how to fix your $problem. Are you a smoker?\"")
        if(smoker == true){
            typeWriterEffect("$name: \"Yes, doctor.\"")
            typeWriterEffect("Doctor: \"You will have to quit smoking to fix your $problem.\"")
            typeWriterEffect("$name: \"Okay, doctor.\"")
        } else {
            typeWriterEffect("$name: \"No, doctor.\"")
            typeWriterEffect("Doctor: \"Good, next question...\"")
        }
        typeWriterEffect("Doctor: \"Are you eating a healthy diet? Less alcohol, processed foods, and lots of vegetables?\"")
        if(healthyDiet == false){
            typeWriterEffect("$name: \"No, doctor.\"")
            typeWriterEffect("Doctor: \"You will have to eat healthier to fix your $problem.\"")
            typeWriterEffect("$name: \"Okay, doctor.\"")
        } else {
            typeWriterEffect("$name: \"Yes, doctor.\"")
            typeWriterEffect("Doctor: \"Good, you are on your way to recovery, $name!\"")
        }
        if(smoker == false || healthyDiet == false){
            typeWriterEffect("Doctor: \"Implement the changes I suggested and see me again later so we can see how your $problem is doing.\"")
            typeWriterEffect("$name: \"Okay, doctor.\"")
        }
    } else {
        typeWriterEffect("\nDate: $date")
        typeWriterEffect("Doctor: \"Welcome back, $name. Let's check on your $problem. Have you quit smoking and switched to a healthy diet?\"")
        if(smoker == false && healthyDiet == true) {
            typeWriterEffect("$name: \"Yes, doctor. I feel much better now.\"")
            typeWriterEffect("Doctor: \"Great news! Glad we could solve your $problem. See you next time!\"")
        } else if (healthyDiet == false) {
            typeWriterEffect("$name: \"No, doctor. It's too hard.\"")
            typeWriterEffect("Doctor: \"You need to improve your diet if you want your $problem to heal.\"")
            typeWriterEffect("$name: Okay, doctor. I'll try again.\"")
        } else if (smoker == true) {
            typeWriterEffect("$name: \"No, doctor. It's too hard.\"")
            typeWriterEffect("Doctor: \"You need to stop smoking if you want your $problem to heal.\"")
            typeWriterEffect("$name: \"Okay, doctor. I'll try again.\"")
        }
    }
}

private fun typeWriterEffect(text: String, delayMillis: Long = 25) {
    for (char in text) {
        print(char)
        Thread.sleep(delayMillis)
    }
    println()  // To move to the next line after the text finishes
}
