package com.auth.gr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Words {
    private int lives, win = 0, lose = 0;
    private int lostLives = 0;
    private final ArrayList<String> words = new ArrayList<String>();
    private static final String WORDS_PATH = "C:\\Users\\geopasx\\Desktop\\test.txt";

    public Words() {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(WORDS_PATH)));
            int counter = 0;
            while (s.hasNextLine()) {

                String word = s.next();
                StringTokenizer st = new StringTokenizer(word, "!#$%^&*().:[]/{}?123456789");
                String correctWord = st.nextToken().trim();

                if (correctWord.length() >= 4) {
                    if (counter == 0) {
                        words.add(correctWord);
                        counter++;
                    } else {
                        boolean add = true;
                        for (String value : words) {
                            if (value.equals(correctWord)) {
                                add = false;
                                break;
                            }
                        }
                        if (add) {
                            words.add(correctWord);
                            counter++;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (NumberFormatException e) {
            System.out.println("Grade must be an integer !");
        }

    }

    public void PrintWords() {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getLives() {
        return lives;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getLostlives() {
        return lostLives;
    }

    public void setLostlives(int lostlives) {
        this.lostLives = lostlives;
    }
}
