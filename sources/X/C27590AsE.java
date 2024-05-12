package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AsE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27590AsE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, boolean z, PaymentMethod paymentMethod, EnterParams enterParams, FragmentManager fragmentManager) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(enterParams, "enterParams");
        Keva keva = C66822jm.LIZ;
        C79057V0z.LJJJJJ(keva, "sub_payment_list_parent_payment_method", C27739Aud.LJI(paymentMethod));
        C79057V0z.LJJJJJ(keva, "sub_payment_list_enter_params", C27739Aud.LJI(enterParams));
        if (C19N.LJ("ec_sub_payment_select_optimize", false) && fragmentManager != null) {
            SubPaymentListFragment subPaymentListFragment = new SubPaymentListFragment();
            if (str == null) {
                str = "";
            }
            subPaymentListFragment.LJLILLLLZI = str;
            subPaymentListFragment.LJLJI = z;
            C27498Aqk.LIZ(fragmentManager, subPaymentListFragment, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("sub_payment_list_checked_sub_pm_id", str);
        linkedHashMap.put("is_from_osp", Boolean.valueOf(z));
        C26867AgZ.LIZIZ(context, "aweme://ec/sub_payment_list", linkedHashMap, false).open();
    }
}
