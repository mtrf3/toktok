package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67656Qgu<TResult> implements InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final Object LJLILLLLZI = new Object();
    public InterfaceC67679QhH LJLJI;

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        synchronized (this.LJLILLLLZI) {
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        if (!abstractC67638Qgc.LJIILIIL() && !abstractC67638Qgc.LJIIJJI()) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLJI == null) {
                    return;
                }
                this.LJLIL.execute(new RunnableC67657Qgv(this, abstractC67638Qgc));
            }
        }
    }

    public C67656Qgu(Executor executor, InterfaceC67679QhH interfaceC67679QhH) {
        this.LJLIL = executor;
        this.LJLJI = interfaceC67679QhH;
    }
}
