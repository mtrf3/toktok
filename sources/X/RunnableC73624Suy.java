package X;

/* renamed from: X.Suy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73624Suy implements Runnable {
    public final RunnableC73623Sux LJLIL;
    public final /* synthetic */ C73950T0o LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            RunnableC73623Sux runnableC73623Sux = this.LJLIL;
            runnableC73623Sux.LJLILLLLZI.replace(this.LJLILLLLZI.LIZIZ(runnableC73623Sux));
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73624Suy(C73950T0o c73950T0o, RunnableC73623Sux runnableC73623Sux) {
        this.LJLILLLLZI = c73950T0o;
        this.LJLIL = runnableC73623Sux;
    }
}
