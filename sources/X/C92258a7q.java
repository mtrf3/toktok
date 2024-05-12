package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92258a7q implements InterfaceC91775a03 {
    @Override // X.InterfaceC91775a03
    public final void LIZ(String prefix, boolean z, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-160939569);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(prefix)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((2 ^ (i2 & 11)) != 0 || !LJIL.LIZ()) {
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LIZ = C09410Yn.LIZ(c1m1, EnumC09340Yg.Min);
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
                C21430sl.LIZIZ(prefix, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJFF(C21350sd.LIZJ(LJIL), LJIL), C91733ZzN.LIZIZ(), 0L, null, null, 262142), LJIL, i2 & 14, 0, 32766);
                float f = (float) 6.5d;
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, f), LJIL, 6);
                C21690tB.LIZ(C09290Yb.LJIILIIL(C09290Yb.LJIIIIZZ(c1m1, 10), (float) 0.5d), C91671ZyN.LIZ(LJIL).LJII, 0.0f, 0.0f, LJIL, 6, 12);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, f), LJIL, 6);
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
        LJJJJLI.LIZLLL = new C92917aIT(this, prefix, z, onClick, i);
    }
}
