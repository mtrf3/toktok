package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS1S0102000_31;

/* renamed from: X.Zzb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91747Zzb {
    public static final void LIZ(List<String> list, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        List<String> list2 = list;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1749210968);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (((~i2) & 1) != 0 || ((i3 & 11) ^ 2) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i4 != 0) {
                    list2 = C61878OQg.INSTANCE;
                }
            } else {
                LJIL.LIZLLL();
            }
            LJIL.LJJJJJL();
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(C09290Yb.LJIIIIZZ(C09290Yb.LJII(c1m1), 40), 0.0f, 10, 1);
            LJIL.LJJIIJ(733328855);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIJJ);
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
                C06480Ng.LIZIZ(list2, null, C92478aBO.LJLIL, null, C91729ZzJ.LIZ, LJIL, 24968, 10);
                C0SR.LIZ(C79081V1x.LJJIIZ(R.drawable.ic, LJIL), "", C92004a3k.LIZ(C09280Ya.LIZ(c1m1, C07730Sb.LJI)), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(LJIL).LIZIZ), LJIL, 56, 56);
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
        LJJJJLI.LIZLLL = new IDqS1S0102000_31(list2, (List<String>) i, i2, 0);
    }
}
