package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Iav, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46901Iav {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C46909Ib3> LIZIZ = new ConcurrentHashMap<>();

    public static Integer LIZ(String str) {
        String str2;
        C46909Ib3 c46909Ib3;
        C46902Iaw c46902Iaw;
        if (str == null || (str2 = LIZ.get(str)) == null || (c46909Ib3 = LIZIZ.get(str2)) == null || (c46902Iaw = c46909Ib3.LIZ.get(str)) == null) {
            return null;
        }
        return Integer.valueOf(c46902Iaw.LJLILLLLZI);
    }

    public static void LIZIZ(String str, String str2, int i, long j, AbstractC46912Ib6 abstractC46912Ib6) {
        C46909Ib3 putIfAbsent;
        if (str != null && str2 != null) {
            LIZ.put(str, str2);
            ConcurrentHashMap<String, C46909Ib3> concurrentHashMap = LIZIZ;
            C46909Ib3 c46909Ib3 = concurrentHashMap.get(str2);
            if (c46909Ib3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (c46909Ib3 = new C46909Ib3(str2)))) != null) {
                c46909Ib3 = putIfAbsent;
            }
            c46909Ib3.LIZ.put(str, new C46902Iaw(str, i, j, abstractC46912Ib6));
        }
    }
}
