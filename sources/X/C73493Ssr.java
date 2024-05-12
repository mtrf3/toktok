package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73493Ssr<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<R>, InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -8948264376121066672L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(R r) {
        this.LJLIL.onNext(r);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            InterfaceC115714gR<? extends R> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null Publisher");
            apply.LIZ(this);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73493Ssr(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
