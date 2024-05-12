package X;

import android.view.View;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.IDqS33S0300000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a1e, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91874a1e {
    public static final void LIZIZ(C92158a6E controller, View view, InterfaceC65784Pro onQuit) {
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onQuit, "onQuit");
        C91992a3Y.LJI(view, controller, "Quit the transaction?", null, "Just few steps to finish the transaction", "Continue to bind", new IDqS422S0100000_31(controller, 80), "Quit", new IDqS178S0200000_31(controller, onQuit, 9), null, 3844);
    }

    public static final void LIZ(boolean z, InterfaceC65784Pro<C76800UCe> onQuit, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(onQuit, "onQuit");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1453274067);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(onQuit)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = new C92158a6E(null);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            C92158a6E c92158a6E = (C92158a6E) LJJJZ;
            View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
            if (z) {
                C15980jy.LIZ(false, new IDqS33S0300000_31(c92158a6E, (C92158a6E) view, (View) onQuit, (InterfaceC65784Pro<C76800UCe>) 4), LJIL, 0, 1);
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92713aFB(i, z, onQuit);
    }
}
