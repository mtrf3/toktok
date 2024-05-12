package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendStatusDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHW {
    public static SubscriptionGiftSendStatusDialog LIZ(boolean z, int i, String secUid, String roomId, Long l, boolean z2, InterfaceC88472Yns interfaceC88472Yns) {
        long j;
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(roomId, "roomId");
        SubscriptionGiftSendStatusDialog subscriptionGiftSendStatusDialog = new SubscriptionGiftSendStatusDialog();
        subscriptionGiftSendStatusDialog.LJLJJLL = z;
        subscriptionGiftSendStatusDialog.LJLJL = Integer.valueOf(i);
        subscriptionGiftSendStatusDialog.LJLJLJ = secUid;
        subscriptionGiftSendStatusDialog.LJLJLLL = roomId;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        subscriptionGiftSendStatusDialog.LJLL = j;
        subscriptionGiftSendStatusDialog.LJLLI = interfaceC88472Yns;
        subscriptionGiftSendStatusDialog.LJLLILLLL = z2;
        return subscriptionGiftSendStatusDialog;
    }
}
