package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.SvG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73642SvG<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final /* synthetic */ C73641SvF LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        try {
            this.LJLILLLLZI.LJLILLLLZI.accept(th);
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
        this.LJLIL.onSuccess(t);
    }

    public C73642SvG(C73641SvF c73641SvF, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLILLLLZI = c73641SvF;
        this.LJLIL = interfaceC73463SsN;
    }
}
