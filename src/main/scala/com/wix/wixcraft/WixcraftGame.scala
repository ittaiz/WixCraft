package com.wix.wixcraft

trait Dice {
  def roll: Int
}

class RealDice extends Dice {
  override def roll: Int = ???
}

class WixcraftGame(dice: Dice = new RealDice) {
  var characters = Seq.empty[String]


  var deadCharacters: Seq[String] = Seq.empty

  def playRound(): Unit = deadCharacters = {
    characters.foreach(_ => dice.roll)
    Seq("Talya")
  }

  def addCharacter(name: String): Unit = {
    characters = characters :+ name
  }

}
