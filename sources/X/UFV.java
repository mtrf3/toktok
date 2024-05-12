package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment", f = "SubscriptionSpotlightFragment.kt", l = {299}, m = "fillInBitmaps")
/* loaded from: classes14.dex */
public final class UFV extends C3CS {
    public SubscriptionSpotlightFragment LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public Object LJLJI;
    public C76876UFc LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UFV(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC67352kd<? super UFV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = subscriptionSpotlightFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.vl(null, this);
    }
}
