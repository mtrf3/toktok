package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Sys, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73866Sys<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final /* synthetic */ C73867Syt LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        T apply;
        C73867Syt c73867Syt = this.LJLILLLLZI;
        InterfaceC48038ItG<? super Throwable, ? extends T> interfaceC48038ItG = c73867Syt.LJLILLLLZI;
        if (interfaceC48038ItG != null) {
            try {
                apply = interfaceC48038ItG.apply(th);
            } catch (Throwable th2) {
                V0N.LJJIL(th2);
                this.LJLIL.onError(new C63756P0m(th, th2));
                return;
            }
        } else {
            apply = c73867Syt.LJLJI;
        }
        if (apply == null) {
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.LJLIL.onError(nullPointerException);
            return;
        }
        this.LJLIL.onSuccess(apply);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }

    public C73866Sys(C73867Syt c73867Syt, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLILLLLZI = c73867Syt;
        this.LJLIL = interfaceC73463SsN;
    }
}
