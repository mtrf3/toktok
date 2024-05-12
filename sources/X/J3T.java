package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class J3T implements J3F {
    public static final J3T LIZ = new J3T();

    @Override // X.J3F
    public final ExecutorService LIZ() {
        ExecutorService executorService = J3U.LIZ;
        if (executorService != null) {
            return executorService;
        }
        if (C48541J3h.LIZ != null) {
            synchronized (J3U.class) {
                if (J3U.LIZ == null) {
                    ExecutorService LIZ2 = C48541J3h.LIZ.LIZ();
                    J3U.LIZ = LIZ2;
                    if (LIZ2 == null) {
                        J3U.LIZ = J3V.LIZ();
                    }
                }
            }
            return J3U.LIZ;
        }
        return J3V.LIZ();
    }
}
