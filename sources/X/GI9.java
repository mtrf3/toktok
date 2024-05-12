package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.FreeTrialPage;

/* loaded from: classes8.dex */
public final class GI9 {
    public static FreeTrialPage LIZ(int i, InterfaceC32051Chz interfaceC32051Chz, AdFreeTrialPageInfo adFreeTrialPageInfo) {
        AdFreeTrialPageInfo adFreeTrialPageInfo2;
        FreeTrialPage freeTrialPage = new FreeTrialPage();
        FreeTrialPage.LJLLLL = interfaceC32051Chz;
        Bundle bundle = new Bundle();
        if (i == 0) {
            bundle.putParcelable("page_data", adFreeTrialPageInfo);
        } else {
            AdFreeSubscription LJ = C41290GIk.LJ();
            if (LJ != null) {
                adFreeTrialPageInfo2 = LJ.getAdFreeTrialPageInfo();
            } else {
                adFreeTrialPageInfo2 = null;
            }
            bundle.putParcelable("page_data", adFreeTrialPageInfo2);
        }
        bundle.putInt("enter_from", i);
        freeTrialPage.setArguments(bundle);
        return freeTrialPage;
    }
}
