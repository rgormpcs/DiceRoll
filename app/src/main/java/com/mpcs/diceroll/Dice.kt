package com.mpcs.diceroll

class Dice (val numberSides:Int) {

    fun roll(): Int {
        return (1..numberSides).random()
    }

}
