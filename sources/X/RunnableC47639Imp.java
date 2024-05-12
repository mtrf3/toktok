package X;

/* renamed from: X.Imp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC47639Imp implements Runnable {
    public final /* synthetic */ C47640Imq LJLIL;

    public RunnableC47639Imp(C47640Imq c47640Imq) {
        this.LJLIL = c47640Imq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLIL) {
                C47640Imq.LIZIZ = C47640Imq.LIZJ.getDevices(2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
