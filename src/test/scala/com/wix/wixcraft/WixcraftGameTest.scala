package com.wix.wixcraft

import org.specs2.mutable.Specification

class WixcraftGameTest extends Specification {

  "WixcraftGame" should {
    "have no dead characters on initialization" in {
      val game = new WixcraftGame
      game.deadCharacters must beEmpty
    }
  }
}
