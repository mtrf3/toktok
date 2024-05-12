package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0A<T> extends AbstractC73169Snd<T> implements T09 {
    public static final T0F LJLJJL = new T0F();
    public final InterfaceC115714gR<T> LJLIL;
    public final AtomicReference<T0B<T>> LJLILLLLZI;
    public final T0G<T> LJLJI;
    public final InterfaceC115714gR<T> LJLJJI;

    @Override // X.T09
    public final void LIZIZ(InterfaceC92693kP interfaceC92693kP) {
        AtomicReference<T0B<T>> atomicReference = this.LJLILLLLZI;
        while (!atomicReference.compareAndSet(interfaceC92693kP, null) && atomicReference.get() == interfaceC92693kP) {
        }
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLJJI.LIZ(interfaceC116954iR);
    }

    @Override // X.AbstractC73169Snd
    public final void LJJZ(InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB) {
        T0B<T> t0b;
        boolean z;
        loop0: while (true) {
            t0b = this.LJLILLLLZI.get();
            if (t0b != null && !t0b.isDisposed()) {
                break;
            }
            this.LJLJI.getClass();
            T0B<T> t0b2 = new T0B<>(new T0D());
            AtomicReference<T0B<T>> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(t0b, t0b2)) {
                if (atomicReference.get() != t0b) {
                    break;
                }
            }
            t0b = t0b2;
            break loop0;
        }
        if (!t0b.LJLJJI.get() && t0b.LJLJJI.compareAndSet(false, true)) {
            z = true;
        } else {
            z = false;
        }
        try {
            interfaceC64592gB.accept(t0b);
            if (z) {
                this.LJLIL.LIZ(t0b);
            }
        } catch (Throwable th) {
            if (z) {
                t0b.LJLJJI.compareAndSet(true, false);
            }
            V0N.LJJIL(th);
            throw C73864Syq.LIZIZ(th);
        }
    }

    public T0A(T0C t0c, InterfaceC115714gR interfaceC115714gR, AtomicReference atomicReference) {
        T0F t0f = LJLJJL;
        this.LJLJJI = t0c;
        this.LJLIL = interfaceC115714gR;
        this.LJLILLLLZI = atomicReference;
        this.LJLJI = t0f;
    }
}
