package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.a45, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92025a45 {
    public static final void LIZ(String text, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1270634755);
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
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if (((i3 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            int i7 = ((i3 >> 3) & 14) | 384;
            LJIL.LJJIIJ(693286680);
            InterfaceC273215k LIZ = C0YX.LIZ(C0YW.LIZ, c31621Ly, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i8 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
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
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i8 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-678309503);
                if (((i8 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    if ((((((i7 >> 6) & 112) | 6) & 81) ^ 16) != 0 || !LJIL.LIZ()) {
                        AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.j9, LJIL);
                        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                        C0SR.LIZ(LJJIIZ, "", C09290Yb.LJIIJJI(c1m1, 12), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(LJIL).LJIILJJIL), LJIL, 440, 56);
                        C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 4), LJIL, 6);
                        C21430sl.LIZIZ(text, null, 0L, 0L, null, null, null, 0L, null, null, C79043V0l.LJIIIIZZ(16), 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LIZIZ(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LJIILJJIL, 0L, null, null, 262142), LJIL, i3 & 14, 6, 31742);
                    } else {
                        LJIL.LIZLLL();
                    }
                } else {
                    LJIL.LIZLLL();
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
        LJJJJLI.LIZLLL = new C92939aIp(text, interfaceC07790Sh2, i, i2);
    }
}
