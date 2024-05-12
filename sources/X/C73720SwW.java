package X;

import java.util.Collection;

/* renamed from: X.SwW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73720SwW<T, U extends Collection<? super T>> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super U> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public U LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        U u = this.LJLJI;
        this.LJLJI = null;
        this.LJLIL.onNext(u);
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLJI = null;
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLJI.add(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73720SwW(InterfaceC116954iR<? super U> interfaceC116954iR, U u) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJI = u;
    }
}
