package com.example.testinglibraries.kotest

class TransactionRepo {
    fun getStatus(transactionId: Int): String {
        return "COMPLETE"
    }
}