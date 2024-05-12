package X;

import android.content.res.Configuration;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.165, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass165 {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC536028m, ? super C23360vs, ? extends InterfaceC273515n> measurePolicy, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(measurePolicy, "measurePolicy");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            if (LJIL.LJIJJ(measurePolicy)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) != 18 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = new AnonymousClass167();
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            int i7 = i3 << 3;
            LIZIZ((AnonymousClass167) LJJJZ, interfaceC07790Sh2, measurePolicy, LJIL, (i7 & 112) | 8 | (i7 & 896), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C537128x(interfaceC07790Sh2, measurePolicy, i, i2);
    }

    public static final void LIZIZ(AnonymousClass167 state, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC536028m, ? super C23360vs, ? extends InterfaceC273515n> measurePolicy, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(measurePolicy, "measurePolicy");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-511989831);
        if ((i2 & 2) != 0) {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        AbstractC24810yD LJJ = C78929UyL.LJJ(LJIL);
        InterfaceC07790Sh LIZJ = C07770Sf.LIZJ(LJIL, interfaceC07790Sh2);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        Object obj = LJJJZ;
        if (LJJJZ == c24490xh) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add("fmp");
            LJIL.LJLJLLL(linkedHashSet);
            obj = linkedHashSet;
        }
        LJIL.LJJJJJ(false);
        java.util.Set set = (java.util.Set) obj;
        C29321Dc c29321Dc = (C29321Dc) C29321Dc.LLIILZL.invoke();
        if (set.contains("fmp")) {
            IDqS443S0100000 iDqS443S0100000 = state.LIZJ;
            IDqS443S0100000 iDqS443S01000002 = state.LIZLLL;
            iDqS443S0100000.invoke(c29321Dc, state);
            iDqS443S01000002.invoke(c29321Dc, LJJ);
            set.remove("fmp");
        }
        IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(c29321Dc, 190);
        LJIL.LJJIIJ(1886828752);
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJLI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(new IDqS420S0100000((InterfaceC65784Pro) iDqS420S0100000, 189));
            } else {
                LJIL.LIZIZ();
            }
            C24830yF.LIZ(LJIL, state, state.LIZJ);
            C24830yF.LIZ(LJIL, LJJ, state.LIZLLL);
            C24830yF.LIZ(LJIL, measurePolicy, state.LJ);
            InterfaceC03730Cr.LJ.getClass();
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
            C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LIZJ);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJIIJ(-607848313);
            if (!LJIL.LIZ()) {
                C24610xt.LJI(new C537228y(state), LJIL);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(state, LJIL);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            LJIL.LJJIIJ(1157296644);
            boolean LJIJJ = LJIL.LJIJJ(LJJJJIZL);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                LJJJZ2 = new IDqS416S0100000(LJJJJIZL, (InterfaceC35811ar<Configuration>) 372);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LIZIZ(c76800UCe, (InterfaceC88472Yns) LJJJZ2, LJIL);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new C537328z(state, interfaceC07790Sh2, measurePolicy, i, i2);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
