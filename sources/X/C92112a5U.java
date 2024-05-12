package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS18S0101000_31;

/* renamed from: X.a5U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92112a5U {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, boolean z, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, boolean z2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<Boolean> interfaceC65784Pro, boolean z3, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC07790Sh LIZIZ;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr3;
        boolean z4 = z3;
        boolean z5 = z;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr;
        boolean z6 = z2;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr6 = interfaceC88471Ynr2;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = interfaceC65784Pro;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-2059040382);
        int i13 = i2 & 1;
        if (i13 != 0) {
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
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z5)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr5)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z6)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i17 = i2 & 16;
        if (i17 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr6)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i18 = i2 & 32;
        if (i18 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i19 = i2 & 64;
        if (i19 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJI(z4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i20 = i2 & 128;
        if (i20 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if (((i3 & 23967451) ^ 4793490) != 0 || !LJIL.LIZ()) {
            if (i13 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i14 != 0) {
                z5 = false;
            }
            if (i15 != 0) {
                interfaceC88471Ynr5 = null;
            }
            if (i16 != 0) {
                z6 = false;
            }
            if (i17 != 0) {
                interfaceC88471Ynr6 = null;
            }
            if (i18 != 0) {
                interfaceC65784Pro2 = C93038aKQ.LJLIL;
            }
            if (i19 != 0) {
                z4 = true;
            }
            if (i20 != 0) {
                interfaceC88471Ynr4 = null;
            }
            if (z4) {
                i12 = 52;
            } else {
                i12 = 44;
            }
            InterfaceC07790Sh LJIIIIZZ = C09290Yb.LJIIIIZZ(interfaceC07790Sh2, i12);
            C44031o7 c44031o7 = C91674ZyQ.LIZ;
            InterfaceC07790Sh LJJIIJZLJL = V0N.LJJIIJZLJL(C09290Yb.LJII(C70657RoD.LJIL(LJIIIIZZ, ((C92121a5d) LJIL.LJIILLIIL(c44031o7)).LJLJJI, 0.0f, ((C92121a5d) LJIL.LJIILLIIL(c44031o7)).LJLJJL, 0.0f, 10)), C93039aKR.LJLIL);
            InterfaceC07760Se.LJJJ.getClass();
            C31631Lz c31631Lz = C07730Sb.LJFF;
            LJIL.LJJIIJ(733328855);
            InterfaceC273215k LIZJ = C0YZ.LIZJ(c31631Lz, false, LJIL);
            LJIL.LJJIIJ(-1323940314);
            C44031o7 c44031o72 = AnonymousClass057.LJ;
            Object LJIILLIIL = LJIL.LJIILLIIL(c44031o72);
            C44031o7 c44031o73 = AnonymousClass057.LJIIJ;
            Object LJIILLIIL2 = LJIL.LJIILLIIL(c44031o73);
            C44031o7 c44031o74 = AnonymousClass057.LJIILJJIL;
            Object LJIILLIIL3 = LJIL.LJIILLIIL(c44031o74);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJJIIJZLJL);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C45891r7 c45891r7 = C03720Cq.LJ;
                C24830yF.LIZ(LJIL, LIZJ, c45891r7);
                C45871r5 c45871r5 = C03720Cq.LIZLLL;
                C24830yF.LIZ(LJIL, LJIILLIIL, c45871r5);
                C45881r6 c45881r6 = C03720Cq.LJFF;
                C24830yF.LIZ(LJIL, LJIILLIIL2, c45881r6);
                C45911r9 c45911r9 = C03720Cq.LJI;
                C24830yF.LIZ(LJIL, LJIILLIIL3, c45911r9);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-2137368960);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                float f = 16;
                InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(c1m1, f, 0.0f, 2);
                C31621Ly c31621Ly = C07730Sb.LJIIJJI;
                LJIL.LJJIIJ(693286680);
                InterfaceC273215k LIZ = C0YX.LIZ(C0YW.LIZ, c31621Ly, LJIL);
                LJIL.LJJIIJ(-1323940314);
                Object LJIILLIIL4 = LJIL.LJIILLIIL(c44031o72);
                Object LJIILLIIL5 = LJIL.LJIILLIIL(c44031o73);
                Object LJIILLIIL6 = LJIL.LJIILLIIL(c44031o74);
                C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIJJ);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, LIZ, c45891r7);
                    C24830yF.LIZ(LJIL, LJIILLIIL4, c45871r5);
                    C24830yF.LIZ(LJIL, LJIILLIIL5, c45881r6);
                    C24830yF.LIZ(LJIL, LJIILLIIL6, c45911r9);
                    LJIL.LJIIIIZZ();
                    LJIIL2.invoke(new C24440xc(LJIL), LJIL, 0);
                    LJIL.LJJIIJ(2058660585);
                    LJIL.LJJIIJ(-678309503);
                    C32391Ox c32391Ox = C32391Ox.LIZ;
                    float f2 = 24;
                    InterfaceC07790Sh LJIIJJI = C09290Yb.LJIIJJI(c1m1, f2);
                    LJIL.LJJIIJ(733328855);
                    InterfaceC273215k LIZJ2 = C0YZ.LIZJ(c31631Lz, false, LJIL);
                    LJIL.LJJIIJ(-1323940314);
                    Object LJIILLIIL7 = LJIL.LJIILLIIL(c44031o72);
                    Object LJIILLIIL8 = LJIL.LJIILLIIL(c44031o73);
                    Object LJIILLIIL9 = LJIL.LJIILLIIL(c44031o74);
                    C40431iJ LJIIL3 = C56509MFt.LJIIL(LJIIJJI);
                    if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                        LJIL.LJIJI();
                        if (LJIL.LJJIL) {
                            LJIL.LJJI(c46041rM);
                        } else {
                            LJIL.LIZIZ();
                        }
                        LJIL.LJJI = false;
                        C24830yF.LIZ(LJIL, LIZJ2, c45891r7);
                        C24830yF.LIZ(LJIL, LJIILLIIL7, c45871r5);
                        C24830yF.LIZ(LJIL, LJIILLIIL8, c45881r6);
                        C24830yF.LIZ(LJIL, LJIILLIIL9, c45911r9);
                        LJIL.LJIIIIZZ();
                        LJIIL3.invoke(new C24440xc(LJIL), LJIL, 0);
                        LJIL.LJJIIJ(2058660585);
                        LJIL.LJJIIJ(-2137368960);
                        C06500Ni.LJ(c32391Ox, z5, null, C06670Nz.LIZLLL(null, 3), C06670Nz.LJ(null, 3), null, C1DJ.LJ(LJIL, -819892982, new IDqS18S0101000_31(i3, interfaceC88471Ynr5, 2)), LJIL, (i3 & 112) | 1600518, 18);
                        LJIL.LJJJJJ(false);
                        LJIL.LJJJJJ(false);
                        LJIL.LJIJ();
                        LJIL.LJJJJJ(false);
                        LJIL.LJJJJJ(false);
                        LIZIZ = C32391Ox.LIZ.LIZIZ(c1m1, true);
                        LJIL.LJJIIJ(733328855);
                        InterfaceC273215k LIZJ3 = C0YZ.LIZJ(c31631Lz, false, LJIL);
                        LJIL.LJJIIJ(-1323940314);
                        Object LJIILLIIL10 = LJIL.LJIILLIIL(c44031o72);
                        Object LJIILLIIL11 = LJIL.LJIILLIIL(c44031o73);
                        Object LJIILLIIL12 = LJIL.LJIILLIIL(c44031o74);
                        C40431iJ LJIIL4 = C56509MFt.LJIIL(LIZIZ);
                        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                            LJIL.LJIJI();
                            if (LJIL.LJJIL) {
                                LJIL.LJJI(c46041rM);
                            } else {
                                LJIL.LIZIZ();
                            }
                            LJIL.LJJI = false;
                            C24830yF.LIZ(LJIL, LIZJ3, c45891r7);
                            C24830yF.LIZ(LJIL, LJIILLIIL10, c45871r5);
                            C24830yF.LIZ(LJIL, LJIILLIIL11, c45881r6);
                            C24830yF.LIZ(LJIL, LJIILLIIL12, c45911r9);
                            LJIL.LJIIIIZZ();
                            LJIIL4.invoke(new C24440xc(LJIL), LJIL, 0);
                            LJIL.LJJIIJ(2058660585);
                            LJIL.LJJIIJ(-2137368960);
                            LJIL.LJJIIJ(-796342591);
                            if (interfaceC88471Ynr4 != null) {
                                interfaceC88471Ynr4.invoke(LJIL, Integer.valueOf((i3 >> 21) & 14));
                            }
                            LJIL.LJJJJJ(false);
                            LJIL.LJJJJJ(false);
                            LJIL.LJJJJJ(false);
                            LJIL.LJIJ();
                            LJIL.LJJJJJ(false);
                            LJIL.LJJJJJ(false);
                            InterfaceC07790Sh LJIIJJI2 = C09290Yb.LJIIJJI(c1m1, f2);
                            LJIL.LJJIIJ(733328855);
                            InterfaceC273215k LIZJ4 = C0YZ.LIZJ(c31631Lz, false, LJIL);
                            LJIL.LJJIIJ(-1323940314);
                            Object LJIILLIIL13 = LJIL.LJIILLIIL(c44031o72);
                            Object LJIILLIIL14 = LJIL.LJIILLIIL(c44031o73);
                            Object LJIILLIIL15 = LJIL.LJIILLIIL(c44031o74);
                            C40431iJ LJIIL5 = C56509MFt.LJIIL(LJIIJJI2);
                            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                                LJIL.LJIJI();
                                if (LJIL.LJJIL) {
                                    LJIL.LJJI(c46041rM);
                                } else {
                                    LJIL.LIZIZ();
                                }
                                LJIL.LJJI = false;
                                C24830yF.LIZ(LJIL, LIZJ4, c45891r7);
                                C24830yF.LIZ(LJIL, LJIILLIIL13, c45871r5);
                                C24830yF.LIZ(LJIL, LJIILLIIL14, c45881r6);
                                C24830yF.LIZ(LJIL, LJIILLIIL15, c45911r9);
                                LJIL.LJIIIIZZ();
                                LJIIL5.invoke(new C24440xc(LJIL), LJIL, 0);
                                LJIL.LJJIIJ(2058660585);
                                LJIL.LJJIIJ(-2137368960);
                                C06500Ni.LJ(c32391Ox, z6, null, C06670Nz.LIZLLL(null, 3), C06670Nz.LJ(null, 3), null, C1DJ.LJ(LJIL, -819893265, new IDqS18S0101000_31(i3, interfaceC88471Ynr6, 3)), LJIL, ((i3 >> 6) & 112) | 1600518, 18);
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                if (interfaceC65784Pro2.invoke().booleanValue()) {
                                    C21690tB.LIZ(C09290Yb.LJII(C70657RoD.LJIJJ(C09280Ya.LIZ(c1m1, C07730Sb.LJIIIIZZ), f, 0.0f, 2)), C91671ZyN.LIZ(LJIL).LJI, (float) 0.5d, 0.0f, LJIL, 384, 8);
                                }
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                                LJIL.LJIJ();
                                LJIL.LJJJJJ(false);
                                LJIL.LJJJJJ(false);
                            } else {
                                C78929UyL.LJIILJJIL();
                                throw null;
                            }
                        } else {
                            C78929UyL.LJIILJJIL();
                            throw null;
                        }
                    } else {
                        C78929UyL.LJIILJJIL();
                        throw null;
                    }
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
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
        LJJJJLI.LIZLLL = new C93040aKS(interfaceC07790Sh2, z5, interfaceC88471Ynr5, z6, interfaceC88471Ynr6, interfaceC65784Pro2, z4, interfaceC88471Ynr4, i, i2);
    }
}
