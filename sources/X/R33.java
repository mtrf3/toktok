package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class R33<T> extends R35<T> {
    public static final R34[] LJLILLLLZI = new R34[0];
    public final AtomicReference<R34<T>[]> LJLIL = new AtomicReference<>(LJLILLLLZI);

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        R34<T> r34 = new R34<>(interfaceC116954iR, this);
        interfaceC116954iR.onSubscribe(r34);
        loop0: while (true) {
            R34<T>[] r34Arr = this.LJLIL.get();
            int length = r34Arr.length;
            R34<T>[] r34Arr2 = new R34[length + 1];
            System.arraycopy(r34Arr, 0, r34Arr2, 0, length);
            r34Arr2[length] = r34;
            AtomicReference<R34<T>[]> atomicReference = this.LJLIL;
            while (!atomicReference.compareAndSet(r34Arr, r34Arr2)) {
                if (atomicReference.get() != r34Arr) {
                    break;
                }
            }
        }
        if (r34.get()) {
            LJJZ(r34);
        }
    }

    public final void LJJZ(R34<T> r34) {
        while (true) {
            R34<T>[] r34Arr = this.LJLIL.get();
            R34<T>[] r34Arr2 = LJLILLLLZI;
            if (r34Arr == r34Arr2) {
                return;
            }
            int length = r34Arr.length;
            for (int i = 0; i < length; i++) {
                if (r34Arr[i] == r34) {
                    if (i < 0) {
                        return;
                    }
                    if (length != 1) {
                        r34Arr2 = new R34[length - 1];
                        System.arraycopy(r34Arr, 0, r34Arr2, 0, i);
                        System.arraycopy(r34Arr, i + 1, r34Arr2, i, (length - i) - 1);
                    }
                    AtomicReference<R34<T>[]> atomicReference = this.LJLIL;
                    while (!atomicReference.compareAndSet(r34Arr, r34Arr2)) {
                        if (atomicReference.get() != r34Arr) {
                            break;
                        }
                    }
                    return;
                }
            }
            return;
        }
    }

    @Override // X.R35, X.InterfaceC64592gB
    public final void accept(T t) {
        if (t != null) {
            for (R34<T> r34 : this.LJLIL.get()) {
                if (!r34.get()) {
                    r34.LJLIL.onNext(t);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }
}
