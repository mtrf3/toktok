package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T04<T> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = 6770240836423125754L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final T03<T> LJLILLLLZI;
    public T05<T> LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public volatile boolean LJLJJLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        T04<T>[] t04Arr;
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            T03<T> t03 = this.LJLILLLLZI;
            while (true) {
                T04<T>[] t04Arr2 = t03.LJLJJI.get();
                int length = t04Arr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (t04Arr2[i] != this) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    t04Arr = T03.LJLLI;
                } else {
                    t04Arr = new T04[length - 1];
                    System.arraycopy(t04Arr2, 0, t04Arr, 0, i);
                    System.arraycopy(t04Arr2, i + 1, t04Arr, i, (length - i) - 1);
                }
                AtomicReference<T04<T>[]> atomicReference = t03.LJLJJI;
                while (!atomicReference.compareAndSet(t04Arr2, t04Arr)) {
                    if (atomicReference.get() != t04Arr2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJLL;
    }

    public T04(InterfaceC116954iR<? super T> interfaceC116954iR, T03<T> t03) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = t03;
        this.LJLJI = t03.LJLJJLL;
    }
}
