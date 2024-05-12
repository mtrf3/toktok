package X;

/* renamed from: X.HgW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44700HgW implements Runnable {
    public static final RunnableC44700HgW LJLIL = new RunnableC44700HgW();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C44694HgQ.LJIILIIL.getClass();
            if (C44694HgQ.LJIIL) {
                C44694HgQ.LJIIL = false;
                C44694HgQ.LJIIIZ.evictAll();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
