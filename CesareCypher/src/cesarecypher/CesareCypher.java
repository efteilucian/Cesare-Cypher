/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesarecypher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eftei.lucian
 */
public class CesareCypher {

    public static String Encrypt(ArrayList<Character> alfb, ArrayList<Character> caratteriEsclusi, char messaggio[],int spostamento){
        int indiceC;
        Character criptato;
        String nuovoMsg= "";
        for (int i=0; i< messaggio.length; i++){

            if(!caratteriEsclusi.contains((Character)messaggio[i]) )
            {
                indiceC=alfb.indexOf((Character)messaggio[i]);
                indiceC +=spostamento;
                indiceC= indiceC%26;
                criptato= alfb.get(indiceC);
                nuovoMsg += criptato;
            }else
            {
                nuovoMsg += messaggio[i];
            }
        }
        
        return  "Crypted msg : " + nuovoMsg;
    }
    
    /* public static String Decrypt(ArrayList<Character> alfb, ArrayList<Character> caratteriEsclusi, char messaggio[],int spostamento){
        int indiceC;
        Character criptato;
        String nuovoMsg= "";
        for (int i=0; i< messaggio.length;i++){
        
            
            if(!caratteriEsclusi.contains((Character)messaggio[i]) )
            {
                indiceC=alfb.indexOf((Character)messaggio[i-1]);
                indiceC +=spostamento;
                indiceC= indiceC%26;
                criptato= alfb.get(indiceC);
                nuovoMsg += criptato;
            }else
            {
                nuovoMsg += messaggio[i-1];
            }
        }
        
        return  "Il msg decriptato : " + nuovoMsg;
    }
    */
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String msgCifrato;
       String msgDecifrato;
        ArrayList<Character> alfb = new ArrayList<Character>();
        ArrayList<Character> caratteriEsclusi = new ArrayList<Character>();
        Collections.addAll(alfb, 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        Collections.addAll(caratteriEsclusi, ' ',',','.',';','!','?','à','è','é','ì','ò','ù',':','-','_','@','+','-','*','/','\\','€','0','1','2','3','4','5','6','7','8','9','=','\'');
        System.out.println("Insert text");
        msgDecifrato = sc.nextLine().toUpperCase();
        System.out.println("Insert shift number");
       int spostamento = sc.nextInt();
       char messaggio[] = msgDecifrato.toCharArray();
       
        System.out.println(Encrypt(alfb, caratteriEsclusi, messaggio, spostamento));
        //System.out.println(Decrypt(alfb, caratteriEsclusi, messaggio, spostamento));
        
        
        
         
        
       
    }
    
}
