package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67658Qgw<TResult> implements InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final Object LJLILLLLZI = new Object();
    public InterfaceC67680QhI LJLJI;

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        synchronized (this.LJLILLLLZI) {
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
        if (abstractC67638Qgc.LJIIJJI()) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLJI == null) {
                    return;
                }
                this.LJLIL.execute(new RunnableC67659Qgx(this));
            }
        }
    }

    public C67658Qgw(Executor executor, InterfaceC67680QhI interfaceC67680QhI) {
        this.LJLIL = executor;
        this.LJLJI = interfaceC67680QhI;
    }
}
