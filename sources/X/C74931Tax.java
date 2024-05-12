package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeGuestSubscriberSetting;

/* renamed from: X.Tax, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74931Tax {
    static {
        new C73318Sq2();
    }

    public static final boolean LIZ(User user) {
        SubscribeInfo subscribeInfo;
        if (user == null || (subscribeInfo = user.getSubscribeInfo()) == null || !subscribeInfo.isSubscribedToCurrentAnchor() || !SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }
}
