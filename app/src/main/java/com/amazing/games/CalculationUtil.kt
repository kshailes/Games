package com.amazing.games

object CalculationUtil {
    private fun moveLeft(row: IntArray) {
        //2,0,2,0 => 4,0,0,0
        val n = row.size
        var j = 0
        for (i in 0 until n) {
            if (row[i] != 0) {
                row[j] = row[i]
                j++
            }
        }
        for (i in j until n) row[i] = 0
    }

    private fun leftSum(row: IntArray) {
        val n = row.size
        for (i in 1 until n) {
            if (row[i] == row[i - 1]) {
                row[i - 1] += row[i]
                row[i] = 0
            }
        }
    }

    fun shiftLeftAndAdd(row: IntArray) {
        moveLeft(row)
        leftSum(row)
        moveLeft(row)
        row.forEach { print(it) }
    }
}