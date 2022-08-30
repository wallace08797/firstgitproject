
//type checking on objects is done to check what is the type of the particular object.
//smart casting basically means to automatically cast the object or change the object to typed it belongs to.

//now type checking basically is helpfull when there are n number of objects or we can say when there is an array of objects
//so from those we can identify the particular type of object we want and execute some properties or functionalites that belong to that function.

fun main(){
    val obj1=volleyballathelte()
    val obj2=cricketathelete()


    val arr= arrayOf(obj2,obj1)
    //now as we can see the type for arr would be  Array<volleyballathelte> now as soon as we pass obj2 so the type of arr would change to
    //val arr: Array<athelete> as both the classes are child classes of athelete.so this is the example of smart casting.

    //now lets use it both type checking and smart casting.
//now the sceneraio is we have a super class athelete and two child classes cricketathelete and volleyballathelete okay
    //so now cricketathelete have a intro method and a hitsix method and same volleyball class has intro and smash method.
    // now we have 2 objects so we created an array above and the below code we are traversing it and using type checking and smart casting.

    for(obj in arr){

        if(obj is volleyballathelte){
            //this code basically checks the type of obj if it is like volleyballathelete object then we can call the intro and smash method
            //if we are like just using the object without type checking then we would not be able to access the smash and hitsix methods as
            //both the methods are explicitly defined in two separate classes.
            //so as the obj is type checked for volleyballathelete class then we can  access the smash method.
            obj.intro()
            obj.smash()
        }
        else{

            //force casting or manual casting
            //now as here we only have two objects so if first object is checked for the object of volleyballathelete class then it is obvious
            //that the second object would be of cricketathelete class so here we just manual cast it to cricketathelete object by using
            //the as operator. and used the hitsix method.
            (obj as cricketathelete).intro()
            obj.hitsix()
        }

    }



}


 abstract class athelete{

    abstract fun intro()

}



 class volleyballathelte():athelete(){

     override fun intro() {
         println("i am a volleyball athelte")
     }

     fun smash(){
         println("i am smashing volleyball")
     }
 }

 class cricketathelete():athelete(){
     override fun intro() {
         println("i am a cricket athelete")
     }
     fun hitsix(){
         println("i am hitting a six")
     }
 }


//type checking and smart casting is very much helpfull when we have n number of different objects and we want to access different properties
//of different objects. so to do that we need to know what is the type of that particular object that would be handled by type checking and once
//we get the type smart cast would automatically cast into the identified type and we could access the properties of that object.


//output of the code above
//i am a cricket athelete
//i am hitting a six
//i am a volleyball athelte
//i am smashing volleyball