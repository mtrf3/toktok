package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67650Qgo<TResult, TContinuationResult> implements InterfaceC67662Qh0<TResult> {
    public final Executor LJLIL;
    public final InterfaceC67660Qgy<TResult, TContinuationResult> LJLILLLLZI;
    public final C67646Qgk<TContinuationResult> LJLJI;

    @Override // X.InterfaceC67662Qh0
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC67662Qh0
    public final void onComplete(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        this.LJLIL.execute(new RunnableC67652Qgq(this, abstractC67638Qgc));
    }

    public C67650Qgo(Executor executor, InterfaceC67660Qgy<TResult, TContinuationResult> interfaceC67660Qgy, C67646Qgk<TContinuationResult> c67646Qgk) {
        this.LJLIL = executor;
        this.LJLILLLLZI = interfaceC67660Qgy;
        this.LJLJI = c67646Qgk;
    }
}
