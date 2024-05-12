package X;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class OF6 {
    public static final java.util.Map<String, String> LIZ;
    public static final java.util.Map<String, String> LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        String LIZ2 = UYR.LIZ(1, false);
        hashMap.put("regular", LIZ2);
        String LIZ3 = UYR.LIZ(3, false);
        hashMap.put("bold", LIZ3);
        String LIZ4 = UYR.LIZ(2, false);
        hashMap.put("medium", LIZ4);
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        hashMap2.put("regular.ttf", LIZ2);
        hashMap2.put("bold.ttf", LIZ3);
        hashMap2.put("medium.ttf", LIZ4);
    }
}
