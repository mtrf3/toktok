package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;

/* loaded from: classes8.dex */
public final class GIA {
    public static SubscriptionPage LIZ(int i, InterfaceC32051Chz interfaceC32051Chz, PickYourAdPlanPage pickYourAdPlanPage) {
        PickYourAdPlanPage pickYourAdPlanPage2;
        SubscriptionPage subscriptionPage = new SubscriptionPage();
        SubscriptionPage.LLIIIL = interfaceC32051Chz;
        Bundle bundle = new Bundle();
        if (i == 0) {
            bundle.putParcelable("page_data", pickYourAdPlanPage);
        } else {
            AdFreeSubscription LJ = C41290GIk.LJ();
            if (LJ != null) {
                pickYourAdPlanPage2 = LJ.getPickYourAdPlanPage();
            } else {
                pickYourAdPlanPage2 = null;
            }
            bundle.putParcelable("page_data", pickYourAdPlanPage2);
        }
        bundle.putInt("enter_from", i);
        subscriptionPage.setArguments(bundle);
        return subscriptionPage;
    }
}
