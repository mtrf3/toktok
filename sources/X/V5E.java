package X;

/* loaded from: classes14.dex */
public final class V5E {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-617062917);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !LJIL.LIZ()) {
            if (i5 != 0) {
                interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
            }
            int i6 = i3 & 14;
            LJIL.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh);
            int i7 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, Integer.valueOf((i7 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                if (((i7 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    if (((((i6 >> 6) & 112) | 6) & 81) != 16 || !LJIL.LIZ()) {
                        C24920yO.LIZ(C252579vh.LJLIL, null, null, LJIL, 6, 6);
                    } else {
                        LJIL.LIZLLL();
                    }
                } else {
                    LJIL.LIZLLL();
                }
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
        LJJJJLI.LIZLLL = new C252589vi(interfaceC07790Sh, i, i2);
    }
}
