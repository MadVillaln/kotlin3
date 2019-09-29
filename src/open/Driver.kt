package open

class Driver(name:String):Person(name){
    override val age:Int=1
    override fun getAddress():String{
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(age=$age, name=$name)"
    }


}