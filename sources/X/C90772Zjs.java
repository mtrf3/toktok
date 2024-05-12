package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Zjs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90772Zjs extends AbstractC90380ZdY {
    public final AtomicReferenceFieldUpdater<C90274Zbq, Thread> LIZ;
    public final AtomicReferenceFieldUpdater<C90274Zbq, C90274Zbq> LIZIZ;
    public final AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90274Zbq> LIZJ;
    public final AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90404Zdw> LIZLLL;
    public final AtomicReferenceFieldUpdater<AbstractC90683ZiR, Object> LJ;

    public C90772Zjs(AtomicReferenceFieldUpdater<C90274Zbq, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C90274Zbq, C90274Zbq> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90274Zbq> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90404Zdw> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC90683ZiR, Object> atomicReferenceFieldUpdater5) {
        this.LIZ = atomicReferenceFieldUpdater;
        this.LIZIZ = atomicReferenceFieldUpdater2;
        this.LIZJ = atomicReferenceFieldUpdater3;
        this.LIZLLL = atomicReferenceFieldUpdater4;
        this.LJ = atomicReferenceFieldUpdater5;
    }

    @Override // X.AbstractC90380ZdY
    public final void LIZ(C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        this.LIZIZ.lazySet(c90274Zbq, c90274Zbq2);
    }

    @Override // X.AbstractC90380ZdY
    public final void LIZIZ(C90274Zbq c90274Zbq, Thread thread) {
        this.LIZ.lazySet(c90274Zbq, thread);
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90404Zdw c90404Zdw, C90404Zdw c90404Zdw2) {
        AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90404Zdw> atomicReferenceFieldUpdater = this.LIZLLL;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC90683ZiR, c90404Zdw, c90404Zdw2)) {
            if (atomicReferenceFieldUpdater.get(abstractC90683ZiR) != c90404Zdw) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZLLL(AbstractC90683ZiR<?> abstractC90683ZiR, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<AbstractC90683ZiR, Object> atomicReferenceFieldUpdater = this.LJ;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC90683ZiR, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC90683ZiR) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        AtomicReferenceFieldUpdater<AbstractC90683ZiR, C90274Zbq> atomicReferenceFieldUpdater = this.LIZJ;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC90683ZiR, c90274Zbq, c90274Zbq2)) {
            if (atomicReferenceFieldUpdater.get(abstractC90683ZiR) != c90274Zbq) {
                return false;
            }
        }
        return true;
    }
}
