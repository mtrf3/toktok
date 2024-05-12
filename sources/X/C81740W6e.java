package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.W6e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81740W6e {
    public static volatile ExecutorService LIZ;

    public static ExecutorService LIZ() {
        if (LIZ == null) {
            synchronized (C81740W6e.class) {
                if (LIZ == null) {
                    LIZ = C16880lQ.LLLLZLLIL();
                }
            }
        }
        return LIZ;
    }
}
