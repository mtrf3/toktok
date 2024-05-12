package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.P4i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63856P4i {
    public static String LIZ;
    public static ConcurrentHashMap<String, Object> LIZIZ;

    static {
        C16880lQ.LJLLJ(C63856P4i.class);
        LIZ = "main";
    }

    public static void LIZJ(String[] strArr) {
        if (LIZIZ != null) {
            for (String str : strArr) {
                LIZIZ.remove(str);
            }
        }
    }

    public static void LIZ(long j, String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Long.valueOf(j));
        }
    }

    public static void LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
            if (str.equals("te_composition_video_hw_profile")) {
                LIZ = str2;
            }
        }
    }
}
