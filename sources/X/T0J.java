package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0J<T> extends AbstractC73851Syd<T> {
    public static final T0L[] LJLJJI = new T0L[0];
    public static final T0L[] LJLJJL = new T0L[0];
    public static final Object[] LJLJJLL = new Object[0];
    public final T0V<T> LJLIL;
    public final AtomicReference<T0L<T>[]> LJLILLLLZI = new AtomicReference<>(LJLJJI);
    public boolean LJLJI;

    public static <T> T0J<T> LJJZZI() {
        return new T0J<>(new T0I());
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        Object complete = EnumC73845SyX.complete();
        T0I t0i = (T0I) this.LJLIL;
        ((ArrayList) t0i.LJLIL).add(complete);
        t0i.LJLJI++;
        t0i.LJLILLLLZI = true;
        boolean compareAndSet = this.LJLIL.compareAndSet(null, complete);
        T0L<T>[] t0lArr = LJLJJL;
        if (compareAndSet) {
            t0lArr = this.LJLILLLLZI.getAndSet(t0lArr);
        }
        for (T0L<T> t0l : t0lArr) {
            t0i.LIZ(t0l);
        }
    }

    public T0J(T0I t0i) {
        this.LJLIL = t0i;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T0L<T> t0l = new T0L<>(interfaceC116954iR, this);
        interfaceC116954iR.onSubscribe(t0l);
        if (t0l.LJLJJI) {
            return;
        }
        while (true) {
            T0L<T>[] t0lArr = this.LJLILLLLZI.get();
            if (t0lArr == LJLJJL) {
                break;
            }
            int length = t0lArr.length;
            T0L<T>[] t0lArr2 = new T0L[length + 1];
            System.arraycopy(t0lArr, 0, t0lArr2, 0, length);
            t0lArr2[length] = t0l;
            AtomicReference<T0L<T>[]> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(t0lArr, t0lArr2)) {
                if (atomicReference.get() != t0lArr) {
                    break;
                }
            }
            if (t0l.LJLJJI) {
                LJJZZIII(t0l);
                return;
            }
        }
        ((T0I) this.LJLIL).LIZ(t0l);
    }

    public final void LJJZZIII(T0L<T> t0l) {
        T0L<T>[] t0lArr;
        while (true) {
            T0L<T>[] t0lArr2 = this.LJLILLLLZI.get();
            if (t0lArr2 == LJLJJL || t0lArr2 == (t0lArr = LJLJJI)) {
                return;
            }
            int length = t0lArr2.length;
            for (int i = 0; i < length; i++) {
                if (t0lArr2[i] == t0l) {
                    if (i < 0) {
                        return;
                    }
                    if (length != 1) {
                        t0lArr = new T0L[length - 1];
                        System.arraycopy(t0lArr2, 0, t0lArr, 0, i);
                        System.arraycopy(t0lArr2, i + 1, t0lArr, i, (length - i) - 1);
                    }
                    AtomicReference<T0L<T>[]> atomicReference = this.LJLILLLLZI;
                    while (!atomicReference.compareAndSet(t0lArr2, t0lArr)) {
                        if (atomicReference.get() != t0lArr2) {
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
        if (this.LJLJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJI = true;
        Object error = EnumC73845SyX.error(th);
        T0I t0i = (T0I) this.LJLIL;
        ((ArrayList) t0i.LJLIL).add(error);
        t0i.LJLJI++;
        t0i.LJLILLLLZI = true;
        boolean compareAndSet = this.LJLIL.compareAndSet(null, error);
        T0L<T>[] t0lArr = LJLJJL;
        if (compareAndSet) {
            t0lArr = this.LJLILLLLZI.getAndSet(t0lArr);
        }
        for (T0L<T> t0l : t0lArr) {
            t0i.LIZ(t0l);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        C73320Sq4.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLJI) {
            return;
        }
        T0I t0i = (T0I) this.LJLIL;
        ((ArrayList) t0i.LJLIL).add(t);
        t0i.LJLJI++;
        for (T0L<T> t0l : this.LJLILLLLZI.get()) {
            t0i.LIZ(t0l);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (this.LJLJI) {
            interfaceC92693kP.dispose();
        }
    }
}
