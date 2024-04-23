/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Anh Quân
 */
public class SynchBank {
    public static void main(String[] args) {
        Bank bank = new Bank(100, 1000);
        int size = bank.size();
        for (int i = 0; i < size; i++)
        {
            TransferMoney transferMoney = new TransferMoney(bank, i, 1000);
            Thread thread = new Thread(transferMoney);
            thread.start();
        }
    }
}
