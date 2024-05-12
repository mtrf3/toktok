package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Xzg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86656Xzg {
    public static final long LIZ;
    public static final long LIZIZ;

    static {
        long millis;
        long millis2;
        if (C52214KeQ.LIZ()) {
            millis = 30000;
        } else {
            millis = TimeUnit.DAYS.toMillis(3L);
        }
        LIZ = millis;
        if (C52214KeQ.LIZ()) {
            millis2 = 60000;
        } else {
            millis2 = TimeUnit.DAYS.toMillis(7L);
        }
        LIZIZ = millis2;
    }
}
