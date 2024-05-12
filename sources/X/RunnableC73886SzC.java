package X;

/* renamed from: X.SzC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73886SzC implements Runnable {
    public final Throwable LJLIL;
    public final /* synthetic */ C73884SzA LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLILLLLZI.LJLIL.onError(this.LJLIL);
                this.LJLILLLLZI.LJLJJI.dispose();
            } catch (Throwable th) {
                this.LJLILLLLZI.LJLJJI.dispose();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73886SzC(C73884SzA c73884SzA, Throwable th) {
        this.LJLILLLLZI = c73884SzA;
        this.LJLIL = th;
    }
}
