package X;

import Y.ARunnableS9S1100000_8;
import java.util.LinkedHashMap;

/* renamed from: X.Jc5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49521Jc5 {
    public static final java.util.Map<String, C49520Jc4> LIZ = new LinkedHashMap();

    public static void LIZ(String str) {
        C49520Jc4 c49520Jc4;
        if (str != null && (c49520Jc4 = (C49520Jc4) ((LinkedHashMap) LIZ).get(str)) != null) {
            if (c49520Jc4.LIZIZ > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                c49520Jc4.LIZLLL = currentTimeMillis - c49520Jc4.LIZJ;
                c49520Jc4.LJFF = currentTimeMillis - c49520Jc4.LIZIZ;
            }
            C38995FSd.LIZLLL().execute(new ARunnableS9S1100000_8(c49520Jc4, str, 10));
        }
    }

    public static C49520Jc4 LIZIZ(String str) {
        if (str != null) {
            C49520Jc4 c49520Jc4 = (C49520Jc4) ((LinkedHashMap) LIZ).get(str);
            if (c49520Jc4 == null) {
                return C49533JcH.LIZ;
            }
            return c49520Jc4;
        }
        return C49533JcH.LIZ;
    }
}
