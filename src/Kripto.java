import java.util.Scanner;
import java.util.ArrayList;
public class Kripto {
    public static void main(String [] args) {
        boolean x=false;
        System.out.println("Enter String : ");
        do {
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);
            String	string = input.nextLine();
            string = string.toUpperCase();
            Character[] str=new Character[string.length()];
            for(int i = 0 ; i< string.length();i++) {
                str[i]=string.charAt(i);
            }
            for(int i = 0 ; i < str.length ; i++) {
                if(str[i]=='A') {
                    str[i]='S';
                    continue;
                }if(str[i]=='B') {
                    str[i]='G';
                    continue;
                }if(str[i]=='C') {
                    str[i]='H';
                    continue;
                }if(str[i]=='Ç') {
                    str[i]='C';
                    continue;
                }if(str[i]=='D') {
                    str[i]='�';
                    continue;
                }if(str[i]=='E') {
                    str[i]='�';
                    continue;
                }if(str[i]=='F') {
                    str[i]='�';
                    continue;
                }if(str[i]=='G') {
                    str[i]='�';
                    continue;
                }if(str[i]=='�') {
                    str[i]='O';
                    continue;
                }if(str[i]=='H') {
                    str[i]='T';
                    continue;
                }if(str[i]=='I') {
                    str[i]='R';
                    continue;
                }if(str[i]=='�') {
                    str[i]='P';
                    continue;
                }if(str[i]=='J') {
                    str[i]='U';
                    continue;
                }if(str[i]=='K') {
                    str[i]='�';
                    continue;
                }if(str[i]=='L') {
                    str[i]='V';
                    continue;
                }if(str[i]=='M') {
                    str[i]='I';
                    continue;
                }if(str[i]=='N') {
                    str[i]='�';
                    continue;
                }if(str[i]=='O') {
                    str[i]='Y';
                    continue;
                }if(str[i]=='�') {
                    str[i]='Z';
                    continue;
                }if(str[i]=='P') {
                    str[i]='F';
                    continue;
                }if(str[i]=='R') {
                    str[i]='A';
                    continue;
                }if(str[i]=='S') {
                    str[i]='N';
                    continue;
                }if(str[i]=='�') {
                    str[i]='M';
                    continue;
                }if(str[i]=='T') {
                    str[i]='P';
                    continue;
                }if(str[i]=='U') {
                    str[i]='J';
                    continue;
                }if(str[i]=='�') {
                    str[i]='K';
                    continue;
                }if(str[i]=='V') {
                    str[i]='L';
                    continue;
                }if(str[i]=='Y') {
                    str[i]='D';
                    continue;
                }if(str[i]=='Z') {
                    str[i]='E';
                    continue;
                }if(str[i]=='W') {
                    str[i]='Q';
                    continue;
                }if(str[i]=='Q') {
                    str[i]='W';
                    continue;
                }if(str[i]=='X') {
                    str[i]='B';
                    continue;
                }
            }
            for(int J = 0 ; J<str.length;J++)
                System.out.print(str[J]+"*");
            System.out.println();
        }


        while(x==false);

    }
}


