

 fun main(){

     dragging(arrayOf(circle3(6),square3(5),triangle3(4,7),player("fenil")))

 }



    //problem is that we need to create an class structure for an application in which there are three shapes
    //circle square and triangle which the user will choose and drag it so our app should show shape been draged and the player name.
    //we would solve it by using an interface

 //output -> circle area is 36 and it is dragging and player name is fenil

 fun dragging(x:Array<dragging>){
     for(i in x){
       i.drag()
     }
 }

 //here we are passing an array which is having the objects who are implementing the dragging interface so whenever we would call the dragging
 //method and pass those objects inside the dragging method who are implementing the dragging interface then it would call the drag function for those
 //objects.
  interface dragging{
      fun drag()

  }


    //now as we want all the child classes of shape3 should use the drag function


    abstract class shape3():dragging{

        abstract fun area():Int

    // funtion which would be overriden by the other child classes:
    }


    class circle3(val radius:Int):shape3(){

        override fun area(): Int {
            return  3*radius*radius
        }
        override fun drag() {
            println("circle is dragging")
        }
    }


    class square3(val side:Int):shape3(){


        override fun area(): Int {
            return side*side
        }
        override fun drag() {
            println("square is dragging")
        }
    }

    class triangle3(val width:Int,val height:Int):shape3(){

        override fun area(): Int {
            return width*height
        }
        override fun drag() {
            println("triangle is dragging")
        }
    }

    //now we have the area for the different shapes now we need a player class which would give the player name and call a function
    //called as dragging.now we would basically create an interface above the shape3 class and create a method call dragging.

   //see the problem is that if we need a player class which should call the drag function like saying the particular player name who
 //is dragging the shapes but if we see that if we create a class player and inherit that class from the abstract class shape3 so we have to implement
 //the abstract methods present in the shape3 class.

 //now what is the point for this interface we know our app is showing which shape is been dragged okay so the drag method is also been used by the
 //child classes of shape3 class and also we want that the player class should also use the drag function and show that particular player is dragging it.
 //so here the drag function is common between multiple classes and to avoid implementing unusefull methods we created an interface and use that to
 //implement the drag function.

 class player(val name:String):dragging{
     override fun drag() {
         println("$name is dragging")
     }
 }



 //now as the shape3 class consist of an area method



