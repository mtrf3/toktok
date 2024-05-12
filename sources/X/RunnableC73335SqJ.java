package X;

/* renamed from: X.SqJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73335SqJ implements InterfaceC92693kP, Runnable {
    public final Runnable LJLIL;
    public final AbstractC73945T0j LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI = true;
        this.LJLILLLLZI.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLJI) {
                try {
                    this.LJLIL.run();
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    this.LJLILLLLZI.dispose();
                    throw C73864Syq.LIZIZ(th);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI;
    }

    public RunnableC73335SqJ(Runnable runnable, AbstractC73945T0j abstractC73945T0j) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = abstractC73945T0j;
    }
}
