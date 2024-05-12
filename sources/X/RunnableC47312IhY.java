package X;

/* renamed from: X.IhY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47312IhY implements Runnable {
    public final long LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C47311IhX c47311IhX = C47311IhX.LIZLLL;
            if (c47311IhX != null) {
                long j = this.LJLIL;
                synchronized (c47311IhX) {
                    if (j > 0) {
                        c47311IhX.LIZJ += j;
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47312IhY(long j) {
        this.LJLIL = j;
    }
}
