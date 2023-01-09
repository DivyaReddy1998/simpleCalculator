/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculatorproject;

/**
 *
 * @author SAIKUMAR CHEREDDY
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProject implements ActionListener {
    JFrame frame;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton badd,bsub,bmul,bdiv,bdec,beq,bclr;

    static double a=0,b=0,result=0;
    static char operator;

    CalculatorProject(){
        frame = new JFrame("Calculator");

        t= new JTextField();
        t.setBounds(30,40,280,30);
        Font myFont = new Font("serif", Font.BOLD,30);
        t.setFont(myFont);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdec = new JButton(".");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bclr = new JButton("AC");

        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        badd.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bsub.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bmul.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        bdiv.setBounds(250,310,50,40);

        bclr.setBounds(120, 380,70,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);

        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(badd);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bsub);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bmul);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(bdiv);
        frame.add(bclr);

        frame.add(t);


        frame.setSize(400,500);
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
          t.setText(t.getText().concat("1"));
      }
        if(e.getSource()==b2){
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3){
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4){
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5){
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6){
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7){
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8){
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9){
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0){
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdec){
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==bclr){
           t.setText(" ");
        }
        if(e.getSource()==badd){
            a=Double.parseDouble(t.getText());
            operator = '+';
            t.setText("");
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(t.getText());
            operator = '-';
            t.setText("");
        }
        if(e.getSource()==bmul){
            a=Double.parseDouble(t.getText());
            operator = '*';
            t.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t.getText());
            operator = '/';
            t.setText("");
        }
        if(e.getSource()==beq){
            b=Double.parseDouble(t.getText());
            switch(operator){
                case '+': result=a+b;
                           break;
                case '-': result=a-b;
                           break;
                case '*': result=a*b;
                          break;
                case '/': result=a/b;
                          break;
            }
            t.setText(""+result);
        }
    }

    public static void main(String[] args){
        CalculatorProject editor = new CalculatorProject();
    }
}

