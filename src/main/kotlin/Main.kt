fun main() {

var x= arrayOf(circle(3),square(5))
    calculateareas(x)
}



fun calculateareas(shape:Array<shape>){
    for(i in 0 ..  shape.size-1){
        println(shape[i].area())
    }
}


open class shape(){

   open fun area():Int{
        return 0
    }
}

class circle(val radius:Int):shape(){

    override fun area():Int{
        return 3*radius*radius
    }
}


class square(val side:Int):shape() {

    override fun area(): Int {

        return side * side
    }
}