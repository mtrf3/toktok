package X;

import android.os.MessageQueue;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscriptionWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailOptSetting;

/* renamed from: X.C8t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30847C8t implements MessageQueue.IdleHandler {
    public final /* synthetic */ SubscriptionWidget LJLIL;

    public C30847C8t(SubscriptionWidget subscriptionWidget) {
        this.LJLIL = subscriptionWidget;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        SubscriptionWidget subscriptionWidget = this.LJLIL;
        subscriptionWidget.getClass();
        if (LiveSubsPrivilegeDetailOptSetting.INSTANCE.getValue().preloadDataIdle) {
            subscriptionWidget.LJLZ();
        }
        if (!subscriptionWidget.LJLILLLLZI) {
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).nI();
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Rl0();
            return false;
        }
        return false;
    }
}
