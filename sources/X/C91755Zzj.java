package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.o;

/* renamed from: X.Zzj, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91755Zzj {
    public static final void LIZ(String text, boolean z, boolean z2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC07790Sh LIZIZ;
        boolean z3 = z2;
        boolean z4 = z;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1455869710);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
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
            if (LJIL.LJI(z4)) {
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
            if (LJIL.LJI(z3)) {
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
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if (((i3 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            if (i8 != 0) {
                z4 = false;
            }
            if (i9 != 0) {
                z3 = true;
            }
            if (i10 != 0) {
                interfaceC88472Yns2 = C92505aBp.LJLIL;
            }
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            float f = 16;
            InterfaceC07790Sh border = C09290Yb.LJII(C70657RoD.LJIJI(C09290Yb.LJIIIIZZ(c1m1, 80), f, 12));
            long j = C91671ZyN.LIZ(LJIL).LJFF;
            C43401n6 LIZ = C17480mO.LIZ(8);
            o.LJIIIZ(border, "$this$border");
            z3 = z3;
            InterfaceC07790Sh LIZ2 = C07770Sf.LIZ(C70657RoD.LJIJJ(C78999UzT.LJII(1, border, new C32691Qb(j), LIZ), f, 0.0f, 2), g1.LIZ, new C92504aBo(z3, null, new C42191l9(), interfaceC88472Yns2, z4));
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            LJIL.LJJIIJ(693286680);
            InterfaceC273215k LIZ3 = C0YX.LIZ(C0YW.LIZ, c31621Ly, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LIZ2);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZ3, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-678309503);
                C92067a4l.LIZ(z4, LJIL, (i3 >> 3) & 14);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 11), LJIL, 6);
                C08370Un LIZ4 = C08370Un.LIZ(C91676ZyS.LJFF(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LIZJ, 0L, null, null, 262142);
                LIZIZ = C32391Ox.LIZ.LIZIZ(c1m1, true);
                C21430sl.LIZIZ(text, LIZIZ, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, null, LIZ4, LJIL, i3 & 14, 3120, 22524);
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
        LJJJJLI.LIZLLL = new C92506aBq(text, z4, z3, interfaceC88472Yns2, i, i2);
    }
}
