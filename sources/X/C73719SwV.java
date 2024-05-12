package X;

import java.util.Collection;

/* renamed from: X.SwV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73719SwV<T, U extends Collection<? super T>> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super U> LJLIL;
    public U LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        U u = this.LJLILLLLZI;
        this.LJLILLLLZI = null;
        this.LJLIL.onSuccess(u);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLILLLLZI = null;
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLILLLLZI.add(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73719SwV(InterfaceC73463SsN<? super U> interfaceC73463SsN, U u) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = u;
    }
}
