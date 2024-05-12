package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;

/* renamed from: X.Aqi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27496Aqi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FragmentManager fragmentManager, BillingFragmentEnterParams billingFragmentEnterParams, Context context, boolean z) {
        String str;
        if (fragmentManager != null) {
            if (z || context == null) {
                BillingAddressFragment billingAddressFragment = new BillingAddressFragment();
                billingAddressFragment.LJLIL = billingFragmentEnterParams;
                C27498Aqk.LIZ(fragmentManager, billingAddressFragment, "BILLING_ADDRESS_HALF_FRAG_TAG");
                return;
            }
        } else if (context == null) {
            return;
        }
        Keva keva = C66822jm.LIZ;
        if (billingFragmentEnterParams != null) {
            str = C27739Aud.LJI(billingFragmentEnterParams);
        } else {
            str = "";
        }
        C79057V0z.LJJJJJ(keva, "BILLING_ADDRESS_PARAMS", str);
        C26867AgZ.LIZIZ(context, "aweme://ec/billing_address_list", C113554cx.LJJJLIIL(), false).open();
    }
}
