package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.10P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10P {
    public static ExecutorService LIZ;

    public static void LIZ(AbstractC36651cD abstractC36651cD) {
        if (LIZ == null) {
            synchronized (C10P.class) {
                if (LIZ == null) {
                    LIZ = C16880lQ.LLLLZLLIL();
                }
            }
        }
        LIZ.execute(abstractC36651cD);
    }
}
