package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class UFO implements View.OnClickListener {
    public final /* synthetic */ SubscriptionSpotlightFragment LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public UFO(SubscriptionSpotlightFragment subscriptionSpotlightFragment, Context context, String str) {
        this.LJLIL = subscriptionSpotlightFragment;
        this.LJLILLLLZI = context;
        this.LJLJI = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<C76876UFc> list = this.LJLIL.xl().LJLILLLLZI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C76876UFc> it = list.iterator();
            while (it.hasNext()) {
                Integer num = it.next().LIZIZ;
                if (num != null && num.intValue() == 3) {
                    return;
                }
            }
        }
        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Vu0(this.LJLILLLLZI, LiveSubscriptionAnchorUrlSetting.spotlightFaq(), C113554cx.LJJLIIIIJ(new OSZ("sec_anchor_id", this.LJLJI)));
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LJLIL;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_faq_click");
        subscriptionSpotlightFragment.Gl(LIZ);
        LIZ.LJIJJ(subscriptionSpotlightFragment.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
    }
}
