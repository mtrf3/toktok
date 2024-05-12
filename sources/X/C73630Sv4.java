package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sv4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73630Sv4<T, U> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -2187421758664251153L;
    public final InterfaceC73509St7<? super T> LJLIL;
    public final C73631Sv5<U> LJLILLLLZI = new C73631Sv5<>(this);

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        EnumC73755Sx5.cancel(this.LJLILLLLZI);
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (getAndSet(enumC73418Sre) != enumC73418Sre) {
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        EnumC73755Sx5.cancel(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    public C73630Sv4(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL = interfaceC73509St7;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        EnumC73755Sx5.cancel(this.LJLILLLLZI);
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (getAndSet(enumC73418Sre) != enumC73418Sre) {
            this.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        EnumC73755Sx5.cancel(this.LJLILLLLZI);
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (getAndSet(enumC73418Sre) != enumC73418Sre) {
            this.LJLIL.onSuccess(t);
        }
    }
}
