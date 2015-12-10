package com.wix.wixcraft

import org.specs2.mutable.Specification

class WixcraftTest extends Specification {

  "Game" should {
    "allow a character to kill another character" in {
      val game = new WixcraftGame
      game.addCharacter("Ittai")
      game.addCharacter("Talya")
      game.playTurn()
      game.deadCharacters aka "Dead characters" must contain(exactly("Talya"))
    }


  }


}
