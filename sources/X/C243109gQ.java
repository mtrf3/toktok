package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243109gQ {
    public static final PthreadTimer LIZ = new PthreadTimer("ChainedAnalytics");
    public static final ConcurrentHashMap<C232639Bb, C243099gP> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(C232639Bb c232639Bb) {
        ConcurrentHashMap<C232639Bb, C243099gP> concurrentHashMap = LIZIZ;
        C243099gP c243099gP = concurrentHashMap.get(c232639Bb);
        if (c243099gP != null) {
            c243099gP.cancel();
        }
        concurrentHashMap.remove(c232639Bb);
    }

    public static C243099gP LIZIZ(String str, String str2) {
        C232639Bb c232639Bb = new C232639Bb(str, str2);
        LIZ(c232639Bb);
        C243099gP c243099gP = new C243099gP(c232639Bb);
        LIZIZ.put(c232639Bb, c243099gP);
        return c243099gP;
    }

    public static C243099gP LIZJ(String str, String str2) {
        return LIZIZ.get(new C232639Bb(str, str2));
    }
}
