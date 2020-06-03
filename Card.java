package com.huaxia.blackjack;

public class Card {
	 
		public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE",
		"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK",
		"QUEEN", "KING"}; public String suit;
		private int face;
		//constructors
		Card()
		{
		}
		//set methods
		public void setFace(int face )
		{
			this.face = face;
		}
		//get methods
		public int getFace()
		{
			return face;
		}
		public int getValue() 
		{ return face; } // equals method
		public String getSuit () 
		{
		    return suit;
		}
		public String toString() {
		return FACES[face]+" of "+ getSuit()+getValue();
		}
		
		} 


