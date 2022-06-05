package com.example.myjob.service

class Calculator (
    private val expectedSalary: Double,
    private val expenses: Double,
    private val tax: Double,
    private val workHours: Int,
    private val weekDays: Int,
    private val daysOff: Int,
    private val is31BasedMonthDays: Boolean) {

    fun getWorkingHourValue(): Double {
        val netSalary  = expectedSalary + expenses
        val grossSalary = getGrossSalary(netSalary)
        val hoursPerMonth = getWorkingHoursPerMonth() + getHoursOffPerMonth()

        return grossSalary/hoursPerMonth
    }

    private fun getGrossSalary(netSalary: Double): Double{
        return (netSalary * 100) / (100 - tax)
    }

    private fun getWorkingHoursPerMonth(): Int {
        val week = workHours * weekDays
        var month = week * 4
        if (is31BasedMonthDays){
            month += workHours
        }
        return month
    }

    private fun getHoursOffPerMonth(): Int {
        return daysOff * 8
    }
}
