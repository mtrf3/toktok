package X;

import java.util.concurrent.Callable;

/* renamed from: X.Gk8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42376Gk8<V> implements Callable {
    public static final CallableC42376Gk8<V> LJLIL = new CallableC42376Gk8<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long currentTimeMillis = System.currentTimeMillis();
        C42377Gk9.LIZ = C39579Fg7.LJIILIIL();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        C42377Gk9.LIZIZ = C39687Fhr.LIZLLL(C60903NvH.LJ);
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZJ = V10.LIZJ("storage metrics preload successfully, cost(storage available): ", currentTimeMillis2, "ms, cost(app storage): ");
        LIZIZ.LJ("preload_storage_metrics", C0H1.LIZJ(LIZJ, currentTimeMillis4, "ms", LIZJ));
        return C76800UCe.LIZ;
    }
}
