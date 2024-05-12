package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BgM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29402BgM {
    public static void LIZ(DataChannel dataChannel, String enterFrom) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(enterFrom, "enterFrom");
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            SubscriptionCommunityFragment subscriptionCommunityFragment = new SubscriptionCommunityFragment();
            subscriptionCommunityFragment.LLILLL = enterFrom;
            subscriptionCommunityFragment.show(fragmentManager, "SubscriptionCommunityFragment");
        }
    }
}
