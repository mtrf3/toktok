package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.FreeTrialPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionActivity;

/* loaded from: classes8.dex */
public final class GI6 implements InterfaceC32051Chz {
    public final /* synthetic */ SubscriptionActivity LIZ;

    @Override // X.InterfaceC32051Chz
    public final void LIZ() {
        this.LIZ.finish();
    }

    @Override // X.InterfaceC32051Chz
    public final void LIZIZ() {
        SubscriptionActivity subscriptionActivity = this.LIZ;
        FreeTrialPage freeTrialPage = subscriptionActivity.LJLILLLLZI;
        if (freeTrialPage != null) {
            subscriptionActivity.LLFII(freeTrialPage);
        }
    }

    public GI6(SubscriptionActivity subscriptionActivity) {
        this.LIZ = subscriptionActivity;
    }
}
