package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.PIy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64236PIy {
    public volatile ExecutorService LIZ = C16880lQ.LLLLZI(1, new ThreadFactoryC64237PIz());

    public static C64236PIy LIZ() {
        if (C09970aH.LIZJ) {
            return PJ0.LIZ;
        }
        return null;
    }

    public final void LIZIZ(Runnable runnable) {
        this.LIZ.submit(runnable);
    }
}
