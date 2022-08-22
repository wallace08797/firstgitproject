


fun main(){

val sq=square1(5)
    println(sq.name)
    println(sq.area())

}

abstract class shape1(){

    abstract var name:String
    //declare this property as abstract as for now what would be the name of the shape we do not know so let the child
    //classes define it
    abstract fun area():Int
    //similary the shape is not specified so decalre the area function as an abstract function.

}


class square1(val side:Int):shape1(){

    override var name="square"
// here just we override the name property and give it the name as square as the name of the shape would be square so this is how abstract keyword
    //works
    override fun area(): Int {
        return side*side
    }

    //similarly in the shape class we did not knew that what would be the body for the area function so we made it abstract and now
    //in the square class we know that the area of the shape so we can define the function in sqaure class which is a sub class for shape class


}