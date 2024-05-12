package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sxh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73793Sxh<T> extends AbstractC73797Sxl<T> {
    public static final C73794Sxi[] LJLJJI = new C73794Sxi[0];
    public static final C73794Sxi[] LJLJJL = new C73794Sxi[0];
    public final AtomicReference<C73794Sxi<T>[]> LJLILLLLZI = new AtomicReference<>(LJLJJL);
    public Throwable LJLJI;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        C73794Sxi<T>[] c73794SxiArr = this.LJLILLLLZI.get();
        C73794Sxi<T>[] c73794SxiArr2 = LJLJJI;
        if (c73794SxiArr == c73794SxiArr2) {
            return;
        }
        for (C73794Sxi<T> c73794Sxi : this.LJLILLLLZI.getAndSet(c73794SxiArr2)) {
            if (c73794Sxi.get() != Long.MIN_VALUE) {
                c73794Sxi.LJLIL.onComplete();
            }
        }
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73794Sxi<T> c73794Sxi = new C73794Sxi<>(interfaceC73740Swq, this);
        interfaceC73740Swq.onSubscribe(c73794Sxi);
        while (true) {
            C73794Sxi<T>[] c73794SxiArr = this.LJLILLLLZI.get();
            if (c73794SxiArr == LJLJJI) {
                Throwable th = this.LJLJI;
                if (th != null) {
                    interfaceC73740Swq.onError(th);
                    return;
                } else {
                    interfaceC73740Swq.onComplete();
                    return;
                }
            }
            int length = c73794SxiArr.length;
            C73794Sxi<T>[] c73794SxiArr2 = new C73794Sxi[length + 1];
            System.arraycopy(c73794SxiArr, 0, c73794SxiArr2, 0, length);
            c73794SxiArr2[length] = c73794Sxi;
            AtomicReference<C73794Sxi<T>[]> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(c73794SxiArr, c73794SxiArr2)) {
                if (atomicReference.get() != c73794SxiArr) {
                    break;
                }
            }
            if (c73794Sxi.get() != Long.MIN_VALUE) {
                return;
            }
            LJIILL(c73794Sxi);
            return;
        }
    }

    public final void LJIILL(C73794Sxi<T> c73794Sxi) {
        C73794Sxi<T>[] c73794SxiArr;
        while (true) {
            C73794Sxi<T>[] c73794SxiArr2 = this.LJLILLLLZI.get();
            if (c73794SxiArr2 == LJLJJI || c73794SxiArr2 == (c73794SxiArr = LJLJJL)) {
                return;
            }
            int length = c73794SxiArr2.length;
            for (int i = 0; i < length; i++) {
                if (c73794SxiArr2[i] == c73794Sxi) {
                    if (i < 0) {
                        return;
                    }
                    if (length != 1) {
                        c73794SxiArr = new C73794Sxi[length - 1];
                        System.arraycopy(c73794SxiArr2, 0, c73794SxiArr, 0, i);
                        System.arraycopy(c73794SxiArr2, i + 1, c73794SxiArr, i, (length - i) - 1);
                    }
                    AtomicReference<C73794Sxi<T>[]> atomicReference = this.LJLILLLLZI;
                    while (!atomicReference.compareAndSet(c73794SxiArr2, c73794SxiArr)) {
                        if (atomicReference.get() != c73794SxiArr2) {
                            break;
                        }
                    }
                    return;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        C73320Sq4.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C73794Sxi<T>[] c73794SxiArr = this.LJLILLLLZI.get();
        C73794Sxi<T>[] c73794SxiArr2 = LJLJJI;
        if (c73794SxiArr == c73794SxiArr2) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJI = th;
        for (C73794Sxi<T> c73794Sxi : this.LJLILLLLZI.getAndSet(c73794SxiArr2)) {
            if (c73794Sxi.get() != Long.MIN_VALUE) {
                c73794Sxi.LJLIL.onError(th);
            } else {
                C73548Stk.LIZIZ(th);
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        C73320Sq4.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C73794Sxi<T> c73794Sxi : this.LJLILLLLZI.get()) {
            long j = c73794Sxi.get();
            long j2 = Long.MIN_VALUE;
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    c73794Sxi.LJLIL.onNext(t);
                    while (true) {
                        long j3 = c73794Sxi.get();
                        if (j3 != j2 && j3 != Long.MAX_VALUE) {
                            long j4 = j3 - 1;
                            if (j4 < 0) {
                                C73548Stk.LIZIZ(new IllegalStateException(C61845OOz.LIZ("More produced than requested: ", j4)));
                                j4 = 0;
                            }
                            if (c73794Sxi.compareAndSet(j3, j4)) {
                                break;
                            } else {
                                j2 = Long.MIN_VALUE;
                            }
                        }
                    }
                } else {
                    c73794Sxi.cancel();
                    c73794Sxi.LJLIL.onError(new C73799Sxn("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (this.LJLILLLLZI.get() == LJLJJI) {
            interfaceC73651SvP.cancel();
        } else {
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }
}
