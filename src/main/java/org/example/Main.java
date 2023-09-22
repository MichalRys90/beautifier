import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.justify("Lorem ipsum dolor sit amet, consectetur  adipiscing  elit. Vestibulum    sagittis   dolor mauris,  at  elementum  ligula tempor  eget.  In quis rhoncus nunc,  at  aliquet orci. Fusce at   dolor   sit   amet  felis suscipit   tristique.   Nam  a imperdiet   tellus.  Nulla  eu vestibulum    urna.    Vivamus tincidunt  suscipit  enim, nec ultrices   nisi  volutpat  ac. Maecenas   sit   amet  lacinia arcu,  non dictum justo. Donec sed  quam  vel  risus faucibus euismod.  Suspendisse  rhoncus rhoncus  felis  at  fermentum. Donec lorem magna, ultricies a nunc    sit    amet,   blandit fringilla  nunc. In vestibulum velit    ac    felis   rhoncus pellentesque. Mauris at tellus enim.  Aliquam eleifend tempus dapibus. Pellentesque commodo, nisi sit   amet   hendrerit fringilla,   ante  odio  porta lacus,   ut   elementum  justo nulla et dolor.", 34));
        System.out.println(Kata.justify("rbfqyfh348of3 4o31htfo1g34g814hg13h4  31 1go3 hg1f oyg8y13 g14bg13b0g b134oygfvb3ruvb1348y  b134y 8y134gvb oyo1bc gv1vy3ogv 1g4v013gv1038143gb013 41034b0 g138y04g 0134h g1374ht g01 134h g0134h t01387 h43t 013gfb801 34gb 08134hg 08134gh71834hg 01g0h7134h g1034g h1387g h107h108h 0134ht 01 t1g34tg 134gt 80g4 12 0g 0814 gt10384 gt108gt 014 g07 01748 gt018374gt 1084gt 0184 g104837gt108tg 034gt087134g t130tg 138047g t078143hfpqurhg 017h 137g103 74 g0 013gt 0 g0 1gt1 0378gt1034 gt13084gt 01437g 104 gt013478 g130847 10tg7478013gt 08137 4g1t08g 0174gt781034 gt107gt7g 078143 g10847gt 087 t104387gt 08173gt 710834 g1t0347gt01gh08731urh 780g3h 437 gg13 78f7 81313 47hf 01374hf 134h14703fh 1407hf10374fh 031h1 h14714hf 1347 h147fh13470fh 107 hg7g1 h0734hg 13740hg 017ht 17430h7 tg134708 t01374 41h3 t0gf17g83 g17g 0g1 3470gf 07138g07813 07g g1g7 t7341g10g014 gg01 t0 1 t4", 34));
    }

    public class Kata {
        public static String justify(String text, int width) {
            System.out.println(text.length());
            if (text.length() < width) {
                return text;
            }

            if (text.length() == width) {
                return text;
            }

            String[] t = text.split("\\s+");
            int spaces = 0;
            int temp = 0;
            int sum;
            int n = 0;
            String separator = "";
            String separator2 = "";
            StringBuilder stt = new StringBuilder();

            for (int i = 0; i < t.length; i++) {
                temp += t[i].length();
                if (temp + spaces > width) {
                    n = i;
                    temp -= t[i].length();
                    stt.append(separator2);
                    sum = width - temp;
                    int a;
                    for (int i1 = i - spaces; i1 < i; i1++) {
                        spaces--;
                        if (spaces != 0) {
                            a = (int) Math.ceil((double) sum / spaces);
                            stt.append(separator);
                            stt.append(t[i1]);
                            stt.append(" ".repeat(Math.max(0, a)));
                        } else {
                            a = sum;
                            stt.append(separator);
                            stt.append(t[i1]);
                        }
                        sum -= a;
                        separator2 = "\n";
                    }
                    spaces = -1;
                    temp = 0;
                    i -= 1;
                }
                spaces++;
            }
            if (n < t.length) {
                String separator3 = "";
                stt.append("\n");
                for (int i = n; i < t.length; i++) {
                    stt.append(separator3);
                    stt.append(t[i]);
                    separator3 = " ";
                }
            }
            return stt.toString();
        }
    }
}
