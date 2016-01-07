package com.wix.wixcraft

import com.wixpress.common.specs2.JMock
import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class WixcraftGameTest extends Specification with JMock {

  class Context extends Scope {
    val dice = mock[Dice]
    val game = new WixcraftGame(dice)

  }
  "WixcraftGame" should {
    "have no dead characters on initialization" in new Context {
      game.deadCharacters must beEmpty
    }
    
    "roll the dice for each character" in new Context {
      game.addCharacter("Ittai")
      game.addCharacter("Talya")
      checking {
        exactly(2).of(dice).roll
      }
      game.playRound()
    }

    "roll the dice for each character for 3 characters" in new Context {
      game.addCharacter("Ittai")
      game.addCharacter("Talya")
      game.addCharacter("Talya2")
      checking {
        exactly(3).of(dice).roll
      }
      game.playRound()
    }

    "return the added character name" in new Context {
      game.addCharacter("moshe")
      game.characters must beEqualTo(Seq("moshe"))
    }

    "have no characters on initialization" in new Context {
      game.characters must beEmpty
    }
  }
}
