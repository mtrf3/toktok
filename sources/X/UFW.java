package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment", f = "SubscriptionSpotlightFragment.kt", l = {658}, m = "getStatusLoop")
/* loaded from: classes14.dex */
public final class UFW extends C3CS {
    public SubscriptionSpotlightFragment LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UFW(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC67352kd<? super UFW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = subscriptionSpotlightFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.Al(this);
    }
}
