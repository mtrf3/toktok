package X;

import defpackage.b0;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XK5<E> extends XK4<E> {
    public final int LJLJJI;
    public final XKI LJLJJL;
    public final ReentrantLock LJLJJLL;
    public Object[] LJLJL;
    public int LJLJLJ;
    public volatile /* synthetic */ int size;

    @Override // X.XK3
    public final boolean LJI() {
        return false;
    }

    @Override // X.XK4
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.XK3
    public final boolean LJIIJ() {
        if (this.size == this.LJLJJI && this.LJLJJL == XKI.SUSPEND) {
            return true;
        }
        return false;
    }

    @Override // X.XK4
    public final boolean LJIJJ() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // X.XK4
    public final boolean LJJ() {
        ReentrantLock reentrantLock = this.LJLJJLL;
        reentrantLock.lock();
        try {
            return super.LJJ();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.XK4
    public final Object LJJIII() {
        ReentrantLock reentrantLock = this.LJLJJLL;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object LIZLLL = LIZLLL();
                if (LIZLLL == null) {
                    LIZLLL = XKK.LIZLLL;
                }
                return LIZLLL;
            }
            Object[] objArr = this.LJLJL;
            int i2 = this.LJLJLJ;
            Object obj = objArr[i2];
            XK1 xk1 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = XKK.LIZLLL;
            boolean z = false;
            if (i == this.LJLJJI) {
                XK1 xk12 = null;
                while (true) {
                    XK1 LJIILL = LJIILL();
                    if (LJIILL != null) {
                        if (LJIILL.LJJIIJZLJL(null) != null) {
                            obj2 = LJIILL.LJJIII();
                            xk1 = LJIILL;
                            z = true;
                            break;
                        }
                        LJIILL.LJJIIZI();
                        xk12 = LJIILL;
                    } else {
                        xk1 = xk12;
                        break;
                    }
                }
            }
            if (obj2 != XKK.LIZLLL && !(obj2 instanceof XK0)) {
                this.size = i;
                Object[] objArr2 = this.LJLJL;
                objArr2[(this.LJLJLJ + i) % objArr2.length] = obj2;
            }
            this.LJLJLJ = (this.LJLJLJ + 1) % this.LJLJL.length;
            if (z) {
                o.LJI(xk1);
                xk1.LJJII();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.XK3
    public final String LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(buffer:capacity=");
        LIZ.append(this.LJLJJI);
        LIZ.append(",size=");
        return b0.LIZJ(LIZ, this.size, ')', LIZ);
    }

    @Override // X.XK3
    public final Object LIZ(C84644XJw c84644XJw) {
        ReentrantLock reentrantLock = this.LJLJJLL;
        reentrantLock.lock();
        try {
            return super.LIZ(c84644XJw);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[DONT_GENERATE] */
    @Override // X.XK3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(E r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r2 = r4.LJLJJLL
            r2.lock()
            int r3 = r4.size     // Catch: java.lang.Throwable -> L73
            X.XK0 r0 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6f
            int r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L73
            if (r3 >= r0) goto L16
            int r0 = r3 + 1
            r4.size = r0     // Catch: java.lang.Throwable -> L73
            goto L2d
        L16:
            X.XKI r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L73
            int[] r1 = X.XKH.LIZ     // Catch: java.lang.Throwable -> L73
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L73
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L73
            r0 = 1
            if (r1 == r0) goto L24
            goto L27
        L24:
            X.3BS r0 = X.XKK.LIZJ     // Catch: java.lang.Throwable -> L73
            goto L2e
        L27:
            r0 = 2
            if (r1 == r0) goto L33
            r0 = 3
            if (r1 != r0) goto L69
        L2d:
            r0 = 0
        L2e:
            if (r0 != 0) goto L65
            if (r3 != 0) goto L3c
            goto L36
        L33:
            X.3BS r0 = X.XKK.LIZIZ     // Catch: java.lang.Throwable -> L73
            goto L2e
        L36:
            X.XKL r1 = r4.LJIILIIL()     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L42
        L3c:
            r4.LJJIIZ(r3, r5)     // Catch: java.lang.Throwable -> L73
            X.3BS r0 = X.XKK.LIZIZ     // Catch: java.lang.Throwable -> L73
            goto L52
        L42:
            boolean r0 = r1 instanceof X.XK0     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L49
            r4.size = r3     // Catch: java.lang.Throwable -> L73
            goto L56
        L49:
            X.3BS r0 = r1.LJI(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L36
            r4.size = r3     // Catch: java.lang.Throwable -> L73
            goto L5a
        L52:
            r2.unlock()
            return r0
        L56:
            r2.unlock()
            return r1
        L5a:
            r2.unlock()
            r1.LJIIIIZZ(r5)
            java.lang.Object r0 = r1.LIZIZ()
            return r0
        L65:
            r2.unlock()
            return r0
        L69:
            X.6Zf r0 = new X.6Zf     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L6f:
            r2.unlock()
            return r0
        L73:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK5.LJIIL(java.lang.Object):java.lang.Object");
    }

    @Override // X.XK4
    public final boolean LJIJ(XKE<? super E> xke) {
        ReentrantLock reentrantLock = this.LJLJJLL;
        reentrantLock.lock();
        try {
            return super.LJIJ(xke);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.XK4
    public final void LJJI(boolean z) {
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLIL;
        ReentrantLock reentrantLock = this.LJLJJLL;
        reentrantLock.lock();
        try {
            int i = this.size;
            C46108I7s c46108I7s = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.LJLJL[this.LJLJLJ];
                if (interfaceC88472Yns != null && obj != XKK.LIZ) {
                    c46108I7s = C46104I7o.LIZLLL(interfaceC88472Yns, obj, c46108I7s);
                }
                Object[] objArr = this.LJLJL;
                int i3 = this.LJLJLJ;
                objArr[i3] = XKK.LIZ;
                this.LJLJLJ = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.LJJI(z);
            if (c46108I7s != null) {
                throw c46108I7s;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #0 {all -> 0x00b4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:11:0x0015, B:13:0x0028, B:50:0x0035, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:35:0x0086, B:40:0x0091, B:42:0x0097, B:15:0x0041, B:17:0x0046, B:21:0x004b, B:23:0x004f, B:26:0x005b, B:45:0x0063, B:46:0x0071), top: B:2:0x0005 }] */
    @Override // X.XK4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(X.XKG<?> r10) {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r3 = r9.LJLJJLL
            r3.lock()
            int r7 = r9.size     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto L15
            X.XK0 r0 = r9.LIZLLL()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L11
            X.3BS r0 = X.XKK.LIZLLL     // Catch: java.lang.Throwable -> Lb4
        L11:
            r3.unlock()
            return r0
        L15:
            java.lang.Object[] r1 = r9.LJLJL     // Catch: java.lang.Throwable -> Lb4
            int r0 = r9.LJLJLJ     // Catch: java.lang.Throwable -> Lb4
            r8 = r1[r0]     // Catch: java.lang.Throwable -> Lb4
            r5 = 0
            r1[r0] = r5     // Catch: java.lang.Throwable -> Lb4
            int r0 = r7 + (-1)
            r9.size = r0     // Catch: java.lang.Throwable -> Lb4
            X.3BS r6 = X.XKK.LIZLLL     // Catch: java.lang.Throwable -> Lb4
            int r0 = r9.LJLJJI     // Catch: java.lang.Throwable -> Lb4
            if (r7 != r0) goto L72
        L28:
            X.XJv r1 = new X.XJv     // Catch: java.lang.Throwable -> Lb4
            X.XJT r0 = r9.LJLILLLLZI     // Catch: java.lang.Throwable -> Lb4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r10.LJIIIZ(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto L41
            X.XJh r5 = r1.LJIIL()     // Catch: java.lang.Throwable -> Lb4
            r0 = r5
            X.XK1 r0 = (X.XK1) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r6 = r0.LJJIII()     // Catch: java.lang.Throwable -> Lb4
            goto L61
        L41:
            X.3BS r0 = X.XKK.LIZLLL     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r0) goto L46
            goto L72
        L46:
            X.3BS r0 = X.XJW.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r0) goto L4b
            goto L28
        L4b:
            X.3BS r0 = X.C84636XJo.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r0) goto L5b
            r9.size = r7     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r1 = r9.LJLJL     // Catch: java.lang.Throwable -> Lb4
            int r0 = r9.LJLJLJ     // Catch: java.lang.Throwable -> Lb4
            r1[r0] = r8     // Catch: java.lang.Throwable -> Lb4
            r3.unlock()
            return r2
        L5b:
            boolean r0 = r2 instanceof X.XK0     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L63
            r6 = r2
            r5 = r2
        L61:
            r4 = 1
            goto L73
        L63:
            java.lang.String r0 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            r1.toString()     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L72:
            r4 = 0
        L73:
            X.3BS r0 = X.XKK.LIZLLL     // Catch: java.lang.Throwable -> Lb4
            if (r6 == r0) goto L91
            boolean r0 = r6 instanceof X.XK0     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L91
            r9.size = r7     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r2 = r9.LJLJL     // Catch: java.lang.Throwable -> Lb4
            int r1 = r9.LJLJLJ     // Catch: java.lang.Throwable -> Lb4
            int r1 = r1 + r7
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lb4
            int r1 = r1 % r0
            r2[r1] = r6     // Catch: java.lang.Throwable -> Lb4
        L86:
            int r0 = r9.LJLJLJ     // Catch: java.lang.Throwable -> Lb4
            int r1 = r0 + 1
            java.lang.Object[] r0 = r9.LJLJL     // Catch: java.lang.Throwable -> Lb4
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lb4
            int r1 = r1 % r0
            r9.LJLJLJ = r1     // Catch: java.lang.Throwable -> Lb4
            goto La2
        L91:
            boolean r0 = r10.LJ()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L86
            r9.size = r7     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r1 = r9.LJLJL     // Catch: java.lang.Throwable -> Lb4
            int r0 = r9.LJLJLJ     // Catch: java.lang.Throwable -> Lb4
            r1[r0] = r8     // Catch: java.lang.Throwable -> Lb4
            X.3BS r0 = X.C84636XJo.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            goto Lb0
        La2:
            r3.unlock()
            if (r4 == 0) goto Laf
            kotlin.jvm.internal.o.LJI(r5)
            X.XK1 r5 = (X.XK1) r5
            r5.LJJII()
        Laf:
            return r8
        Lb0:
            r3.unlock()
            return r0
        Lb4:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK5.LJJIIJ(X.XKG):java.lang.Object");
    }

    public final void LJJIIZ(int i, E e) {
        int i2 = this.LJLJJI;
        if (i < i2) {
            Object[] objArr = this.LJLJL;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                if (i > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        Object[] objArr3 = this.LJLJL;
                        objArr2[i3] = objArr3[(this.LJLJLJ + i3) % objArr3.length];
                        if (i4 >= i) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                Arrays.fill(objArr2, i, min, XKK.LIZ);
                this.LJLJL = objArr2;
                this.LJLJLJ = 0;
            }
            Object[] objArr4 = this.LJLJL;
            objArr4[(this.LJLJLJ + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.LJLJL;
        int i5 = this.LJLJLJ;
        objArr5[i5 % objArr5.length] = null;
        objArr5[(i + i5) % objArr5.length] = e;
        this.LJLJLJ = (i5 + 1) % objArr5.length;
    }

    public XK5(int i, XKI xki, InterfaceC88472Yns<? super E, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
        this.LJLJJI = i;
        this.LJLJJL = xki;
        if (i >= 1) {
            this.LJLJJLL = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C61898ORa.LJJIFFI(objArr, XKK.LIZ);
            this.LJLJL = objArr;
            this.size = 0;
            return;
        }
        String LIZIZ = C0NY.LIZIZ("ArrayChannel capacity must be at least 1, but ", i, " was specified");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
