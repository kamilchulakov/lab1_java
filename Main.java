/*
 * Main.java
 *
 * Copyright 2020 Kamil Chulakov
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


class Main{
    public static void main(String[] args){

        short[] i = new short[9];
        short i_n = 23;

        // Getting massive i of {23, 21, ... ,7}
        for(int j = 0; j < 9; j++)
        {
            i[j] = i_n;
            i_n -= 2.0;
        }

        double[] x = new double[12];

        // Getting massive x of 12 random nums in range [-3; 3]
        for(int j = 0; j < 12; j++){
            x[j] = (Math.random() * 6.0) - 3.0;
            System.out.print(x[j]);
        }
        System.out.println();

        double[][] d = new double [9][12];

        // Getting massive d
        for(int j = 0; j < 9; j++){
            for(int k = 0; k < 12; k++){
                if(i[j] == 17){
                    d[j][k] = Math.pow((3.0 / 4.0) * ((Math.asin(x[k]/6) - 1.0)), Math.cos(Math.pow(x[k], 2.0 / (3.0 * (x[k] - 1.0/3.0)))));
                }
                else if (i[j] == 13 || i[j] == 7 || i[j] == 19 || i[j] == 23) {
                    d[j][k] = Math.sin(Math.log((Math.PI/ 2.0) / (5.0 + Math.abs(x[k]))));
                }
                else{
                    d[j][k] = Math.log(2.0 * Math.pow(Math.E, 2.0 * Math.log(Math.abs(x[k]))));
                }
            }
        }

        //Printing d
        for(int j = 0; j < 9; j++){
            for(int k = 0; k < 12; k++){
                double data = Math.round(d[j][k]*10000.0)/ 10000.0 ;
                if (data < 0) System.out.print(" ");
                else System.out.print("  ");
                System.out.printf("%.4f ", data);
            }
            System.out.println();
        }
    }
}