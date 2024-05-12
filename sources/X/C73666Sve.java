package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sve, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73666Sve<T> extends AtomicReference<InterfaceC73651SvP> implements InterfaceC73812Sy0<T>, InterfaceC73651SvP, InterfaceC92693kP {
    public static final long serialVersionUID = -7251123623727029452L;
    public final InterfaceC64592gB<? super T> LJLIL;
    public final InterfaceC64592gB<? super Throwable> LJLILLLLZI;
    public final InterfaceC29937Boz LJLJI;
    public final InterfaceC64592gB<? super InterfaceC73651SvP> LJLJJI;

    public boolean hasCustomOnError() {
        if (this.LJLILLLLZI != C73674Svm.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73740Swq
    public void onComplete() {
        InterfaceC73651SvP interfaceC73651SvP = get();
        EnumC73755Sx5 enumC73755Sx5 = EnumC73755Sx5.CANCELLED;
        if (interfaceC73651SvP != enumC73755Sx5) {
            lazySet(enumC73755Sx5);
            try {
                this.LJLJI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public void cancel() {
        EnumC73755Sx5.cancel(this);
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        cancel();
    }

    @Override // X.InterfaceC73740Swq
    public void onError(Throwable th) {
        InterfaceC73651SvP interfaceC73651SvP = get();
        EnumC73755Sx5 enumC73755Sx5 = EnumC73755Sx5.CANCELLED;
        if (interfaceC73651SvP != enumC73755Sx5) {
            lazySet(enumC73755Sx5);
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

    @Override // X.InterfaceC73740Swq
    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.LJLIL.accept(t);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.setOnce(this, interfaceC73651SvP)) {
            try {
                this.LJLJJI.accept(this);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                interfaceC73651SvP.cancel();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
        get().request(j);
    }

    public C73666Sve(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC64592gB<? super InterfaceC73651SvP> interfaceC64592gB3) {
        this.LJLIL = interfaceC64592gB;
        this.LJLILLLLZI = interfaceC64592gB2;
        this.LJLJI = interfaceC29937Boz;
        this.LJLJJI = interfaceC64592gB3;
    }
}
