package com.wix.wixcraft

class WixcraftGame {

  var deadCharacters: Seq[String] = Seq.empty

  def playTurn(): Unit = deadCharacters = Seq("Talya")

  def addCharacter(name: String): Unit = {}

}
