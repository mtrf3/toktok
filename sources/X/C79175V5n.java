package X;

/* renamed from: X.V5n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79175V5n {
    public static final long LIZ = C78897Uxp.LJFF(4294847573L);
    public static final long LIZIZ = C78897Uxp.LJFF(4280677614L);
    public static final /* synthetic */ int LIZJ = 0;

    public static final void LIZIZ(InterfaceC07790Sh interfaceC07790Sh, boolean z, float f, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        float f2 = f;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z2 = z;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1936479983);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJII(f2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) != 146 || !LJIL.LIZ()) {
            if (i7 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i8 != 0) {
                z2 = true;
            }
            if (i9 != 0) {
                f2 = 0.0f;
            }
            InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(AnonymousClass057.LJ);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = C78966Uyw.LJJJIL(Integer.valueOf(interfaceC23370vt.LJJIJ(36)));
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            Boolean valueOf = Boolean.valueOf(z2);
            LJIL.LJJIIJ(1157296644);
            boolean LJIJJ = LJIL.LJIJJ(valueOf);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                if (z2) {
                    j = System.nanoTime() / 1000000;
                } else {
                    j = 0;
                }
                LJJJZ2 = C78966Uyw.LJJJIL(Long.valueOf(j));
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            boolean z3 = z2;
            C09300Yc.LIZ(interfaceC07790Sh2, null, false, C1DJ.LJ(LJIL, -203243559, new C79176V5o(z3, f2, i3, (InterfaceC35811ar) LJJJZ2, interfaceC35811ar)), LJIL, (i3 & 14) | 3072, 6);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C79213V6z(interfaceC07790Sh2, z2, f2, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C79188V6a r15, boolean r16, float r17, float r18, X.InterfaceC07790Sh r19, X.InterfaceC24520xk r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79175V5n.LIZ(X.V6a, boolean, float, float, X.0Sh, X.0xk, int, int):void");
    }
}
