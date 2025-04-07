package com.example.bankaccountprogram

fun main(){
    val denisesBankAccount = BankAccount("Denis Panjuta",1343.2)
    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(1200.0)
    denisesBankAccount.deposit(20000.0)
    denisesBankAccount.deposit(3000.0)
    denisesBankAccount.deposit(3333.15)
    denisesBankAccount.disaplayTransctionHistory()
    println("${denisesBankAccount.accountHolder}'s balance is ${denisesBankAccount.balance}")
}