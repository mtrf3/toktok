package X;

import java.util.LinkedHashMap;

/* renamed from: X.Fmf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39985Fmf {
    public static final C39985Fmf LIZ = new C39985Fmf();
    public static final java.util.Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static int LIZ(String str) {
        if (str.length() == 0) {
            return 0;
        }
        java.util.Map<String, Integer> map = LIZIZ;
        Integer num = (Integer) ((LinkedHashMap) map).get(str);
        if (num == null) {
            num = Integer.valueOf(FKM.LIZJ().getIdentifier(str, "raw", FKM.LIZ().getPackageName()));
            map.put(str, num);
        }
        return num.intValue();
    }
}
