package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73585SuL<T, U> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -5955289211445418871L;
    public final InterfaceC73509St7<? super T> LJLIL;
    public final C73586SuM<T, U> LJLILLLLZI = new C73586SuM<>(this);
    public final InterfaceC73504St2<? extends T> LJLJI;
    public final C73583SuJ<T> LJLJJI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (getAndSet(enumC73418Sre) != enumC73418Sre) {
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        C73583SuJ<T> c73583SuJ = this.LJLJJI;
        if (c73583SuJ != null) {
            EnumC73418Sre.dispose(c73583SuJ);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        EnumC73418Sre.dispose(this.LJLILLLLZI);
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
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (getAndSet(enumC73418Sre) != enumC73418Sre) {
            this.LJLIL.onSuccess(t);
        }
    }

    public C73585SuL(InterfaceC73509St7<? super T> interfaceC73509St7, InterfaceC73504St2<? extends T> interfaceC73504St2) {
        C73583SuJ<T> c73583SuJ;
        this.LJLIL = interfaceC73509St7;
        this.LJLJI = interfaceC73504St2;
        if (interfaceC73504St2 != null) {
            c73583SuJ = new C73583SuJ<>(interfaceC73509St7);
        } else {
            c73583SuJ = null;
        }
        this.LJLJJI = c73583SuJ;
    }
}
