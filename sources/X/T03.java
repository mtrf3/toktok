package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T03<T> extends AbstractC73430Srq<T, T> implements InterfaceC116954iR<T> {
    public static final T04[] LJLLI = new T04[0];
    public static final T04[] LJLLILLLL = new T04[0];
    public final AtomicBoolean LJLILLLLZI;
    public final int LJLJI;
    public final AtomicReference<T04<T>[]> LJLJJI;
    public volatile long LJLJJL;
    public final T05<T> LJLJJLL;
    public T05<T> LJLJL;
    public int LJLJLJ;
    public Throwable LJLJLLL;
    public volatile boolean LJLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLL = true;
        for (T04<T> t04 : this.LJLJJI.getAndSet(LJLLILLLL)) {
            LJJZ(t04);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    public T03(C73870Syw c73870Syw) {
        super(c73870Syw);
        this.LJLJI = 16;
        this.LJLILLLLZI = new AtomicBoolean();
        T05<T> t05 = new T05<>(16);
        this.LJLJJLL = t05;
        this.LJLJL = t05;
        this.LJLJJI = new AtomicReference<>(LJLLI);
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T04<T> t04 = new T04<>(interfaceC116954iR, this);
        interfaceC116954iR.onSubscribe(t04);
        loop0: while (true) {
            T04<T>[] t04Arr = this.LJLJJI.get();
            if (t04Arr != LJLLILLLL) {
                int length = t04Arr.length;
                T04<T>[] t04Arr2 = new T04[length + 1];
                System.arraycopy(t04Arr, 0, t04Arr2, 0, length);
                t04Arr2[length] = t04;
                AtomicReference<T04<T>[]> atomicReference = this.LJLJJI;
                while (!atomicReference.compareAndSet(t04Arr, t04Arr2)) {
                    if (atomicReference.get() != t04Arr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        if (!this.LJLILLLLZI.get() && this.LJLILLLLZI.compareAndSet(false, true)) {
            this.LJLIL.LIZ(this);
        } else {
            LJJZ(t04);
        }
    }

    public final void LJJZ(T04<T> t04) {
        boolean z;
        if (t04.getAndIncrement() != 0) {
            return;
        }
        long j = t04.LJLJJL;
        int i = t04.LJLJJI;
        T05<T> t05 = t04.LJLJI;
        InterfaceC116954iR<? super T> interfaceC116954iR = t04.LJLIL;
        int i2 = this.LJLJI;
        int i3 = 1;
        while (!t04.LJLJJLL) {
            boolean z2 = this.LJLL;
            if (this.LJLJJL == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (z) {
                    t04.LJLJI = null;
                    Throwable th = this.LJLJLLL;
                    if (th != null) {
                        interfaceC116954iR.onError(th);
                        return;
                    } else {
                        interfaceC116954iR.onComplete();
                        return;
                    }
                }
            } else if (z) {
                t04.LJLJJL = j;
                t04.LJLJJI = i;
                t04.LJLJI = t05;
                i3 = t04.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
            if (i == i2) {
                t05 = t05.LIZIZ;
                i = 0;
            }
            interfaceC116954iR.onNext(t05.LIZ[i]);
            i++;
            j++;
        }
        t04.LJLJI = null;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLJLLL = th;
        this.LJLL = true;
        for (T04<T> t04 : this.LJLJJI.getAndSet(LJLLILLLL)) {
            LJJZ(t04);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        int i = this.LJLJLJ;
        if (i == this.LJLJI) {
            T05<T> t05 = new T05<>(i);
            t05.LIZ[0] = t;
            this.LJLJLJ = 1;
            this.LJLJL.LIZIZ = t05;
            this.LJLJL = t05;
        } else {
            this.LJLJL.LIZ[i] = t;
            this.LJLJLJ = i + 1;
        }
        this.LJLJJL++;
        for (T04<T> t04 : this.LJLJJI.get()) {
            LJJZ(t04);
        }
    }
}
