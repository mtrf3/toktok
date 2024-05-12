package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public final class XK7<E> extends XK4<E> {
    public final ReentrantLock LJLJJI;
    public Object LJLJJL;

    @Override // X.XK3
    public final boolean LJI() {
        return false;
    }

    @Override // X.XK3
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.XK4
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.XK4
    public final boolean LJIJJ() {
        if (this.LJLJJL == XKK.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.XK4
    public final Object LJJIII() {
        ReentrantLock reentrantLock = this.LJLJJI;
        reentrantLock.lock();
        try {
            Object obj = this.LJLJJL;
            C3BS c3bs = XKK.LIZ;
            if (obj == c3bs) {
                Object LIZLLL = LIZLLL();
                if (LIZLLL == null) {
                    LIZLLL = XKK.LIZLLL;
                }
                return LIZLLL;
            }
            this.LJLJJL = c3bs;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.XK3
    public final String LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(value=");
        return U26.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public XK7(InterfaceC88472Yns<? super E, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
        this.LJLJJI = new ReentrantLock();
        this.LJLJJL = XKK.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r1 instanceof X.XK0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r1.LJI(r5) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r3.unlock();
        r1.LJIIIIZZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r1.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        r2 = r4.LJLJJL;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001c, code lost:
    
        if (r2 != X.XKK.LIZ) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001e, code lost:
    
        r4.LJLJJL = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        return X.XKK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0021, code lost:
    
        r0 = r4.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
    
        r1 = X.C46104I7o.LIZLLL(r0, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r4.LJLJJL == X.XKK.LIZ) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r1 = LJIILIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // X.XK3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(E r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r3 = r4.LJLJJI
            r3.lock()
            X.XK0 r0 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r4.LJLJJL     // Catch: java.lang.Throwable -> L53
            X.3BS r0 = X.XKK.LIZ     // Catch: java.lang.Throwable -> L53
            if (r1 != r0) goto L17
        L11:
            X.XKL r1 = r4.LJIILIIL()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L2b
        L17:
            java.lang.Object r2 = r4.LJLJJL     // Catch: java.lang.Throwable -> L53
            X.3BS r0 = X.XKK.LIZ     // Catch: java.lang.Throwable -> L53
            r1 = 0
            if (r2 != r0) goto L21
        L1e:
            r4.LJLJJL = r5     // Catch: java.lang.Throwable -> L53
            goto L37
        L21:
            X.Yns<E, X.UCe> r0 = r4.LJLIL     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L26
            goto L1e
        L26:
            X.I7s r1 = X.C46104I7o.LIZLLL(r0, r2, r1)     // Catch: java.lang.Throwable -> L53
            goto L1e
        L2b:
            boolean r0 = r1 instanceof X.XK0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L30
            goto L40
        L30:
            X.3BS r0 = r1.LJI(r5)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L11
            goto L44
        L37:
            if (r1 != 0) goto L3f
            X.3BS r0 = X.XKK.LIZIZ     // Catch: java.lang.Throwable -> L53
            r3.unlock()
            return r0
        L3f:
            throw r1     // Catch: java.lang.Throwable -> L53
        L40:
            r3.unlock()
            return r1
        L44:
            r3.unlock()
            r1.LJIIIIZZ(r5)
            java.lang.Object r0 = r1.LIZIZ()
            return r0
        L4f:
            r3.unlock()
            return r0
        L53:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK7.LJIIL(java.lang.Object):java.lang.Object");
    }

    @Override // X.XK4
    public final boolean LJIJ(XKE<? super E> xke) {
        ReentrantLock reentrantLock = this.LJLJJI;
        reentrantLock.lock();
        try {
            return super.LJIJ(xke);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.XK4
    public final void LJJI(boolean z) {
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns;
        ReentrantLock reentrantLock = this.LJLJJI;
        reentrantLock.lock();
        try {
            C3BS c3bs = XKK.LIZ;
            Object obj = this.LJLJJL;
            C46108I7s c46108I7s = null;
            if (obj != c3bs && (interfaceC88472Yns = this.LJLIL) != null) {
                c46108I7s = C46104I7o.LIZLLL(interfaceC88472Yns, obj, null);
            }
            this.LJLJJL = c3bs;
            reentrantLock.unlock();
            super.LJJI(z);
            if (c46108I7s == null) {
            } else {
                throw c46108I7s;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // X.XK4
    public final Object LJJIIJ(XKG<?> xkg) {
        ReentrantLock reentrantLock = this.LJLJJI;
        reentrantLock.lock();
        try {
            Object obj = this.LJLJJL;
            C3BS c3bs = XKK.LIZ;
            if (obj == c3bs) {
                Object LIZLLL = LIZLLL();
                if (LIZLLL == null) {
                    LIZLLL = XKK.LIZLLL;
                }
                return LIZLLL;
            }
            if (!xkg.LJ()) {
                return C84636XJo.LIZIZ;
            }
            Object obj2 = this.LJLJJL;
            this.LJLJJL = c3bs;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
