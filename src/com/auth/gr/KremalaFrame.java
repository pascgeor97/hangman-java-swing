package com.auth.gr;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KremalaFrame extends JFrame {

    private final JButton easy, medium, hard;
    private final JButton newGame, continueExiGame;
    private final JButton A, B, C, D, E, Z, H, TH, I, K, L, M, N, KS, O, P, R, S, T, Y, F, X, PS, W, New_Word;
    private final JPanel panel1, panel2, panel3;
    private final JTextField score, lives, hidenWord, wrongLetters;
    private final Words words;

    public KremalaFrame(Words someWords) {
        words = someWords;
        easy = new JButton("EASY");
        medium = new JButton("MEDIUM");
        hard = new JButton("HARD");
        newGame = new JButton("New Game");
        continueExiGame = new JButton("Continue Existing Game");
        New_Word = new JButton("Νεο");
        score = new JTextField(3);
        lives = new JTextField(3);
        hidenWord = new JTextField(30);
        wrongLetters = new JTextField(30);

        A = new JButton("Α");
        B = new JButton("Β");
        C = new JButton("Γ");
        D = new JButton("Δ");
        E = new JButton("Ε");
        Z = new JButton("Ζ");
        H = new JButton("Η");
        TH = new JButton("Θ");
        I = new JButton("Ι");
        K = new JButton("Κ");
        L = new JButton("Λ");
        M = new JButton("Μ");
        N = new JButton("Ν");
        KS = new JButton("Ξ");
        O = new JButton("Ο");
        P = new JButton("Π");
        R = new JButton("Ρ");
        S = new JButton("Σ");
        T = new JButton("Τ");
        Y = new JButton("Υ");
        F = new JButton("Φ");
        X = new JButton("Χ");
        PS = new JButton("Ψ");
        W = new JButton("Ω");

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        ButtonListener listener = new ButtonListener();
        easy.addActionListener(listener);
        medium.addActionListener(listener);
        hard.addActionListener(listener);

        GridLayout grid = new GridLayout(3, 3);
        panel1.setLayout(grid);

        panel1.add(easy);
        panel1.add(medium);
        panel1.add(hard);

        GridLayout grid2 = new GridLayout();
        panel2.setLayout(grid2);

        newGame.addActionListener(listener);
        continueExiGame.addActionListener(listener);

        panel2.add(newGame);
        panel2.add(continueExiGame);

        FlowLayout flow = new FlowLayout();
        panel3.setLayout(flow);

        A.addActionListener(listener);
        B.addActionListener(listener);
        C.addActionListener(listener);
        D.addActionListener(listener);
        E.addActionListener(listener);
        Z.addActionListener(listener);
        H.addActionListener(listener);
        TH.addActionListener(listener);
        I.addActionListener(listener);
        K.addActionListener(listener);
        L.addActionListener(listener);
        M.addActionListener(listener);
        N.addActionListener(listener);
        KS.addActionListener(listener);
        O.addActionListener(listener);
        P.addActionListener(listener);
        R.addActionListener(listener);
        S.addActionListener(listener);
        T.addActionListener(listener);
        Y.addActionListener(listener);
        F.addActionListener(listener);
        X.addActionListener(listener);
        PS.addActionListener(listener);
        W.addActionListener(listener);

        this.setContentPane(panel1);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kremala");
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == easy || e.getSource() == medium || e.getSource() == hard) {
                getContentPane().removeAll();
                getContentPane().add(panel2);
                repaint();
                printAll(getGraphics());
                if (e.getSource() == easy) {
                    words.setLives(8);
                }
                if (e.getSource() == medium) {
                    words.setLives(6);
                }
                if (e.getSource() == hard) {
                    words.setLives(4);
                }
            }
            if (e.getSource() == newGame || e.getSource() == continueExiGame) {
                if (e.getSource() == newGame) {
                    words.setLostlives(0);
                    words.setLose(0);
                    words.setWin(0);
                }

                panel3.add(new Label("Σκορ:"));
                panel3.add(score);
                score.setText(words.getWin() + "-" + words.getLose());
                panel3.add(hidenWord);
                panel3.add(new Label("Ζωες(" + words.getLives() + "):"));
                panel3.add(lives);
                lives.setText(words.getLostlives() + " ");
                panel3.add(wrongLetters);
                panel3.add(New_Word);
                panel3.add(A);
                panel3.add(B);
                panel3.add(C);
                panel3.add(D);
                panel3.add(E);
                panel3.add(Z);
                panel3.add(H);
                panel3.add(TH);
                panel3.add(I);
                panel3.add(K);
                panel3.add(L);
                panel3.add(M);
                panel3.add(N);
                panel3.add(KS);
                panel3.add(O);
                panel3.add(P);
                panel3.add(R);
                panel3.add(S);
                panel3.add(T);
                panel3.add(Y);
                panel3.add(F);
                panel3.add(X);
                panel3.add(PS);
                panel3.add(W);
                getContentPane().removeAll();
                getContentPane().add(panel3);
                repaint();
                printAll(getGraphics());
            }
        }
    }
}
