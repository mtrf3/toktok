package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class V50 {
    public static final void LIZJ(V53 v53, InterfaceC35811ar<Integer> interfaceC35811ar, boolean z, float f) {
        double intValue = f / (interfaceC35811ar.getValue().intValue() / 5);
        if (C90193gN.LIZ()) {
            intValue = 5 - intValue;
        }
        int LJIIJ = (int) C78842Uww.LJIIJ(Math.ceil(intValue), 1.0d, 5.0d);
        System.out.println((Object) KMP.LJ("Float rating ", LJIIJ));
        if (v53 != null) {
            v53.LIZIZ(LJIIJ, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(float r21, float r22, X.InterfaceC07790Sh r23, X.InterfaceC24520xk r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V50.LIZ(float, float, X.0Sh, X.0xk, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v46 */
    public static final void LIZIZ(float f, float f2, InterfaceC07790Sh interfaceC07790Sh, V53 v53, float f3, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        V53 v532 = v53;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        float f4 = f3;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1086541597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJII(f)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJII(f2)) {
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
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(v532)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJII(f4)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        if ((46811 & i3) != 9362 || !LJIL.LIZ()) {
            if (i9 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i10 != 0) {
                v532 = null;
            }
            if (i11 != 0) {
                f4 = 0.0f;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            Object obj = C24500xi.LIZIZ;
            ?? r2 = 0;
            if (LJJJZ == obj) {
                LJJJZ = C78966Uyw.LJJJIL(0);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            InterfaceC07790Sh LIZIZ = C11F.LIZIZ(C11F.LIZIZ(interfaceC07790Sh2, c76800UCe, new C79161V4z(v532, interfaceC35811ar, null)), c76800UCe, new C79160V4y(v532, interfaceC35811ar, null));
            LJIL.LJJIIJ(1157296644);
            boolean LJIJJ = LJIL.LJIJJ(interfaceC35811ar);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == obj) {
                LJJJZ2 = new AqS179S0100000_13(interfaceC35811ar, (InterfaceC35811ar<C10430b1>) 519);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            InterfaceC07790Sh LJJI = C77413UZt.LJJI(LIZIZ, (InterfaceC88472Yns) LJJJZ2);
            C32331Or c32331Or = C0YW.LJFF;
            LJIL.LJJIIJ(693286680);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C0YX.LIZ(c32331Or, C07730Sb.LJIIJ, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJJI);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, 2058660585, -678309503);
                int i12 = 0;
                do {
                    LJIL.LJJIIJ(21582591);
                    if (i12 != 0) {
                        C79057V0z.LJ(C09290Yb.LJIILIIL(InterfaceC07790Sh.LJJJI, f2), LJIL, r2);
                    }
                    LJIL.LJJJJJ(r2);
                    C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                    LJIL.LJJIIJ(733328855);
                    InterfaceC07760Se.LJJJ.getClass();
                    InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, r2, LJIL);
                    LJIL.LJJIIJ(-1323940314);
                    Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJ);
                    Object LJIILLIIL4 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                    InterfaceC015404g interfaceC015404g2 = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                    InterfaceC03730Cr.LJ.getClass();
                    C46041rM c46041rM2 = C03720Cq.LIZIZ;
                    C40431iJ LJIIL2 = C56509MFt.LJIIL(c1m1);
                    if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                        LJIL.LJIJI();
                        if (LJIL.LJJIL) {
                            LJIL.LJJI(c46041rM2);
                        } else {
                            LJIL.LIZIZ();
                        }
                        LJIL.LJJI = false;
                        C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LJ);
                        C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LIZLLL);
                        C24830yF.LIZ(LJIL, LJIILLIIL4, C03720Cq.LJFF);
                        C06460Ne.LIZLLL(0, LJIIL2, V10.LIZLLL(LJIL, interfaceC015404g2, C03720Cq.LJI, LJIL), LJIL, 2058660585, -2137368960);
                        r2 = 0;
                        LIZ(((Number) C78842Uww.LJIILJJIL(Float.valueOf(f4 - i12), new C48352IyK(0.0f, 1.0f))).floatValue(), f, null, LJIL, (i3 << 3) & 112, 4);
                        LJIL.LJJJJJ(false);
                        LJIL.LJJJJJ(false);
                        LJIL.LJIJ();
                        LJIL.LJJJJJ(false);
                        LJIL.LJJJJJ(false);
                        i12++;
                    } else {
                        C78929UyL.LJIILJJIL();
                        throw null;
                    }
                } while (i12 < 5);
                V52.LIZ(LJIL, false, false, false, false);
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V51(f, f2, interfaceC07790Sh2, v532, f4, i, i2);
    }
}
