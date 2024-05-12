package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a74, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92210a74 implements InterfaceC64672gJ<NavBackStackEntry> {
    public final /* synthetic */ InterfaceC88472Yns<CheckoutNavBarState, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C92210a74(InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(NavBackStackEntry navBackStackEntry, InterfaceC67352kd interfaceC67352kd) {
        String str;
        String string;
        String string2;
        String string3;
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        String str2 = navBackStackEntry2.LJLILLLLZI.LJLJL;
        if (str2 == null || (str = (String) ORZ.LJLLJ(s.LJLJJL(str2, new String[]{"/"}, 0, 6))) == null) {
            str = "";
        }
        Bundle bundle = navBackStackEntry2.LJLJI;
        CheckoutNavBarState checkoutNavBarState = new CheckoutNavBarState(str, !C47261Igj.LJJIJIIJI("pay_result", "checkout_home", "select_pi_without_default").contains(str), C47261Igj.LJJIJIIJI("checkout_home", "select_pi_without_default", "pay_result").contains(str), C47261Igj.LJJIJIIJI("webview", "pay_result", "error_page").contains(str), !C47261Igj.LJJIJIIJI("checkout_home", "select_pi_without_default", "pay_result", "webview").contains(str), !o.LJ(str, "pay_result"), o.LJ(str, "webview"), false, 128, null);
        if (o.LJ(str, "webview")) {
            String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString("quitWithPop");
            }
            boolean LJ = o.LJ(string, "true");
            if (bundle == null) {
                string2 = null;
            } else {
                string2 = bundle.getString("displayBackButton");
            }
            boolean LJ2 = o.LJ(string2, "true");
            if (bundle == null) {
                string3 = null;
            } else {
                string3 = bundle.getString("displayCloseButton");
            }
            boolean LJ3 = o.LJ(string3, "true");
            if (bundle != null) {
                str3 = bundle.getString("hideLoading");
            }
            checkoutNavBarState = CheckoutNavBarState.copy$default(checkoutNavBarState, null, LJ2, LJ3, false, false, false, LJ, o.LJ(str3, "true"), 57, null);
        }
        C76800UCe invoke = this.LJLIL.invoke(checkoutNavBarState);
        if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return invoke;
        }
        return C76800UCe.LIZ;
    }
}
