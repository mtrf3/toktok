package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a21, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91897a21 {
    public static final void LIZIZ(InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> interfaceC88472Yns, C92145a61 c92145a61, C92283a8F c92283a8F, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-327967528);
        LJIL.LJJIIJ(773894976);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = new C35821as(C24610xt.LJII(MBB.INSTANCE, LJIL));
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJJJZ).LJLIL;
        LJIL.LJJJJJ(false);
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJJJZ2 == c24490xh) {
            LJJJZ2 = new C92158a6E(null);
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        InterfaceC91773a01 dialog = C91665ZyH.LIZ().getDialog();
        C24610xt.LJ(C76800UCe.LIZ, new C93100aLQ(interfaceC70422pa, c92145a61, interfaceC88472Yns, null), LJIL);
        C15980jy.LIZ(false, new C92762aFy(c92145a61, (C92158a6E) LJJJZ2, dialog, view, interfaceC70422pa, c92283a8F, interfaceC65784Pro), LJIL, 0, 1);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92763aFz(interfaceC88472Yns, c92145a61, c92283a8F, interfaceC65784Pro, i);
    }

    public static final void LIZ(C92145a61 navController, InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> onNavBarChange, CheckoutViewModel viewModel, C92283a8F eventSender, CheckoutUiState uiState, InterfaceC65784Pro<String> getFormatterAmount, InterfaceC88472Yns<? super Boolean, C76800UCe> onClose, InterfaceC24520xk interfaceC24520xk, int i) {
        float f;
        C1I9 LJIIJ;
        C1IB LJIILIIL;
        o.LJIIIZ(navController, "navController");
        o.LJIIIZ(onNavBarChange, "onNavBarChange");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(eventSender, "eventSender");
        o.LJIIIZ(uiState, "uiState");
        o.LJIIIZ(getFormatterAmount, "getFormatterAmount");
        o.LJIIIZ(onClose, "onClose");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-756983674);
        C44031o7 c44031o7 = AnonymousClass057.LJ;
        float LJJJLL = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJJLL(uiState.getStatusBarHeight());
        float LJJJLL2 = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJJLL(uiState.getNavigationBarHeight());
        if (uiState.getNavBarState().isFullScreen()) {
            f = 0;
        } else {
            f = 8;
        }
        float LJJJJIZL = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJJJIZL(80);
        C31431Lf LJJIJIIJI = C78841Uwv.LJJIJIIJI(LJIL);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        if (LJJJZ == C24500xi.LIZIZ) {
            LJJJZ = C78966Uyw.LJIJI(new C92761aFx(LJJIJIIJI, LJJJJIZL));
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        LIZIZ(onNavBarChange, navController, eventSender, new IDqS178S0200000_31((InterfaceC88472Yns) onClose, (InterfaceC88472Yns<? super Boolean, C76800UCe>) eventSender, (C92283a8F) 11), LJIL, ((i >> 3) & 14) | 576);
        boolean showContent = uiState.getShowContent();
        LJIIJ = C06670Nz.LJIIJ(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C92757aFt.LJLIL);
        LJIILIIL = C06670Nz.LJIILIIL(C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1), C92758aFu.LJLIL);
        C06500Ni.LJFF(showContent, null, LJIIJ, LJIILIIL, null, C1DJ.LJ(LJIL, -819893460, new C92759aFv(uiState, LJJJLL, f, LJJJLL2, (InterfaceC24760y8) LJJJZ, getFormatterAmount, eventSender, navController, onClose, viewModel, LJJIJIIJI)), LJIL, 200064, 18);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92760aFw(navController, onNavBarChange, viewModel, eventSender, uiState, getFormatterAmount, onClose, i);
    }
}
