package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sso, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73490Sso<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 3258103020495908596L;
    public final InterfaceC73463SsN<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73471SsV<? extends R>> LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            InterfaceC73471SsV<? extends R> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The single returned by the mapper is null");
            InterfaceC73471SsV<? extends R> interfaceC73471SsV = apply;
            if (!isDisposed()) {
                interfaceC73471SsV.LIZ(new C73492Ssq(this.LJLIL, this));
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73490Sso(InterfaceC73463SsN<? super R> interfaceC73463SsN, InterfaceC48038ItG<? super T, ? extends InterfaceC73471SsV<? extends R>> interfaceC48038ItG) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
