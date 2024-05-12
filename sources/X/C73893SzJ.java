package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73893SzJ<T> extends AbstractC73851Syd<T> {
    public static final C73894SzK[] LJLJI = new C73894SzK[0];
    public static final C73894SzK[] LJLJJI = new C73894SzK[0];
    public final AtomicReference<C73894SzK<T>[]> LJLIL = new AtomicReference<>(LJLJJI);
    public Throwable LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C73894SzK<T>[] c73894SzKArr = this.LJLIL.get();
        C73894SzK<T>[] c73894SzKArr2 = LJLJI;
        if (c73894SzKArr == c73894SzKArr2) {
            return;
        }
        for (C73894SzK<T> c73894SzK : this.LJLIL.getAndSet(c73894SzKArr2)) {
            if (!c73894SzK.get()) {
                c73894SzK.LJLIL.onComplete();
            }
        }
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73894SzK<T> c73894SzK = new C73894SzK<>(interfaceC116954iR, this);
        interfaceC116954iR.onSubscribe(c73894SzK);
        while (true) {
            C73894SzK<T>[] c73894SzKArr = this.LJLIL.get();
            if (c73894SzKArr == LJLJI) {
                Throwable th = this.LJLILLLLZI;
                if (th != null) {
                    interfaceC116954iR.onError(th);
                    return;
                } else {
                    interfaceC116954iR.onComplete();
                    return;
                }
            }
            int length = c73894SzKArr.length;
            C73894SzK<T>[] c73894SzKArr2 = new C73894SzK[length + 1];
            System.arraycopy(c73894SzKArr, 0, c73894SzKArr2, 0, length);
            c73894SzKArr2[length] = c73894SzK;
            AtomicReference<C73894SzK<T>[]> atomicReference = this.LJLIL;
            while (!atomicReference.compareAndSet(c73894SzKArr, c73894SzKArr2)) {
                if (atomicReference.get() != c73894SzKArr) {
                    break;
                }
            }
            if (!c73894SzK.get()) {
                return;
            }
            LJJZZI(c73894SzK);
            return;
        }
    }

    public final void LJJZZI(C73894SzK<T> c73894SzK) {
        C73894SzK<T>[] c73894SzKArr;
        while (true) {
            C73894SzK<T>[] c73894SzKArr2 = this.LJLIL.get();
            if (c73894SzKArr2 == LJLJI || c73894SzKArr2 == (c73894SzKArr = LJLJJI)) {
                return;
            }
            int length = c73894SzKArr2.length;
            for (int i = 0; i < length; i++) {
                if (c73894SzKArr2[i] == c73894SzK) {
                    if (i < 0) {
                        return;
                    }
                    if (length != 1) {
                        c73894SzKArr = new C73894SzK[length - 1];
                        System.arraycopy(c73894SzKArr2, 0, c73894SzKArr, 0, i);
                        System.arraycopy(c73894SzKArr2, i + 1, c73894SzKArr, i, (length - i) - 1);
                    }
                    AtomicReference<C73894SzK<T>[]> atomicReference = this.LJLIL;
                    while (!atomicReference.compareAndSet(c73894SzKArr2, c73894SzKArr)) {
                        if (atomicReference.get() != c73894SzKArr2) {
                            break;
                        }
                    }
                    return;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C73320Sq4.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C73894SzK<T>[] c73894SzKArr = this.LJLIL.get();
        C73894SzK<T>[] c73894SzKArr2 = LJLJI;
        if (c73894SzKArr == c73894SzKArr2) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLILLLLZI = th;
        for (C73894SzK<T> c73894SzK : this.LJLIL.getAndSet(c73894SzKArr2)) {
            if (c73894SzK.get()) {
                C73548Stk.LIZIZ(th);
            } else {
                c73894SzK.LJLIL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        C73320Sq4.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C73894SzK<T> c73894SzK : this.LJLIL.get()) {
            if (!c73894SzK.get()) {
                c73894SzK.LJLIL.onNext(t);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (this.LJLIL.get() == LJLJI) {
            interfaceC92693kP.dispose();
        }
    }
}
