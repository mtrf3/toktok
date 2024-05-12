package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Suj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73609Suj<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 8571289934935992137L;
    public final C73616Suq LJLIL = new C73616Suq();
    public final InterfaceC73509St7<? super T> LJLILLLLZI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLILLLLZI.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        this.LJLIL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    public C73609Suj(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLILLLLZI = interfaceC73509St7;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLILLLLZI.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLILLLLZI.onSuccess(t);
    }
}
