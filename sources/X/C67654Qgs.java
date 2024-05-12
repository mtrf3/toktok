package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67654Qgs<TResult> implements InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final Object LJLILLLLZI = new Object();
    public InterfaceC67661Qgz<TResult> LJLJI;

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        synchronized (this.LJLILLLLZI) {
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        synchronized (this.LJLILLLLZI) {
            if (this.LJLJI == null) {
                return;
            }
            this.LJLIL.execute(new RunnableC67655Qgt(1, this, abstractC67638Qgc));
        }
    }

    public C67654Qgs(Executor executor, InterfaceC67661Qgz<TResult> interfaceC67661Qgz) {
        this.LJLIL = executor;
        this.LJLJI = interfaceC67661Qgz;
    }
}
