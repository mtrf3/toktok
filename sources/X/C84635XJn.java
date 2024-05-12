package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XJn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84635XJn extends XJV<Object> {
    public final XKR<?> LIZIZ;
    public final AbstractC84634XJm LIZJ;
    public final long LIZLLL;

    @Override // X.XJU
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AtomicSelectOp(sequence=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    @Override // X.XJV
    public final long LJFF() {
        return this.LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0008, code lost:
    
        r0 = null;
     */
    @Override // X.XJV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.Object r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L36
            X.XKR<?> r4 = r5.LIZIZ
        L4:
            java.lang.Object r1 = r4._state
            if (r1 != r5) goto Lc
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L35
            goto L36
        Lc:
            boolean r0 = r1 instanceof X.XJU
            if (r0 == 0) goto L18
            X.XJU r1 = (X.XJU) r1
            X.XKR<?> r0 = r5.LIZIZ
            r1.LIZJ(r0)
            goto L4
        L18:
            X.3BS r3 = X.C84636XJo.LIZ
            if (r1 != r3) goto L32
            X.XKR<?> r2 = r5.LIZIZ
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.XKR.LJLJJL
        L20:
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L2a
            r0 = 1
        L27:
            if (r0 == 0) goto L4
            goto L8
        L2a:
            java.lang.Object r0 = r1.get(r2)
            if (r0 == r3) goto L20
            r0 = 0
            goto L27
        L32:
            X.3BS r0 = X.C84636XJo.LIZIZ
            goto L9
        L35:
            return r0
        L36:
            X.XJm r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r0.LIZIZ(r5)     // Catch: java.lang.Throwable -> L3d
            return r0
        L3d:
            r4 = move-exception
            if (r6 != 0) goto L53
            X.XKR<?> r3 = r5.LIZIZ
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.XKR.LJLJJL
            X.3BS r1 = X.C84636XJo.LIZ
        L46:
            boolean r0 = r2.compareAndSet(r3, r5, r1)
            if (r0 != 0) goto L53
            java.lang.Object r0 = r2.get(r3)
            if (r0 != r5) goto L53
            goto L46
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84635XJn.LJI(java.lang.Object):java.lang.Object");
    }

    public C84635XJn(XKR xkr, C84643XJv c84643XJv) {
        this.LIZIZ = xkr;
        this.LIZJ = c84643XJv;
        C84637XJp c84637XJp = C84636XJo.LJ;
        c84637XJp.getClass();
        this.LIZLLL = C84637XJp.LIZ.incrementAndGet(c84637XJp);
        c84643XJv.LIZ = this;
    }

    @Override // X.XJV
    public final void LIZLLL(Object obj, Object obj2) {
        boolean z;
        C3BS c3bs;
        if (obj2 == null) {
            z = true;
            c3bs = null;
        } else {
            z = false;
            c3bs = C84636XJo.LIZ;
        }
        XKR<?> xkr = this.LIZIZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = XKR.LJLJJL;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(xkr, this, c3bs)) {
                if (z) {
                    this.LIZIZ.LJJII();
                }
            } else if (atomicReferenceFieldUpdater.get(xkr) != this) {
                break;
            }
        }
        this.LIZJ.LIZ(this, obj2);
    }
}
