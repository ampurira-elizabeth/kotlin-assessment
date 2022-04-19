fun main() {
var acc=  CurrentAccount("A1204","liz Barisi",1200000.0)
  acc.Deposit(777.0)
  acc.withdraw(2000.0)


    var x = acc.accountnumber
    var y=acc.balance
    var z=acc.accountname
    println("$x with $y is operated by $z")

    var book=product("books",43,1200,"other")
    goods(book)
    var fruits=product("orange",4,1500,"grocery")
    goods(fruits)
    var passion=product("liver",13,200,"hygien")
    goods(passion)
    var items= mutableListOf(book,fruits,passion)
    println(items)


    var str=    evenstr("banana")
    println(str)
}

open class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double) {
    fun Deposit(amount: Double) {
        balance+=amount
        println(balance)
    }

    open fun withdraw(amount: Double) {
        balance-=amount
        println(balance)
    }

    fun details() {
    }
}

class classSavingAccount( accountnumber:String, accountname:String, balance:Double,var withdrawals:Int):CurrentAccount(accountnumber,accountname, balance)

{
    override fun withdraw(amount: Double) {
        super.withdraw(amount)
    }
 }

data class product( var name:String,var weight:Int,var price:Int,var category:String)
fun goods(good:product){
    var G= mutableListOf<product>()
    when(good.category) {
        "groceries"-> println(G.plus(good))
    }

}
fun evenstr(word:String):String {
    var make=" "
    for (characters in word){
        if (word.indexOf(characters)%2==0){
            make+=characters
        }
    }
    return make
}