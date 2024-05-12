package X;

import java.util.List;

/* renamed from: X.JfY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49736JfY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49753Jfp.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49749Jfl.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C49748Jfk.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C49754Jfq.LJLIL);

    public static void LIZ(int i) {
        Object obj = ((java.util.Map) LIZ.getValue()).get(Integer.valueOf(i));
        if (obj == null) {
            obj = null;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            map.clear();
        }
    }

    public static void LIZIZ(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            Object obj = ((java.util.Map) LIZIZ.getValue()).get(Integer.valueOf(intValue));
            Object obj2 = null;
            if (obj == null) {
                obj = null;
            }
            java.util.Map map = (java.util.Map) obj;
            if (map != null) {
                map.clear();
            }
            Object obj3 = ((java.util.Map) LIZJ.getValue()).get(Integer.valueOf(intValue));
            if (obj3 != null) {
                obj2 = obj3;
            }
            List list = (List) obj2;
            if (list != null) {
                list.clear();
            }
        }
    }
}
