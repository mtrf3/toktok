package X;

import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;

/* loaded from: classes6.dex */
public final class CEJ implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ SubscriptionSettingFragmentNew LJLIL;

    public CEJ(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LJLIL = subscriptionSettingFragmentNew;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.LJLIL.mm();
    }
}
