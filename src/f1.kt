/**
 * Created by san on 5/20/17.
 */

class Employee(var id:String){
    var email: String = ""
    var name: String = ""

    constructor(id: String, email: String) : this(id) {
        this.email = email
    }

    constructor(id: String, name: String, email: String) : this(id,email) {
        this.name = name
    }

}
fun main(args: Array<String>){
    var tom=Employee("ID1")
    println(tom.id)

    var jake=Employee("ID2","test@test.com")
    println(jake.id)
    println(jake.email);

    var cathy=Employee("ID3","sandeep","test@test.com")
    println(cathy.id)
    println(cathy.name);
    println(cathy.email);

    var names = arrayOf("t1", "t2", "t3")

    for(name in names){
        println("my time is ${name}")

    }
}



