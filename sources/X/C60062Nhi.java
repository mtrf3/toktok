package X;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS63S0000000_10;
import kotlin.jvm.internal.IDqS82S0000000_10;
import ujb.o;

/* renamed from: X.Nhi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60062Nhi {
    public static final C113444cm LIZ;
    public static final C113444cm LIZIZ;
    public static final C113444cm LIZJ;
    public static final C113444cm LIZLLL;
    public static final java.util.Map<String, String> LJ;

    static {
        C113444cm c113444cm = new C113444cm(C59439NUl.class);
        LIZ = c113444cm;
        C113444cm c113444cm2 = new C113444cm(EnumC60068Nho.class);
        C113444cm c113444cm3 = new C113444cm(EnumC59901Nf7.class);
        LIZIZ = c113444cm3;
        C113444cm c113444cm4 = new C113444cm(EnumC60063Nhj.class);
        LIZJ = c113444cm4;
        C113444cm c113444cm5 = new C113444cm(EnumC60066Nhm.class);
        LIZLLL = c113444cm5;
        c113444cm.LIZLLL(android.net.Uri.class, new AqS63S0000000_10(7));
        c113444cm.LIZJ(Uri.Builder.class, new IDqS82S0000000_10(7));
        c113444cm2.LIZLLL(android.net.Uri.class, new AqS63S0000000_10(8));
        c113444cm2.LIZJ(Uri.Builder.class, new IDqS82S0000000_10(8));
        c113444cm3.LIZLLL(android.net.Uri.class, new AqS63S0000000_10(9));
        c113444cm3.LIZJ(Uri.Builder.class, new IDqS82S0000000_10(9));
        c113444cm4.LIZLLL(android.net.Uri.class, new AqS63S0000000_10(10));
        c113444cm4.LIZJ(Uri.Builder.class, new IDqS82S0000000_10(11));
        c113444cm5.LIZLLL(android.net.Uri.class, new AqS63S0000000_10(12));
        c113444cm5.LIZJ(Uri.Builder.class, new IDqS82S0000000_10(6));
        c113444cm.LIZLLL(java.util.Map.class, new AqS63S0000000_10(2));
        c113444cm.LIZJ(java.util.Map.class, new IDqS82S0000000_10(2));
        c113444cm2.LIZLLL(java.util.Map.class, new AqS63S0000000_10(3));
        c113444cm2.LIZJ(java.util.Map.class, new IDqS82S0000000_10(3));
        c113444cm3.LIZLLL(java.util.Map.class, new AqS63S0000000_10(4));
        c113444cm3.LIZJ(java.util.Map.class, new IDqS82S0000000_10(4));
        c113444cm4.LIZLLL(java.util.Map.class, new AqS63S0000000_10(5));
        c113444cm4.LIZJ(java.util.Map.class, new IDqS82S0000000_10(5));
        c113444cm5.LIZLLL(java.util.Map.class, new AqS63S0000000_10(6));
        c113444cm5.LIZJ(java.util.Map.class, new IDqS82S0000000_10(1));
        c113444cm.LIZLLL(Bundle.class, new AqS63S0000000_10(11));
        c113444cm.LIZJ(Bundle.class, new IDqS82S0000000_10(12));
        c113444cm2.LIZLLL(Bundle.class, new AqS63S0000000_10(13));
        c113444cm2.LIZJ(Bundle.class, new IDqS82S0000000_10(13));
        c113444cm3.LIZLLL(Bundle.class, new AqS63S0000000_10(14));
        c113444cm3.LIZJ(Bundle.class, new IDqS82S0000000_10(14));
        c113444cm4.LIZLLL(Bundle.class, new AqS63S0000000_10(0));
        c113444cm4.LIZJ(Bundle.class, new IDqS82S0000000_10(0));
        c113444cm5.LIZLLL(Bundle.class, new AqS63S0000000_10(1));
        c113444cm5.LIZJ(Bundle.class, new IDqS82S0000000_10(10));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("white", "#FFFFFFFF");
        linkedHashMap.put("black", "#FF000000");
        linkedHashMap.put("transparent", "#00000000");
        LJ = linkedHashMap;
    }

    public static String LIZ(String str) {
        if (str.length() != 3) {
            return str;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FF");
        LIZ2.append(str.charAt(0));
        LIZ2.append(str.charAt(0));
        LIZ2.append(str.charAt(1));
        LIZ2.append(str.charAt(1));
        LIZ2.append(str.charAt(2));
        LIZ2.append(str.charAt(2));
        return X1D.LIZIZ(LIZ2);
    }

    public static C59439NUl LIZIZ(String str) {
        java.util.Map<String, String> map;
        C59439NUl c59439NUl = new C59439NUl(-2);
        try {
            map = LJ;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (((LinkedHashMap) map).keySet().contains(str)) {
            return new C59439NUl(Color.parseColor((String) ((LinkedHashMap) map).get(str)));
        }
        if (o.LJJJLIIL(str, "#", false)) {
            str = C40689Fy1.LLF(1, str);
        }
        int length = str.length();
        if (length != 3) {
            if (length != 6) {
                if (length == 8) {
                    if (str.length() == 8) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(C40689Fy1.LLIIIILZ(2, str));
                        LIZ2.append(C40689Fy1.LLFFF(2, str));
                        str = X1D.LIZIZ(LIZ2);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append('#');
                    LIZ3.append(str);
                    return new C59439NUl(Color.parseColor(X1D.LIZIZ(LIZ3)));
                }
                return c59439NUl;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("#FF");
            LIZ4.append(str);
            return new C59439NUl(Color.parseColor(X1D.LIZIZ(LIZ4)));
        }
        String LIZ5 = LIZ(str);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append('#');
        LIZ6.append(LIZ5);
        return new C59439NUl(Color.parseColor(X1D.LIZIZ(LIZ6)));
    }
}
