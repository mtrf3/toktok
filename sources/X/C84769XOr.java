package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XOr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84769XOr extends AbstractC84770XOs {
    public final AtomicReferenceFieldUpdater<C84772XOu, Thread> LIZ;
    public final AtomicReferenceFieldUpdater<C84772XOu, C84772XOu> LIZIZ;
    public final AtomicReferenceFieldUpdater<AbstractC84773XOv, C84772XOu> LIZJ;
    public final AtomicReferenceFieldUpdater<AbstractC84773XOv, XP9> LIZLLL;
    public final AtomicReferenceFieldUpdater<AbstractC84773XOv, Object> LJ;

    @Override // X.AbstractC84770XOs
    public final void LIZLLL(C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        this.LIZIZ.lazySet(c84772XOu, c84772XOu2);
    }

    @Override // X.AbstractC84770XOs
    public final void LJ(C84772XOu c84772XOu, Thread thread) {
        this.LIZ.lazySet(c84772XOu, thread);
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZ(AbstractC84773XOv<?> abstractC84773XOv, XP9 xp9, XP9 xp92) {
        AtomicReferenceFieldUpdater<AbstractC84773XOv, XP9> atomicReferenceFieldUpdater = this.LIZLLL;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC84773XOv, xp9, xp92)) {
            if (atomicReferenceFieldUpdater.get(abstractC84773XOv) != xp9) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZIZ(AbstractC84773XOv<?> abstractC84773XOv, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<AbstractC84773XOv, Object> atomicReferenceFieldUpdater = this.LJ;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC84773XOv, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC84773XOv) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZJ(AbstractC84773XOv<?> abstractC84773XOv, C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        AtomicReferenceFieldUpdater<AbstractC84773XOv, C84772XOu> atomicReferenceFieldUpdater = this.LIZJ;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC84773XOv, c84772XOu, c84772XOu2)) {
            if (atomicReferenceFieldUpdater.get(abstractC84773XOv) != c84772XOu) {
                return false;
            }
        }
        return true;
    }

    public C84769XOr(AtomicReferenceFieldUpdater<C84772XOu, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C84772XOu, C84772XOu> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC84773XOv, C84772XOu> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC84773XOv, XP9> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC84773XOv, Object> atomicReferenceFieldUpdater5) {
        this.LIZ = atomicReferenceFieldUpdater;
        this.LIZIZ = atomicReferenceFieldUpdater2;
        this.LIZJ = atomicReferenceFieldUpdater3;
        this.LIZLLL = atomicReferenceFieldUpdater4;
        this.LJ = atomicReferenceFieldUpdater5;
    }
}
