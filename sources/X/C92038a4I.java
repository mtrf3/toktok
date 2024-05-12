package X;

import androidx.compose.ui.platform.g1;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS0S1210000_31;
import kotlin.jvm.internal.IDqS12S0101000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a4I, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92038a4I {
    public static final void LIZ(Object obj, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-2059537939);
        if (obj instanceof Integer) {
            LJIL.LJJIIJ(-2059537870);
            C0SR.LIZ(C79081V1x.LJJIIZ(((Number) obj).intValue(), LJIL), null, C09290Yb.LJIIL(InterfaceC07790Sh.LJJJI, 32, 20), null, null, 0.0f, null, LJIL, 440, LiveTryModeCountDownThresholdSetting.DEFAULT);
            LJIL.LJJJJJ(false);
        } else if (obj instanceof String) {
            LJIL.LJJIIJ(-2059537656);
            C92060a4e.LIZ(obj, C09290Yb.LJIIL(InterfaceC07790Sh.LJJJI, 32, 20), null, null, LJIL, 56, 12);
            LJIL.LJJJJJ(false);
        } else {
            LJIL.LJJIIJ(-2059537510);
            LJIL.LJJJJJ(false);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS12S0101000_31(i, obj, 5);
    }

    public static final void LIZIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> mainContent, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> trailingContent, boolean z, boolean z2, C1OH c1oh, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C1OH c1oh2;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2 = interfaceC88471Ynr;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        C1OH c1oh3 = c1oh;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        boolean z3 = z;
        boolean z4 = z2;
        o.LJIIIZ(mainContent, "mainContent");
        o.LJIIIZ(trailingContent, "trailingContent");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1379898392);
        int i12 = i2 & 1;
        if (i12 != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(mainContent)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(trailingContent)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJI(z3)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJI(z4)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(c1oh3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if (((i3 & 23967451) ^ 4793490) != 0 || !LJIL.LIZ()) {
            if (i12 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i13 != 0) {
                interfaceC88471Ynr2 = C92035a4F.LIZ;
            }
            if (i14 != 0) {
                z3 = false;
            }
            if (i15 != 0) {
                z4 = true;
            }
            if (i16 != 0) {
                LJIL.LJJIIJ(-492369756);
                Object LJJJZ = LJIL.LJJJZ();
                InterfaceC24520xk.LIZ.getClass();
                if (LJJJZ == C24500xi.LIZIZ) {
                    LJJJZ = new C42191l9();
                    LJIL.LJLJLLL(LJJJZ);
                }
                LJIL.LJJJJJ(false);
                c1oh3 = (C1OH) LJJJZ;
            }
            if (i17 != 0) {
                interfaceC65784Pro2 = C92975aJP.LJLIL;
            }
            InterfaceC07790Sh LJII = C09290Yb.LJII(interfaceC07790Sh2);
            if (c1oh3 == null) {
                LJIL.LJJIIJ(-492369756);
                Object LJJJZ2 = LJIL.LJJJZ();
                InterfaceC24520xk.LIZ.getClass();
                if (LJJJZ2 == C24500xi.LIZIZ) {
                    LJJJZ2 = new C42191l9();
                    LJIL.LJLJLLL(LJJJZ2);
                }
                LJIL.LJJJJJ(false);
                c1oh2 = (C1OH) LJJJZ2;
            } else {
                c1oh2 = c1oh3;
            }
            InterfaceC07790Sh LIZ = C07770Sf.LIZ(LJII, g1.LIZ, new IDqS0S1210000_31(z4, (String) null, c1oh2, interfaceC65784Pro2, 8));
            LJIL.LJJIIJ(733328855);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
            LJIL.LJJIIJ(-1323940314);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            Object LJIILLIIL = LJIL.LJIILLIIL(c44031o7);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LIZ);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-2137368960);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                C92039a4J.LIZ(C70657RoD.LJIJ(c1m1, 16), mainContent, interfaceC88471Ynr2, trailingContent, ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJIJ(44), ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJIJ(4), ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJIJ(12), LJIL, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168), 0);
                if (z3) {
                    C21690tB.LIZ(C09280Ya.LIZ(C09290Yb.LJII(c1m1), C07730Sb.LJIIIIZZ), C91671ZyN.LIZ(LJIL).LJII, (float) 0.5d, 0.0f, LJIL, 384, 8);
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
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92976aJQ(interfaceC07790Sh2, mainContent, interfaceC88471Ynr2, trailingContent, z3, z4, c1oh3, interfaceC65784Pro2, i, i2);
    }
}
