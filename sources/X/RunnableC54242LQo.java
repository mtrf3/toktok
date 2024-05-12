package X;

/* renamed from: X.LQo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54242LQo implements Runnable {
    public static final RunnableC54242LQo LJLIL = new RunnableC54242LQo();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int LJIILIIL = C54362LVe.LJIILIIL(260);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("clearLiveUnreadTask, liveCount=");
            LIZ2.append(LJIILIIL);
            C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ2));
            if (LJIILIIL > 0) {
                C54362LVe.LIZIZ(260);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
