package X;

import Y.ARunnableS12S1000000_6;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FRW {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();
    public static final C62822Ol8 LIZJ;

    static {
        new ConcurrentHashMap();
        LIZJ = C221108m2.LIZIZ(C58237MtN.LJLIL);
    }

    public static final synchronized void LIZ(String key) {
        synchronized (FRW.class) {
            o.LJIIJ(key, "key");
            Long remove = LIZIZ.remove(key);
            if (remove != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - remove.longValue();
                if (elapsedRealtime < 30000) {
                    ((FGQ) LIZJ.getValue()).LIZ(elapsedRealtime, key);
                }
            }
        }
    }

    public static final void LIZJ(String str) {
        LIZ.post(new ARunnableS12S1000000_6(str, 0));
    }

    public static final synchronized void LIZLLL(String str) {
        synchronized (FRW.class) {
            HashMap<String, Long> hashMap = LIZIZ;
            Long l = hashMap.get(str);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() >= 30000) {
                    hashMap.remove(str);
                }
            } else {
                hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
    }

    public static final void LIZIZ(long j, String str) {
        ((FGQ) LIZJ.getValue()).LIZ(j, str);
    }
}
