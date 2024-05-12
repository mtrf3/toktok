package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLL<T> extends XLN<XLS> implements C3BJ<T>, InterfaceC65462ha, InterfaceC79903Bq<T> {
    public final int LJLJJL;
    public final int LJLJJLL;
    public final XKI LJLJL;
    public Object[] LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public int LJLLILLLL;

    @Override // X.C3BJ
    public final void LIZ() {
        synchronized (this) {
            LJIIZILJ(LJIIL() + this.LJLLI, this.LJLL, LJIIL() + this.LJLLI, LJIIL() + this.LJLLI + this.LJLLILLLL);
        }
    }

    @Override // X.XLN
    public final XLT[] LJFF() {
        return new XLS[2];
    }

    @Override // X.XLN
    public final XLS LJ() {
        return new XLS();
    }

    public final void LJIIIIZZ() {
        if (this.LJLJJLL == 0 && this.LJLLILLLL <= 1) {
            return;
        }
        Object[] objArr = this.LJLJLJ;
        o.LJI(objArr);
        while (this.LJLLILLLL > 0) {
            long LJIIL = LJIIL();
            int i = this.LJLLI;
            int i2 = this.LJLLILLLL;
            if (objArr[(objArr.length - 1) & ((int) ((LJIIL + (i + i2)) - 1))] == C79853Bl.LIZ) {
                this.LJLLILLLL = i2 - 1;
                objArr[(objArr.length - 1) & ((int) (LJIIL() + this.LJLLI + this.LJLLILLLL))] = null;
            } else {
                return;
            }
        }
    }

    public final void LJIIIZ() {
        Object[] objArr;
        Object[] objArr2 = this.LJLJLJ;
        o.LJI(objArr2);
        objArr2[(objArr2.length - 1) & ((int) LJIIL())] = null;
        this.LJLLI--;
        long LJIIL = LJIIL() + 1;
        if (this.LJLJLLL < LJIIL) {
            this.LJLJLLL = LJIIL;
        }
        if (this.LJLL < LJIIL) {
            if (this.LJLILLLLZI != 0 && (objArr = this.LJLIL) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        XLS xls = (XLS) obj;
                        long j = xls.LIZ;
                        if (j >= 0 && j < LJIIL) {
                            xls.LIZ = LJIIL;
                        }
                    }
                }
            }
            this.LJLL = LJIIL;
        }
    }

    public final long LJIIL() {
        return Math.min(this.LJLL, this.LJLJLLL);
    }

    @Override // X.C3BJ
    public final boolean LIZIZ(T t) {
        int i;
        boolean z;
        InterfaceC67352kd<C76800UCe>[] interfaceC67352kdArr = ND2.LJLIL;
        synchronized (this) {
            i = 0;
            if (LJIILJJIL(t)) {
                interfaceC67352kdArr = LJIIJJI(interfaceC67352kdArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = interfaceC67352kdArr.length;
        while (i < length) {
            InterfaceC67352kd<C76800UCe> interfaceC67352kd = interfaceC67352kdArr[i];
            i++;
            if (interfaceC67352kd != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                interfaceC67352kd.resumeWith(c76800UCe);
            }
        }
        return z;
    }

    public final void LJIIJ(Object obj) {
        int i = this.LJLLI + this.LJLLILLLL;
        Object[] objArr = this.LJLJLJ;
        if (objArr == null) {
            objArr = LJIILIIL(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = LJIILIIL(i, objArr.length * 2, objArr);
        }
        objArr[((int) (LJIIL() + i)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object[], java.lang.Object] */
    public final InterfaceC67352kd<C76800UCe>[] LJIIJJI(InterfaceC67352kd<C76800UCe>[] interfaceC67352kdArr) {
        Object[] objArr;
        XLS xls;
        XKS xks;
        int length = interfaceC67352kdArr.length;
        if (this.LJLILLLLZI != 0 && (objArr = this.LJLIL) != null) {
            int length2 = objArr.length;
            int i = 0;
            interfaceC67352kdArr = interfaceC67352kdArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (xks = (xls = (XLS) obj).LIZIZ) != null && LJIILL(xls) >= 0) {
                    int length3 = interfaceC67352kdArr.length;
                    interfaceC67352kdArr = interfaceC67352kdArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC67352kdArr, Math.max(2, interfaceC67352kdArr.length * 2));
                        o.LJIIIIZZ(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        interfaceC67352kdArr = copyOf;
                    }
                    interfaceC67352kdArr[length] = xks;
                    xls.LIZIZ = null;
                    length++;
                }
                i++;
                interfaceC67352kdArr = interfaceC67352kdArr;
            }
        }
        return interfaceC67352kdArr;
    }

    public final boolean LJIILJJIL(T t) {
        if (this.LJLILLLLZI == 0) {
            if (this.LJLJJL != 0) {
                LJIIJ(t);
                int i = this.LJLLI + 1;
                this.LJLLI = i;
                if (i > this.LJLJJL) {
                    LJIIIZ();
                }
                this.LJLL = LJIIL() + this.LJLLI;
            }
            return true;
        }
        if (this.LJLLI >= this.LJLJJLL && this.LJLL <= this.LJLJLLL) {
            int i2 = XKJ.LIZ[this.LJLJL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        LJIIJ(t);
        int i3 = this.LJLLI + 1;
        this.LJLLI = i3;
        if (i3 > this.LJLJJLL) {
            LJIIIZ();
        }
        long LJIIL = LJIIL() + this.LJLLI;
        long j = this.LJLJLLL;
        if (((int) (LJIIL - j)) > this.LJLJJL) {
            LJIIZILJ(j + 1, this.LJLL, LJIIL() + this.LJLLI, LJIIL() + this.LJLLI + this.LJLLILLLL);
        }
        return true;
    }

    public final long LJIILL(XLS xls) {
        long j = xls.LIZ;
        if (j < LJIIL() + this.LJLLI) {
            return j;
        }
        if (this.LJLJJLL > 0 || j > LJIIL() || this.LJLLILLLL == 0) {
            return -1L;
        }
        return j;
    }

    public final Object LJIILLIIL(XLS xls) {
        Object obj;
        InterfaceC67352kd<C76800UCe>[] interfaceC67352kdArr = ND2.LJLIL;
        synchronized (this) {
            long LJIILL = LJIILL(xls);
            if (LJIILL < 0) {
                obj = C79853Bl.LIZ;
            } else {
                long j = xls.LIZ;
                Object[] objArr = this.LJLJLJ;
                o.LJI(objArr);
                obj = objArr[((int) LJIILL) & (objArr.length - 1)];
                if (obj instanceof XLQ) {
                    obj = ((XLQ) obj).LJLJI;
                }
                xls.LIZ = LJIILL + 1;
                interfaceC67352kdArr = LJIJ(j);
            }
        }
        int length = interfaceC67352kdArr.length;
        int i = 0;
        while (i < length) {
            InterfaceC67352kd<C76800UCe> interfaceC67352kd = interfaceC67352kdArr[i];
            i++;
            if (interfaceC67352kd != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                interfaceC67352kd.resumeWith(c76800UCe);
            }
        }
        return obj;
    }

    public final InterfaceC67352kd<C76800UCe>[] LJIJ(long j) {
        Object[] objArr;
        int i;
        long j2 = this.LJLL;
        InterfaceC67352kd<C76800UCe>[] interfaceC67352kdArr = ND2.LJLIL;
        if (j > j2) {
            return interfaceC67352kdArr;
        }
        long LJIIL = LJIIL();
        long j3 = this.LJLLI + LJIIL;
        long j4 = 1;
        if (this.LJLJJLL == 0 && this.LJLLILLLL > 0) {
            j3++;
        }
        if (this.LJLILLLLZI != 0 && (objArr = this.LJLIL) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j5 = ((XLS) obj).LIZ;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.LJLL) {
            return interfaceC67352kdArr;
        }
        long LJIIL2 = LJIIL() + this.LJLLI;
        if (this.LJLILLLLZI > 0) {
            i = Math.min(this.LJLLILLLL, this.LJLJJLL - ((int) (LJIIL2 - j3)));
        } else {
            i = this.LJLLILLLL;
        }
        long j6 = this.LJLLILLLL + LJIIL2;
        if (i > 0) {
            interfaceC67352kdArr = new InterfaceC67352kd[i];
            Object[] objArr2 = this.LJLJLJ;
            o.LJI(objArr2);
            if (LJIIL2 < j6) {
                long j7 = LJIIL2;
                int i2 = 0;
                while (true) {
                    long j8 = LJIIL2 + j4;
                    int i3 = (int) LJIIL2;
                    Object obj2 = objArr2[(objArr2.length - 1) & i3];
                    C3BS c3bs = C79853Bl.LIZ;
                    if (obj2 != c3bs) {
                        if (obj2 != null) {
                            XLQ xlq = (XLQ) obj2;
                            int i4 = i2 + 1;
                            interfaceC67352kdArr[i2] = xlq.LJLJJI;
                            objArr2[(objArr2.length - 1) & i3] = c3bs;
                            objArr2[((int) j7) & (objArr2.length - 1)] = xlq.LJLJI;
                            j7++;
                            if (i4 >= i) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    }
                    if (j8 >= j6) {
                        break;
                    }
                    LJIIL2 = j8;
                    j4 = 1;
                }
                LJIIL2 = j7;
            }
        }
        int i5 = (int) (LJIIL2 - LJIIL);
        if (this.LJLILLLLZI == 0) {
            j3 = LJIIL2;
        }
        long max = Math.max(this.LJLJLLL, LJIIL2 - Math.min(this.LJLJJL, i5));
        if (this.LJLJJLL == 0 && max < j6) {
            Object[] objArr3 = this.LJLJLJ;
            o.LJI(objArr3);
            if (o.LJ(objArr3[((int) max) & (objArr3.length - 1)], C79853Bl.LIZ)) {
                LJIIL2++;
                max++;
            }
        }
        LJIIZILJ(max, j3, LJIIL2, j6);
        LJIIIIZZ();
        if (interfaceC67352kdArr.length == 0) {
            return interfaceC67352kdArr;
        }
        return LJIIJJI(interfaceC67352kdArr);
    }

    public final Object LJII(XLS xls, XLP xlp) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(xlp));
        xks.LJIIL();
        synchronized (this) {
            if (LJIILL(xls) < 0) {
                xls.LIZIZ = xks;
            } else {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                xks.resumeWith(c76800UCe);
            }
        }
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        throw r2.LJJIIJ();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // X.InterfaceC65462ha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC64672gJ<? super T> r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.XLP
            if (r0 == 0) goto L2c
            r7 = r12
            X.XLP r7 = (X.XLP) r7
            int r2 = r7.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.LJLJL = r2
        L12:
            java.lang.Object r9 = r7.LJLJJL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJL
            r6 = 2
            r5 = 3
            r1 = 1
            if (r0 == 0) goto L4d
            if (r0 == r1) goto L46
            if (r0 == r6) goto L3a
            if (r0 != r5) goto L32
            X.V4o r2 = r7.LJLJJI
            X.XLS r3 = r7.LJLJI
            X.2gJ r11 = r7.LJLILLLLZI
            X.XLL r4 = r7.LJLIL
            goto L7e
        L2c:
            X.XLP r7 = new X.XLP
            r7.<init>(r10, r12)
            goto L12
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.V4o r2 = r7.LJLJJI
            X.XLS r3 = r7.LJLJI
            X.2gJ r11 = r7.LJLILLLLZI
            X.XLL r4 = r7.LJLIL
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> Lbb
            goto L81
        L46:
            X.XLS r3 = r7.LJLJI
            X.2gJ r11 = r7.LJLILLLLZI
            X.XLL r4 = r7.LJLIL
            goto L6e
        L4d:
            X.C141335gf.LIZJ(r9)
            X.XLT r3 = r10.LIZLLL()
            X.XLS r3 = (X.XLS) r3
            boolean r0 = r11 instanceof X.C77425Ua5     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L6c
            r0 = r11
            X.Ua5 r0 = (X.C77425Ua5) r0     // Catch: java.lang.Throwable -> Lbd
            r7.LJLIL = r10     // Catch: java.lang.Throwable -> Lbd
            r7.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJI = r3     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJL = r1     // Catch: java.lang.Throwable -> Lbd
            X.UCe r0 = r0.LIZLLL(r7)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r8) goto L6c
            return r8
        L6c:
            r4 = r10
            goto L71
        L6e:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> Lbb
        L71:
            X.MBA r1 = r7.getContext()     // Catch: java.lang.Throwable -> Lbb
            X.3T3 r0 = X.InterfaceC79150V4o.LJJJJJ     // Catch: java.lang.Throwable -> Lbb
            X.MBD r2 = r1.get(r0)     // Catch: java.lang.Throwable -> Lbb
            X.V4o r2 = (X.InterfaceC79150V4o) r2     // Catch: java.lang.Throwable -> Lbb
            goto L81
        L7e:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> Lbb
        L81:
            java.lang.Object r1 = r4.LJIILLIIL(r3)     // Catch: java.lang.Throwable -> Lbb
            X.3BS r0 = X.C79853Bl.LIZ     // Catch: java.lang.Throwable -> Lbb
            if (r1 == r0) goto La3
            if (r2 != 0) goto L8c
            goto L92
        L8c:
            boolean r0 = r2.isActive()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lb5
        L92:
            r7.LJLIL = r4     // Catch: java.lang.Throwable -> Lbb
            r7.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJI = r3     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJJI = r2     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJL = r5     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r11.emit(r1, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != r8) goto L81
            goto Lb4
        La3:
            r7.LJLIL = r4     // Catch: java.lang.Throwable -> Lbb
            r7.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJI = r3     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJJI = r2     // Catch: java.lang.Throwable -> Lbb
            r7.LJLJL = r6     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r4.LJII(r3, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != r8) goto L81
            goto Lba
        Lb4:
            return r8
        Lb5:
            java.util.concurrent.CancellationException r0 = r2.LJJIIJ()     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lba:
            return r8
        Lbb:
            r0 = move-exception
            goto Lbf
        Lbd:
            r0 = move-exception
            r4 = r10
        Lbf:
            r4.LJI(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XLL.collect(X.2gJ, X.2kd):java.lang.Object");
    }

    @Override // X.C3BJ, X.InterfaceC64672gJ
    public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XLQ xlq;
        if (LIZIZ(t)) {
            return C76800UCe.LIZ;
        }
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        InterfaceC67352kd<C76800UCe>[] interfaceC67352kdArr = ND2.LJLIL;
        synchronized (this) {
            if (LJIILJJIL(t)) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                xks.resumeWith(c76800UCe);
                interfaceC67352kdArr = LJIIJJI(interfaceC67352kdArr);
                xlq = null;
            } else {
                xlq = new XLQ(this, this.LJLLI + this.LJLLILLLL + LJIIL(), t, xks);
                LJIIJ(xlq);
                this.LJLLILLLL++;
                if (this.LJLJJLL == 0) {
                    interfaceC67352kdArr = LJIIJJI(interfaceC67352kdArr);
                }
            }
        }
        if (xlq != null) {
            xks.LJIILIIL(new X9J(xlq));
        }
        int length = interfaceC67352kdArr.length;
        int i = 0;
        while (i < length) {
            InterfaceC67352kd<C76800UCe> interfaceC67352kd2 = interfaceC67352kdArr[i];
            i++;
            if (interfaceC67352kd2 != null) {
                C76800UCe c76800UCe2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe2);
                interfaceC67352kd2.resumeWith(c76800UCe2);
            }
        }
        Object LJIIJJI = xks.LJIIJJI();
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        if (LJIIJJI != enumC58928NAu) {
            LJIIJJI = C76800UCe.LIZ;
        }
        if (LJIIJJI == enumC58928NAu) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public XLL(int i, int i2, XKI xki) {
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = xki;
    }

    public final Object[] LJIILIIL(int i, int i2, Object[] objArr) {
        int i3 = 0;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.LJLJLJ = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long LJIIL = LJIIL();
            if (i > 0) {
                while (true) {
                    int i4 = i3 + 1;
                    int i5 = (int) (i3 + LJIIL);
                    objArr2[i5 & (i2 - 1)] = objArr[(objArr.length - 1) & i5];
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return objArr2;
        }
        "Buffer size overflow".toString();
        throw new IllegalStateException("Buffer size overflow");
    }

    @Override // X.InterfaceC79903Bq
    public final InterfaceC65462ha<T> fuse(MBA mba, int i, XKI xki) {
        if ((i == 0 || i == -3) && xki == XKI.SUSPEND) {
            return this;
        }
        return new C3BZ(i, mba, xki, this);
    }

    public final void LJIIZILJ(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        long LJIIL = LJIIL();
        if (LJIIL < min) {
            while (true) {
                long j5 = 1 + LJIIL;
                Object[] objArr = this.LJLJLJ;
                o.LJI(objArr);
                objArr[(objArr.length - 1) & ((int) LJIIL)] = null;
                if (j5 >= min) {
                    break;
                } else {
                    LJIIL = j5;
                }
            }
        }
        this.LJLJLLL = j;
        this.LJLL = j2;
        this.LJLLI = (int) (j3 - min);
        this.LJLLILLLL = (int) (j4 - j3);
    }
}
