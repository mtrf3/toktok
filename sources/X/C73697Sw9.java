package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sw9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73697Sw9<T> extends AbstractC73169Snd<T> {
    public final InterfaceC115714gR<T> LJLIL;
    public final AtomicReference<C73698SwA<T>> LJLILLLLZI;
    public final InterfaceC115714gR<T> LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLJI.LIZ(interfaceC116954iR);
    }

    @Override // X.AbstractC73169Snd
    public final void LJJZ(InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB) {
        C73698SwA<T> c73698SwA;
        boolean z;
        loop0: while (true) {
            c73698SwA = this.LJLILLLLZI.get();
            z = false;
            if (c73698SwA != null && !c73698SwA.isDisposed()) {
                break;
            }
            C73698SwA<T> c73698SwA2 = new C73698SwA<>(this.LJLILLLLZI);
            AtomicReference<C73698SwA<T>> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(c73698SwA, c73698SwA2)) {
                if (atomicReference.get() != c73698SwA) {
                    break;
                }
            }
            c73698SwA = c73698SwA2;
            break loop0;
        }
        if (!c73698SwA.LJLJI.get() && c73698SwA.LJLJI.compareAndSet(false, true)) {
            z = true;
        }
        try {
            interfaceC64592gB.accept(c73698SwA);
            if (z) {
                this.LJLIL.LIZ(c73698SwA);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            throw C73864Syq.LIZIZ(th);
        }
    }

    public C73697Sw9(C73699SwB c73699SwB, InterfaceC115714gR interfaceC115714gR, AtomicReference atomicReference) {
        this.LJLJI = c73699SwB;
        this.LJLIL = interfaceC115714gR;
        this.LJLILLLLZI = atomicReference;
    }
}
