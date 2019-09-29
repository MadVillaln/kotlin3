package abstracts

open abstract class BaseTemplate {
    var count = 0
    fun a(){
        count++
        println("$count")
    }
    abstract fun minus()

}