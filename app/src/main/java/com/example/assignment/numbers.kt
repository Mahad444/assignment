
import kotlin.math.PI

fun main() {


    var s=Squares(5.0)
    println(s.area())
    println(s.width)
    println(s.height)

    val a=Circles(2.0)
    println( a.area())
}
interface Demos{
    abstract var height:Int
    abstract fun demoOne()
    fun demoTwo(){
        println("Demo two")
    }

}

abstract class Shape(width:Double){
    var width:Double=width
    abstract var height:Int
    abstract fun area():Double

}

//square

class Squares(width:Double):Shape(width),Demos{

    override fun area():Double {
        return this.width*this.width
    }

    override var height: Int
        get() = 45
        set(value) {}

    override fun demoOne() {
        println("demo one")
    }


}

//circle
class Circles(width:Double):Shape(width){
    override var height: Int
        get() = 545
        set(value) {}

    override fun area(): Double {
        return PI*this.width*this.width
    }

}