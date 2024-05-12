package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67648Qgm<TResult, TContinuationResult> implements InterfaceC67680QhI, InterfaceC67679QhH, InterfaceC67677QhF<TContinuationResult>, InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final InterfaceC67660Qgy<TResult, AbstractC67638Qgc<TContinuationResult>> LJLILLLLZI;
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
        this.LJLIL.execute(new RunnableC68023Qmp(1, this, abstractC67638Qgc));
    }

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception exc) {
        this.LJLJI.LJIIZILJ(exc);
    }

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.LJLJI.LJIJ(tcontinuationresult);
    }

    public C67648Qgm(Executor executor, InterfaceC67660Qgy<TResult, AbstractC67638Qgc<TContinuationResult>> interfaceC67660Qgy, C67646Qgk<TContinuationResult> c67646Qgk) {
        this.LJLIL = executor;
        this.LJLILLLLZI = interfaceC67660Qgy;
        this.LJLJI = c67646Qgk;
    }
}
