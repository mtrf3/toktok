package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComUsPostBillingAddressModel;

/* renamed from: X.Aqp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27503Aqp {
    public static final EComUsPostBillingAddressModel LIZ;

    static {
        new C27503Aqp();
        LIZ = new EComUsPostBillingAddressModel(false, false, false, 7, null);
    }

    public static final EComUsPostBillingAddressModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EComUsPostBillingAddressModel eComUsPostBillingAddressModel = LIZ;
        EComUsPostBillingAddressModel eComUsPostBillingAddressModel2 = (EComUsPostBillingAddressModel) LIZLLL.LJIIIIZZ("ecom_us_post_billing_address", EComUsPostBillingAddressModel.class, eComUsPostBillingAddressModel);
        if (eComUsPostBillingAddressModel2 == null) {
            return eComUsPostBillingAddressModel;
        }
        return eComUsPostBillingAddressModel2;
    }
}
