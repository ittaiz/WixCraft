package com.wix.wixcraft

import org.specs2.mutable.Specification

class WixcraftTest extends Specification {

  "Game" should {
    "allow a character to kill another character" in {
      val fakeDice = new Dice {
        val ValueThatKillsACharacter = 6
        override def roll: Int = ValueThatKillsACharacter
      }
      val game = new WixcraftGame(fakeDice)
      game.addCharacter("Ittai")
      game.addCharacter("Talya")
      game.playRound()
      game.deadCharacters aka "Dead characters" must contain(exactly("Talya"))
    }


  }


}
