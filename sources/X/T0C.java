package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0C<T> implements InterfaceC115714gR<T> {
    public final AtomicReference<T0B<T>> LJLIL;
    public final T0G<T> LJLILLLLZI;

    public T0C(AtomicReference atomicReference) {
        T0F t0f = T0A.LJLJJL;
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = t0f;
    }

    @Override // X.InterfaceC115714gR
    public final void LIZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T0B<T> t0b;
        loop0: while (true) {
            t0b = this.LJLIL.get();
            if (t0b != null) {
                break;
            }
            this.LJLILLLLZI.getClass();
            t0b = new T0B<>(new T0D());
            AtomicReference<T0B<T>> atomicReference = this.LJLIL;
            while (!atomicReference.compareAndSet(null, t0b)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            break loop0;
        }
        T0E<T> t0e = new T0E<>(t0b, interfaceC116954iR);
        interfaceC116954iR.onSubscribe(t0e);
        loop2: while (true) {
            T0E[] t0eArr = t0b.LJLJI.get();
            if (t0eArr != T0B.LJLJJLL) {
                int length = t0eArr.length;
                T0E[] t0eArr2 = new T0E[length + 1];
                System.arraycopy(t0eArr, 0, t0eArr2, 0, length);
                t0eArr2[length] = t0e;
                AtomicReference<T0E[]> atomicReference2 = t0b.LJLJI;
                while (!atomicReference2.compareAndSet(t0eArr, t0eArr2)) {
                    if (atomicReference2.get() != t0eArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (t0e.LJLJJI) {
            t0b.LIZ(t0e);
        } else {
            ((T0D) t0b.LJLIL).LIZJ(t0e);
        }
    }
}
