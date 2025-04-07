package com.example.bankaccountprogram

class BankAccount(var accountHolder:String,var balance:Double)
{
    private val transctionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transctionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount:Double){
        if(amount<= balance){
            balance -= amount
            transctionHistory.add("$accountHolder withdrew $$amount")
        }
        else{
            println("you don't have the funds to withdraw $$amount")
        }

    }

    fun disaplayTransctionHistory(){
        println("Transection history for $accountHolder")
        for(transaction in transctionHistory){
            println(transaction)
        }
    }
}