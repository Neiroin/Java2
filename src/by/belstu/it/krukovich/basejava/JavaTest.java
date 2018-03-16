package by.belstu.it.krukovich.basejava;
import java.util.Objects;

import static java.lang.Math.*;

public class JavaTest {




    static int sint;
    public final int firstconst=45;
    public static final int secondconst=56;
    public static void main(String[] args) {
        char c='f';
        int i=15;
        short s=4;
        byte b=3;
        long l=400;
        boolean bol=true;
        double d=54.3;
        String s1="hello";
        String s2="hello";
        String s3="hello";
        s1=s1+i;
        System.out.println("String+int: "+s1);
        s2+=c;
        System.out.println("short+char: "+s2);
        s3+=d;
        System.out.println("short+double: "+s3);
        b+=i;
        System.out.println("bool+int: "+b);
        int i2;
        //i2=d+l;
        long l2=i +2147483647;
        System.out.println("i+2147483647: "+l2);
        System.out.println("static int: "+sint);
        boolean bol2=false;
        boolean bol3=bol &&bol2;
        System.out.println("bool&&bool: "+bol3);
        boolean bol4=bol^bol2;
        System.out.println("bool^bool: "+bol4);
        //boolean bol4=bol+bol2;
        long l4=9223372036854775807L;
        long l5=0x7fff_ffff_fffL;
        char ch1='a';
        char ch2='\u0061';
        char ch3=97;
        int chres=ch1+ch2+ch3;
        System.out.println("char sum: "+chres);
        double dob=3.45%2.4;
        System.out.println("3.45%2.4: "+dob);
        double dob2=1.0/0.0;
        System.out.println("1.0/0.0: "+dob2);
        double dob3=Math.log(-345);
        System.out.println("log(-345): "+dob3);
        System.out.println("Float.intBitsToFloat(0x7F800000): "+Float.intBitsToFloat(0x7F800000));
        System.out.println("Float.intBitsToFloat(0xFF800000): "+Float.intBitsToFloat(0xFF800000));
        double pi=Math.PI;
        double e=Math.E;
        System.out.println("Math: "+pi);
        System.out.println(e);
        System.out.println(Math.round(pi));
        System.out.println(Math.round(e));
        System.out.println(Math.min(e,pi));
        System.out.println(Math.random());
        Boolean Bol=false;
        Integer In=456;
        Integer In2=43;
        Character Ch=3;
        Long Lo=423523132L;
        Double Do=45.21314;
        Integer Inres=Ch+In2;
        System.out.println("Charecter+Integer: "+Inres);
        Boolean Bolres=Bol&Bol;
        System.out.println("Bol&Bol: "+Bolres);
        System.out.println("Long/double minx max: "+Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        Integer obj1=10;
        int in1=obj1;
        Byte obj2=10;
        byte bt1=obj2;
        System.out.println("Integer.parseInt: "+Integer.parseInt("3"));
        System.out.println("Integer.toHexString: "+Integer.toHexString(15));
        System.out.println("Integer.compare: "+Integer.compare(4,8));
        System.out.println("Integer.toString: "+Integer.toString(56));
        System.out.println("Integer.toString: "+Integer.bitCount(4));
        String s34="2345";
        System.out.println("valueof: "+String.valueOf(s34));
        System.out.println("parse: "+Integer.parseInt(s34));
        byte[] byteArray=s34.getBytes();
        System.out.println("ByteArray: "+byteArray);
        String string= new String(byteArray);
        System.out.println("ByteArray to String: "+string);
        System.out.println("String to Boolean: "+s34.valueOf(false));
        System.out.println("String to Boolean: "+Boolean.parseBoolean(s34));
        String string1=new String("mystring");
        String string2=new String("mystring");
        System.out.println("string==string: "+string1==string2);
        System.out.println("string compareTo: "+string1.compareTo(string2));
        System.out.println("string equals: "+string1.equals(string2));
        System.out.println("Split:");
        String str= new String("Hello my name is.");
        for (String retval : str.split(" "))
        {
            System.out.println(retval);
        }
        System.out.println("hashcode: "+str.hashCode());
        System.out.println("length: "+str.length());
        System.out.println("indexOf: "+str.indexOf('y'));
        System.out.println("contains: "+str.contains("llo"));
        char [][] c1;
        char[] c2[];
        char c3[][];
        c1= new char[3][];
        c1[0]=new char[1];
        c1[1]=new char[2];
        c1[2]=new char[3];
        System.out.println("Length of arrays: "+c1.length+" "+c1[0].length+" "+c1[1].length+" "+c1[2].length);
        System.out.println("Array: ");
        for(char ch[]: c1) {
            System.out.println(ch);
        }
        /** @author Nikita
         * @version 1.3.15
         * @param
         * @return Formatted address
         * @throws
         * @value c
         * @see c
         *
         */
    }
}

