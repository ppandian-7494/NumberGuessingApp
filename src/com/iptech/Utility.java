package com.iptech;

import java.util.Random;

public class Utility {
	int getRandomNum(int max) {
		Random random = new Random();
		return random.nextInt(max) + 1;
	}

}
