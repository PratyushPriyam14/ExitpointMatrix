import java.io.*;
import java.util.*;
public class ExitPointMatrix
{
    public static void main(String []args)throws Exception {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            } System.out.println();
        }
        //According to question we have to change or direction to 90' right when there is 1 .If there is 0 keep moving in same direction
        int dir = 0; // direction may be 0,1,2,,3 (0=east,1=south,2=west,3=north).
        int i = 0;//row
        int j = 0;//column
        while (true) {
            dir = (dir + arr[i][j]) % 4; // direction should be less than 4 and where we have to change the direction.

            if (dir == 0) {  //east:- when we are moving in east then (row is fixed but column++  increase)
                j++;
            } else if (dir == 1) { //south:-when we are moving in south then (column is fixed but row++  increase)
                i++;
            } else if (dir == 2) { //west:-when we are moving in west then (row is fixed but column--  decrease)
                j--;
            } else if (dir == 3) { //north:-when we are moving in north then (column is fixed but row-- decrease)
                i--;
            }
            //exit point concept:-
            if (i < 0) {
                i++;
                break;
            }
            else if(j<0){
            j++;
            break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
