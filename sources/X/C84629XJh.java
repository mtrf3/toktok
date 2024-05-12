package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XJh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84629XJh {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLIL = AtomicReferenceFieldUpdater.newUpdater(C84629XJh.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLILLLLZI = AtomicReferenceFieldUpdater.newUpdater(C84629XJh.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJI = AtomicReferenceFieldUpdater.newUpdater(C84629XJh.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef;

    public final void LJIJI() {
        C84629XJh c84629XJh = this;
        while (true) {
            Object LJIILLIIL = c84629XJh.LJIILLIIL();
            if (!(LJIILLIIL instanceof X9N)) {
                c84629XJh.LJIILJJIL();
                return;
            }
            c84629XJh = ((X9N) LJIILLIIL).LIZ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r3 = X.C84629XJh.LJLIL;
        r2 = ((X.X9N) r2).LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r3.compareAndSet(r4, r0, r2) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r3.get(r4) == r0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C84629XJh LJIILJJIL() {
        /*
            r6 = this;
        L0:
            java.lang.Object r5 = r6._prev
            X.XJh r5 = (X.C84629XJh) r5
            r0 = r5
        L5:
            r3 = 0
            r4 = r3
        L7:
            java.lang.Object r2 = r0._next
            if (r2 != r6) goto L1e
            if (r5 != r0) goto Le
            return r0
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C84629XJh.LJLILLLLZI
        L10:
            boolean r1 = r2.compareAndSet(r6, r5, r0)
            if (r1 == 0) goto L17
            return r0
        L17:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r5) goto L10
            goto L0
        L1e:
            boolean r1 = r6.LJIJJLI()
            if (r1 == 0) goto L25
            return r3
        L25:
            if (r2 != 0) goto L28
            return r0
        L28:
            boolean r1 = r2 instanceof X.XJU
            if (r1 == 0) goto L32
            X.XJU r2 = (X.XJU) r2
            r2.LIZJ(r0)
            goto L0
        L32:
            boolean r1 = r2 instanceof X.X9N
            if (r1 == 0) goto L52
            if (r4 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C84629XJh.LJLIL
            X.X9N r2 = (X.X9N) r2
            X.XJh r2 = r2.LIZ
        L3e:
            boolean r1 = r3.compareAndSet(r4, r0, r2)
            if (r1 == 0) goto L46
            r0 = r4
            goto L5
        L46:
            java.lang.Object r1 = r3.get(r4)
            if (r1 == r0) goto L3e
            goto L0
        L4d:
            java.lang.Object r0 = r0._prev
            X.XJh r0 = (X.C84629XJh) r0
            goto L7
        L52:
            X.XJh r2 = (X.C84629XJh) r2
            r4 = r0
            r0 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84629XJh.LJIILJJIL():X.XJh");
    }

    public final Object LJIILLIIL() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof XJU)) {
                return obj;
            }
            ((XJU) obj).LIZJ(this);
        }
    }

    public final X9N LJJI() {
        X9N x9n = (X9N) this._removedRef;
        if (x9n == null) {
            X9N x9n2 = new X9N(this);
            LJLJI.lazySet(this, x9n2);
            return x9n2;
        }
        return x9n;
    }

    public final C84629XJh LJIIZILJ() {
        X9N x9n;
        Object LJIILLIIL = LJIILLIIL();
        if (!(LJIILLIIL instanceof X9N) || (x9n = (X9N) LJIILLIIL) == null) {
            return (C84629XJh) LJIILLIIL;
        }
        return x9n.LIZ;
    }

    public final C84629XJh LJIJ() {
        C84629XJh LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL == null) {
            Object obj = this._prev;
            while (true) {
                LJIILJJIL = (C84629XJh) obj;
                if (!LJIILJJIL.LJIJJLI()) {
                    break;
                }
                obj = LJIILJJIL._prev;
            }
        }
        return LJIILJJIL;
    }

    public boolean LJIJJLI() {
        return LJIILLIIL() instanceof X9N;
    }

    public boolean LJIL() {
        if (LJJ() == null) {
            return true;
        }
        return false;
    }

    public final C84629XJh LJJ() {
        while (true) {
            Object LJIILLIIL = LJIILLIIL();
            if (LJIILLIIL instanceof X9N) {
                return ((X9N) LJIILLIIL).LIZ;
            }
            if (LJIILLIIL == this) {
                return (C84629XJh) LJIILLIIL;
            }
            C84629XJh c84629XJh = (C84629XJh) LJIILLIIL;
            X9N LJJI = c84629XJh.LJJI();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, LJIILLIIL, LJJI)) {
                if (atomicReferenceFieldUpdater.get(this) != LJIILLIIL) {
                    break;
                }
            }
            c84629XJh.LJIILJJIL();
            return null;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return X1D.LIZIZ(LIZ);
    }

    public final void LJIILL(C84629XJh c84629XJh) {
        while (true) {
            Object obj = c84629XJh._prev;
            if (LJIILLIIL() != c84629XJh) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLILLLLZI;
            while (!atomicReferenceFieldUpdater.compareAndSet(c84629XJh, obj, this)) {
                if (atomicReferenceFieldUpdater.get(c84629XJh) != obj) {
                    break;
                }
            }
            if (LJIJJLI()) {
                c84629XJh.LJIILJJIL();
                return;
            }
            return;
        }
    }

    public final boolean LJIIL(C84629XJh c84629XJh, XJT xjt) {
        LJLILLLLZI.lazySet(c84629XJh, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
        atomicReferenceFieldUpdater.lazySet(c84629XJh, xjt);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, xjt, c84629XJh)) {
            if (atomicReferenceFieldUpdater.get(this) != xjt) {
                return false;
            }
        }
        c84629XJh.LJIILL(xjt);
        return true;
    }

    public final int LJJIFFI(C84629XJh c84629XJh, C84629XJh c84629XJh2, AbstractC84630XJi abstractC84630XJi) {
        LJLILLLLZI.lazySet(c84629XJh, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
        atomicReferenceFieldUpdater.lazySet(c84629XJh, c84629XJh2);
        abstractC84630XJi.LIZJ = c84629XJh2;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c84629XJh2, abstractC84630XJi)) {
            if (atomicReferenceFieldUpdater.get(this) != c84629XJh2) {
                return 0;
            }
        }
        if (abstractC84630XJi.LIZJ(this) == null) {
            return 1;
        }
        return 2;
    }
}
