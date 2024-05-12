package X;

/* renamed from: X.SyE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73826SyE implements Runnable {
    public final Throwable LJLIL;
    public final /* synthetic */ C73824SyC LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJLILLLLZI.onError(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73826SyE(C73824SyC c73824SyC, Throwable th) {
        this.LJLILLLLZI = c73824SyC;
        this.LJLIL = th;
    }
}
