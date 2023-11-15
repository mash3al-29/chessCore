/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chesscore;

import com.mycompany.chesscore.Square;
import com.mycompany.chesscore.constants.Letter;

/**
 *
 * @author omara
 */
public class ChessBoard {
    public Square[][] board = new Square[8][8];
    public ChessBoard()
    {
        for (int number = 1; number <= 8; number++)
        {
            for (Letter letter : Letter.values())
            {
                board[number - 1][letter.ordinal()] = new Square(number, letter);
            }
        }
    }
}