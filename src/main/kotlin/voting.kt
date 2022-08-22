

fun main(){

    val x= arrayOf(human(15),human(25),human(85))
    check(x)

}

fun check(human:Array<human>){
    for(i in human){
        println(i.check())
    }
}


open class human(val age:Int){

    open fun check():Boolean{
      return age>=18
    }
}


