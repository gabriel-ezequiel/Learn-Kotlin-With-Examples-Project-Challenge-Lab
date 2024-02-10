// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASIC, INTERMEDIATE, ADVANCED }

data class User(val registration: String, val name: String, val email: String)

data class EducationalContent(var name: String, val level: Level, val duration: Int = 60)

data class Training(val name: String, var contents: List<EducationalContent>) {

    val enrolled: MutableList<User> = mutableListOf<User>()
    val trainingHours: Int get() = contents.sumBy { it.duration }
    
    fun enroll(vararg user: User) {
        enrolled.addAll(user)
    }
}

fun main() {
    val user1 = User("123", "John", "john@example.com")
    val user2 = User("456", "Mary", "mary@example.com")
    val user3 = User("789", "Joseph", "joseph@example.com")
    val user4 = User("101", "Anna", "anna@example.com")
    val user5 = User("112", "Charles", "charles@example.com")

    val content1 = EducationalContent("Basic Kotlin", Level.BASIC, 10)
    val content2 = EducationalContent("Intermediate Kotlin", Level.INTERMEDIATE, 15)
    val content3 = EducationalContent("Advanced Kotlin", Level.ADVANCED, 25)

    val content4 = EducationalContent("Basic Java", Level.BASIC, 20)
    val content5 = EducationalContent("Intermediate Java", Level.INTERMEDIATE, 25)
    val content6 = EducationalContent("Advanced Java", Level.ADVANCED, 30)

    val content7 = EducationalContent("Basic Spring", Level.BASIC, 5)
    val content8 = EducationalContent("Intermediate Spring", Level.INTERMEDIATE, 10)
    val content9 = EducationalContent("Advanced Spring", Level.ADVANCED, 20)

    val training1 = Training("Kotlin", listOf(content1, content2, content3))
    val training2 = Training("Java", listOf(content4, content5, content6))
    val training3 = Training("Spring", listOf(content7, content8, content9))

    training1.enroll(user1, user2, user3)
    training2.enroll(user4, user5)

    // training 1
    println("Training: ${training1.name}")
    println("Enrolled: ${training1.enrolled}")
    println("Contents: ${training1.contents}")
    println("Training hours: ${training1.trainingHours}")
    println("---------------------------------")

    // training 2
    println("Training: ${training2.name}")
    println("Enrolled: ${training2.enrolled}")
    println("Contents: ${training2.contents}")
    println("Training hours: ${training2.trainingHours}")
    println("---------------------------------")

    // training 3
    println("Training: ${training3.name}")
    println("Enrolled: ${training3.enrolled}")
    println("Contents: ${training3.contents}")
    println("Training hours: ${training3.trainingHours}")
    println("---------------------------------")
}
