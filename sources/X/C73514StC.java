package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73514StC<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -6076952298809384986L;
    public final InterfaceC64592gB<? super T> LJLIL;
    public final InterfaceC64592gB<? super Throwable> LJLILLLLZI;
    public final InterfaceC29937Boz LJLJI;

    public boolean hasCustomOnError() {
        if (this.LJLILLLLZI != C73674Svm.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73509St7
    public void onComplete() {
        lazySet(EnumC73418Sre.DISPOSED);
        try {
            this.LJLJI.run();
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73509St7
    public void onError(Throwable th) {
        lazySet(EnumC73418Sre.DISPOSED);
        try {
            this.LJLILLLLZI.accept(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            C73548Stk.LIZIZ(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC73509St7
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public void onSuccess(T t) {
        lazySet(EnumC73418Sre.DISPOSED);
        try {
            this.LJLIL.accept(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
    }

    public C73514StC(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC64592gB;
        this.LJLILLLLZI = interfaceC64592gB2;
        this.LJLJI = interfaceC29937Boz;
    }
}
