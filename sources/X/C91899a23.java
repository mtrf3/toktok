package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.a23, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91899a23 {
    public static final Activity LIZIZ(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final void LIZ(C92145a61 c92145a61, CheckoutViewModel viewModel, CheckoutUiState uiState, C31431Lf c31431Lf, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        C92145a61 c92145a612 = c92145a61;
        C31431Lf c31431Lf2 = c31431Lf;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(uiState, "uiState");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-49311706);
        if ((i2 & 1) != 0) {
            c92145a612 = C92147a63.LIZIZ(new AbstractC91695Zyl[0], LJIL);
            i3 = i & (-15);
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            c31431Lf2 = C78841Uwv.LJJIJIIJI(LJIL);
            i3 &= -7169;
        }
        C92094a5C.LIZIZ(c92145a612, "checkout_home", C09290Yb.LJIIIZ(InterfaceC07790Sh.LJJJI, 323, 0.0f, 2), null, null, null, null, null, null, new C92770aG6(uiState, viewModel, c92145a612, c31431Lf2, i3, (Context) LJIL.LJIILLIIL(C04Q.LIZJ)), LJIL, 392, 504);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92771aG7(c92145a612, viewModel, uiState, c31431Lf2, i, i2);
    }
}
