package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SrX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73411SrX<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -7251123623727029452L;
    public final InterfaceC64592gB<? super T> LJLIL;
    public final InterfaceC64592gB<? super Throwable> LJLILLLLZI;
    public final InterfaceC29937Boz LJLJI;
    public final InterfaceC64592gB<? super InterfaceC92693kP> LJLJJI;

    public boolean hasCustomOnError() {
        if (this.LJLILLLLZI != C73674Svm.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(EnumC73418Sre.DISPOSED);
            try {
                this.LJLJI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC116954iR
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(EnumC73418Sre.DISPOSED);
            try {
                this.LJLILLLLZI.accept(th);
                return;
            } catch (Throwable th2) {
                V0N.LJJIL(th2);
                C73548Stk.LIZIZ(new C63756P0m(th, th2));
                return;
            }
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.LJLIL.accept(t);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                get().dispose();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            try {
                this.LJLJJI.accept(this);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                interfaceC92693kP.dispose();
                onError(th);
            }
        }
    }

    public C73411SrX(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB3) {
        this.LJLIL = interfaceC64592gB;
        this.LJLILLLLZI = interfaceC64592gB2;
        this.LJLJI = interfaceC29937Boz;
        this.LJLJJI = interfaceC64592gB3;
    }
}
