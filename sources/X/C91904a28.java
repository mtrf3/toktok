package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.a28, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91904a28 {
    public static final void LIZ(Boolean bool, Boolean bool2, PIViewModel viewModel, C91706Zyw navController, float f, boolean z, boolean z2, String url, C08370Un c08370Un, InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
        Boolean bool3 = bool2;
        float f2 = f;
        C08370Un c08370Un2 = c08370Un;
        InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        Boolean bool4 = bool;
        boolean z3 = z;
        boolean z4 = z2;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(navController, "navController");
        o.LJIIIZ(url, "url");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1715641582);
        if ((i3 & 1) != 0) {
            bool4 = Boolean.FALSE;
        }
        if ((i3 & 2) != 0) {
            bool3 = Boolean.FALSE;
        }
        if ((i3 & 16) != 0) {
            f2 = 0;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = true;
        }
        if ((i3 & 256) != 0) {
            c08370Un2 = null;
        }
        if ((i3 & 512) != 0) {
            interfaceC88472Yns2 = C92798aGY.LJLIL;
        }
        if ((i3 & 1024) != 0) {
            interfaceC65784Pro4 = C92799aGZ.LJLIL;
        }
        if ((i3 & 2048) != 0) {
            interfaceC65784Pro3 = C92800aGa.LJLIL;
        }
        Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        InterfaceC91780a08 toast = C91665ZyH.LIZ().getToast();
        C40431iJ LJ = C1DJ.LJ(LJIL, -819895913, new C92801aGb(viewModel, c08370Un2, z4, interfaceC65784Pro3, i, i2, navController));
        C40431iJ LJ2 = C1DJ.LJ(LJIL, -819892495, new C92802aGc(bool3, viewModel, url, interfaceC88472Yns2, i, bool4, interfaceC65784Pro4, context, navController, view, toast, interfaceC65784Pro3));
        int i4 = i >> 9;
        C91866a1W.LIZ(null, f2, z3, LJ, LJ2, LJIL, (i4 & 112) | 27648 | (i4 & 896), 1);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92803aGd(bool4, bool3, viewModel, navController, f2, z3, z4, url, c08370Un2, interfaceC88472Yns2, interfaceC65784Pro4, interfaceC65784Pro3, i, i2, i3);
    }
}
