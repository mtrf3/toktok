package X;

import android.view.View;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.IDqS7S0400000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a1T, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91863a1T {
    public static final void LIZ(boolean z, C92283a8F eventSender, InterfaceC65784Pro<C76800UCe> onQuit, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(eventSender, "eventSender");
        o.LJIIIZ(onQuit, "onQuit");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1705097874);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = new C92158a6E(null);
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        C92158a6E c92158a6E = (C92158a6E) LJJJZ;
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        LJIL.LJJIIJ(773894976);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJJJZ2 == c24490xh) {
            LJJJZ2 = new C35821as(C24610xt.LJII(MBB.INSTANCE, LJIL));
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJJJZ2).LJLIL;
        LJIL.LJJJJJ(false);
        InterfaceC91773a01 dialog = C91665ZyH.LIZ().getDialog();
        if (z) {
            C15980jy.LIZ(false, new C92674aEY(c92158a6E, dialog, view, interfaceC70422pa, eventSender, onQuit), LJIL, 0, 1);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92675aEZ(z, eventSender, onQuit, i);
    }

    public static final void LIZIZ(InterfaceC91773a01 dialog, C92158a6E controller, View view, InterfaceC70422pa scope, C92283a8F eventSender, InterfaceC65784Pro onQuit) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(eventSender, "eventSender");
        o.LJIIIZ(onQuit, "onQuit");
        eventSender.LJIIJJI(EnumC92043a4N.QuitTransaction.getPopupId(), C47261Igj.LJJIJIIJI(EnumC92042a4M.ContinueToPay.getObjId(), EnumC92042a4M.Quit.getObjId()));
        dialog.LIZ(view, controller, C92054a4Y.LIZ("pipo_payin_quit_title", new String[0]), C92054a4Y.LIZ("pipo_payin_quit_content", new String[0]), C92054a4Y.LIZ("pipo_payin_quit_continue_pay", new String[0]), new IDqS178S0200000_31(controller, eventSender, 7), C92054a4Y.LIZ("pipo_common_quit", new String[0]), new IDqS7S0400000_31(eventSender, controller, scope, onQuit, 6), C91868a1Y.LIZ, C91992a3Y.LJ(), C91992a3Y.LIZLLL(), C92698aEw.LJLIL);
    }
}
