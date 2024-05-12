package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67647Qgl<TResult, TContinuationResult> implements InterfaceC67680QhI, InterfaceC67679QhH, InterfaceC67677QhF<TContinuationResult>, InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final InterfaceC67643Qgh<TResult, TContinuationResult> LJLILLLLZI;
    public final C67646Qgk<TContinuationResult> LJLJI;

    @Override // X.InterfaceC67680QhI
    public final void LIZ() {
        this.LJLJI.LJIJI();
    }

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        this.LJLIL.execute(new RunnableC67644Qgi(1, this, abstractC67638Qgc));
    }

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception exc) {
        this.LJLJI.LJIIZILJ(exc);
    }

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.LJLJI.LJIJ(tcontinuationresult);
    }

    public C67647Qgl(Executor executor, InterfaceC67643Qgh<TResult, TContinuationResult> interfaceC67643Qgh, C67646Qgk<TContinuationResult> c67646Qgk) {
        this.LJLIL = executor;
        this.LJLILLLLZI = interfaceC67643Qgh;
        this.LJLJI = c67646Qgk;
    }
}
