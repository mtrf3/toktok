package X;

import androidx.compose.ui.platform.g1;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS18S0101000_31;

/* renamed from: X.a22, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91898a22 {
    public static final void LIZ(C1ZD c1zd, boolean z, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        long j;
        InterfaceC07790Sh LJI;
        InterfaceC07790Sh LIZLLL;
        InterfaceC07790Sh LIZIZ;
        C1I9 LJIIJ;
        C1IB LJIILIIL;
        C35931b3 c35931b3;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        C11850dJ c11850dJ2 = c11850dJ;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-573132904);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(c1zd)) {
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
            if (LJIL.LJI(z)) {
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
            if (LJIL.LJIJJ(interfaceC11790dD2)) {
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
            if (LJIL.LJIJJ(c11850dJ2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        if (((46811 & i3) ^ 9362) != 0 || !LJIL.LIZ()) {
            if (i9 != 0) {
                interfaceC11790dD2 = null;
            }
            if (i10 != 0) {
                c11850dJ2 = null;
            }
            if (z) {
                f = 0.4f;
            } else {
                f = 0.0f;
            }
            if (c11850dJ2 == null) {
                if (C91671ZyN.LIZ) {
                    j = C11850dJ.LIZIZ;
                } else {
                    j = C11850dJ.LIZJ;
                }
            } else {
                j = c11850dJ2.LIZ;
            }
            long LIZIZ2 = C11850dJ.LIZIZ(j, f);
            if (interfaceC11790dD2 == null || (LJI = C78840Uwu.LJI(InterfaceC07790Sh.LJJJI, interfaceC11790dD2)) == null) {
                LJI = InterfaceC07790Sh.LJJJI;
            }
            C21700tC.LIZ(C91900a24.LIZ, LJI, c1zd, null, 0.0f, 0L, 0L, C11850dJ.LJFF, C91900a24.LIZIZ, LJIL, ((i3 << 6) & 896) | 113246214, LiveTryModeCountDownThresholdSetting.DEFAULT);
            LIZLLL = C78996UzQ.LIZLLL(LJI, LIZIZ2, C11710d5.LIZ);
            InterfaceC07790Sh LIZ = C07770Sf.LIZ(C09290Yb.LJII(LIZLLL), g1.LIZ, new C92755aFr(false, null, new C42191l9()));
            LJIL.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ2 = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
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
                C24830yF.LIZ(LJIL, LIZ2, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                C1P2 c1p2 = C1P2.LIZ;
                LIZIZ = C1P2.LIZ.LIZIZ(InterfaceC07790Sh.LJJJI, true);
                C79057V0z.LJ(LIZIZ, LJIL, 0);
                LJIIJ = C06670Nz.LJIIJ(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C92751aFn.LJLIL);
                LJIILIIL = C06670Nz.LJIILIIL(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C92752aFo.LJLIL);
                c35931b3 = LJIL;
                C06500Ni.LIZLLL(c1p2, z, null, LJIIJ, LJIILIIL, null, C1DJ.LJ(LJIL, -819891548, new IDqS18S0101000_31(i3, interfaceC88471Ynr, 1)), c35931b3, 1600518 | (i3 & 112), 18);
                c35931b3.LJJJJJ(false);
                c35931b3.LJJJJJ(false);
                c35931b3.LJIJ();
                c35931b3.LJJJJJ(false);
                c35931b3.LJJJJJ(false);
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
            c35931b3 = LJIL;
        }
        C35991b9 LJJJJLI = c35931b3.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92753aFp(c1zd, z, interfaceC11790dD2, c11850dJ2, interfaceC88471Ynr, i, i2);
    }
}
