package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVO {
    public static AVR LIZ;
    public static HashMap<String, Long> LIZIZ;
    public static Long LIZJ;
    public static Long LIZLLL;
    public static Long LJ;
    public static Long LJFF;
    public static String LJI;
    public static Long LJII;
    public static String LJIIIIZZ;

    public static long LIZ() {
        HashMap<String, Long> hashMap = LIZIZ;
        long j = 0;
        if (hashMap == null) {
            return 0L;
        }
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            if (!o.LJ(entry.getKey(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                j += entry.getValue().longValue();
            }
        }
        return j;
    }

    public static void LIZIZ(long j) {
        long j2;
        String str = LJIIIIZZ;
        if (str == null || str.length() == 0) {
            return;
        }
        if (LIZJ == null) {
            LIZJ = Long.valueOf(System.currentTimeMillis());
            LJ = Long.valueOf(j);
            LIZLLL = LIZJ;
            new PthreadTimer("AccountSwitchDMTrack").schedule(new AVP(), 5000L);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = LIZJ;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        long j3 = currentTimeMillis - j2;
        if (0 <= j3 && j3 < 5001) {
            LJ = Long.valueOf(j);
            LIZLLL = Long.valueOf(currentTimeMillis);
        }
    }
}
