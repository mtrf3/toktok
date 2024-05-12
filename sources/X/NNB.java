package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNB {
    public static InterfaceC55235Lm3 LIZ;
    public static List<Integer> LIZIZ;
    public static List<Long> LIZJ;
    public static List<Long> LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static String LJI = "auto";
    public static boolean LJIIJ = true;

    public static Integer LIZIZ(int i) {
        List<Integer> list = LIZIZ;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (Integer) ListProtector.get(list, i);
    }

    public static Integer LIZ(int i, String str) {
        if (i < 0 || i >= LJ) {
            return null;
        }
        if (o.LJ(str, "left")) {
            int i2 = i + 1;
            if (i2 >= LJ) {
                return null;
            }
            return Integer.valueOf(i2);
        }
        if (!o.LJ(str, "right")) {
            return null;
        }
        if (i == 0) {
            return Integer.valueOf(LJ - 1);
        }
        int i3 = i - 1;
        if (i3 < 0) {
            return null;
        }
        return Integer.valueOf(i3);
    }
}
