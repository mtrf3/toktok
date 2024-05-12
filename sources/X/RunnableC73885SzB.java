package X;

/* renamed from: X.SzB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73885SzB implements Runnable {
    public final /* synthetic */ C73884SzA LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.LJLIL.onComplete();
                this.LJLIL.LJLJJI.dispose();
            } catch (Throwable th) {
                this.LJLIL.LJLJJI.dispose();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73885SzB(C73884SzA c73884SzA) {
        this.LJLIL = c73884SzA;
    }
}
