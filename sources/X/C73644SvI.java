package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.SvI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73644SvI<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final /* synthetic */ C73643SvH LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            this.LJLILLLLZI.LJLILLLLZI.accept(t);
            this.LJLIL.onSuccess(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73644SvI(C73643SvH c73643SvH, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLILLLLZI = c73643SvH;
        this.LJLIL = interfaceC73463SsN;
    }
}
