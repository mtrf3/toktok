package X;

import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS0S1210000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a89, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92277a89 implements InterfaceC91775a03 {
    @Override // X.InterfaceC91775a03
    public final void LIZ(String prefix, boolean z, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1044218525);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(prefix)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(onClick)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (((i2 & 731) ^ 146) != 0 || !LJIL.LIZ()) {
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LIZ = C07770Sf.LIZ(C09410Yn.LIZ(c1m1, EnumC09340Yg.Min), g1.LIZ, new IDqS0S1210000_31(true, (String) null, (C1OH) new C42191l9(), (InterfaceC65784Pro) onClick, 7));
            LJIL.LJJIIJ(693286680);
            InterfaceC273215k LIZ2 = C0YX.LIZ(C0YW.LIZ, c31621Ly, LJIL);
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
                LJIL.LJJIIJ(-678309503);
                float f = 16;
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, f), LJIL, 6);
                C21430sl.LIZIZ(prefix, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LIZLLL(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LIZJ, 0L, null, null, 262142), LJIL, i2 & 14, 0, 32766);
                LJIL.LJJIIJ(-1192218551);
                if (z) {
                    C0SR.LIZ(C79081V1x.LJJIIZ(R.drawable.ie, LJIL), null, C09290Yb.LJIIJJI(C70657RoD.LJIL(c1m1, 2, 0.0f, 0.0f, 0.0f, 14), f), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(LJIL).LIZJ), LJIL, 440, 56);
                }
                LJIL.LJJJJJ(false);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, (float) 6.5d), LJIL, 6);
                C21690tB.LIZ(C09290Yb.LJIILIIL(C09290Yb.LJIIIIZZ(c1m1, 10), (float) 0.5d), C91671ZyN.LIZ(LJIL).LJII, 0.0f, 0.0f, LJIL, 6, 12);
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
        LJJJJLI.LIZLLL = new C92952aJ2(this, prefix, z, onClick, i);
    }
}
