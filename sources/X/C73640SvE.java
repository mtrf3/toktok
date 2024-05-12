package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.SvE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73640SvE<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final /* synthetic */ C73639SvD LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        try {
            this.LJLILLLLZI.LJLILLLLZI.accept(null, th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            th = new C63756P0m(th, th2);
        }
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            this.LJLILLLLZI.LJLILLLLZI.accept(t, null);
            this.LJLIL.onSuccess(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73640SvE(C73639SvD c73639SvD, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLILLLLZI = c73639SvD;
        this.LJLIL = interfaceC73463SsN;
    }
}
