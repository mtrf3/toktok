package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LFf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53947LFf {
    public static boolean LJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C40306Frq.INSTANCE);
    public static int LIZIZ = -3;
    public static int LIZJ = -3;
    public static String LIZLLL = "";
    public static java.util.Map<String, Integer> LJFF = new LinkedHashMap();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C53949LFh.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C53950LFi.LJLIL);

    public static int LIZ() {
        if (LIZJ == -3) {
            LJFF();
            if (LIZJ == -3) {
                C53946LFe.LIZJ(null, null).LIZ();
            }
        }
        return LIZJ;
    }

    public static Keva LIZIZ() {
        return (Keva) LJI.getValue();
    }

    public static Keva LIZJ() {
        return (Keva) LJII.getValue();
    }

    public static int LIZLLL() {
        if (LIZIZ == -3) {
            LJFF();
            if (LIZIZ == -3) {
                C53946LFe.LIZJ(null, null).LIZIZ();
            }
        }
        return LIZIZ;
    }

    public static void LJFF() {
        int intValue;
        try {
            if (!LJ) {
                LJ = true;
                java.util.Map<String, ?> all = LIZIZ().getAll();
                LJFF = new LinkedHashMap();
                int i = -1;
                for (String key : all.keySet()) {
                    Object obj = all.get(key);
                    if (obj instanceof String) {
                        intValue = CastIntegerProtector.parseInt((String) obj);
                    } else if (!(obj instanceof Integer)) {
                        break;
                    } else {
                        intValue = ((Number) obj).intValue();
                    }
                    if (intValue >= i) {
                        o.LJIIIIZZ(key, "key");
                        LIZLLL = key;
                        i = intValue;
                    }
                    Integer valueOf = Integer.valueOf(intValue);
                    java.util.Map<String, Integer> map = LJFF;
                    o.LJIIIIZZ(key, "key");
                    map.put(key, valueOf);
                }
                String str = LIZLLL;
                Keva LIZJ2 = LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append("_width");
                LIZIZ = LIZJ2.getInt(X1D.LIZIZ(LIZ2), -4);
                String str2 = LIZLLL;
                Keva LIZJ3 = LIZJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str2);
                LIZ3.append("_height");
                LIZJ = LIZJ3.getInt(X1D.LIZIZ(LIZ3), -4);
            }
        } catch (Exception unused) {
            LIZIZ = -3;
            LIZJ = -3;
            LIZLLL = "";
            LJFF = new LinkedHashMap();
            LJ = false;
            LIZIZ().clear();
            LIZJ().clear();
        }
    }

    public static void LJ(String str) {
        if (!LJFF.containsKey(str)) {
            return;
        }
        LJFF.remove(str);
        LIZIZ().erase(str);
        Keva LIZJ2 = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_width");
        LIZJ2.erase(X1D.LIZIZ(LIZ2));
        Keva LIZJ3 = LIZJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("_height");
        LIZJ3.erase(X1D.LIZIZ(LIZ3));
    }
}
