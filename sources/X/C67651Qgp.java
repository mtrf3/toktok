package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67651Qgp<TResult> implements InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final Object LJLILLLLZI = new Object();
    public InterfaceC67677QhF<? super TResult> LJLJI;

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        synchronized (this.LJLILLLLZI) {
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        if (abstractC67638Qgc.LJIILIIL()) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLJI == null) {
                    return;
                }
                this.LJLIL.execute(new RunnableC67294Qb4(1, this, abstractC67638Qgc));
            }
        }
    }

    public C67651Qgp(Executor executor, InterfaceC67677QhF<? super TResult> interfaceC67677QhF) {
        this.LJLIL = executor;
        this.LJLJI = interfaceC67677QhF;
    }
}
