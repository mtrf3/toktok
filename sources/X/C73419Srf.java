package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Srf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73419Srf<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 8094547886072529208L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    public C73419Srf(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLILLLLZI, interfaceC92693kP);
    }
}
