class Person {

    var firstName: String? = null
//        set(value) {
//            println("Setter for firstName getting invoked")
//            field = value?.toUpperCase()
//        }
//        get() {
//            println("getter for firstName getting invoked")
//
//            return field
//        }


    var lastName: String? = null
//        set(value) {
//            println("Setter for firstName getting invoked")
//            field = value
//        }
//        get() {
//            println("getter for firstName getting invoked")
//
//            return field
//        }
    var age: Int? = null
//        set(value) {
//            if(value?.compareTo(18)!!<0){
//                throw Exception("Person is Minor")
//            }else{
//                field = value
//            }
//        }

   constructor() {
    }

    constructor(fName: String, lName: String): this(){
        firstName = fName
        lastName = lName

   }
fun displayPerson(): String{
    return "${this.firstName} ${this.lastName}"
}
    fun displayPerson(param: String): Int{
        return 10
    }

    fun demoFunction(param1: String, param2: String){
        println("${param1} ${param2}")
    }

    //Expression Function
    fun isMinor():Boolean = this.age?.compareTo(18)!!<0

}


