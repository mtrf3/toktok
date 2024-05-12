package X;

/* renamed from: X.T0l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73947T0l implements InterfaceC92693kP, Runnable {
    public final Runnable LJLIL;
    public final AbstractC73945T0j LJLILLLLZI;
    public Thread LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLJI == C16880lQ.LLLLIIIILLL()) {
            AbstractC73945T0j abstractC73945T0j = this.LJLILLLLZI;
            if (abstractC73945T0j instanceof C73956T0u) {
                C73956T0u c73956T0u = (C73956T0u) abstractC73945T0j;
                if (!c73956T0u.LJLILLLLZI) {
                    c73956T0u.LJLILLLLZI = true;
                    c73956T0u.LJLIL.shutdown();
                    return;
                }
                return;
            }
        }
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI = C16880lQ.LLLLIIIILLL();
            try {
                this.LJLIL.run();
                dispose();
                this.LJLJI = null;
            } catch (Throwable th) {
                dispose();
                this.LJLJI = null;
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73947T0l(Runnable runnable, AbstractC73945T0j abstractC73945T0j) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = abstractC73945T0j;
    }
}
