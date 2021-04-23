/**
 * 
 */
package com.version.ver001;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * @author user
 *
 */
public class snakeGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame("Snake Game 0.0.1");
		GamePlay gameplay = new GamePlay();
		obj.setBounds(10,10,905,700);
		obj.setResizable(false);
		obj.setBackground(Color.DARK_GRAY);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);

	}

}
