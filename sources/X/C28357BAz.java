package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionManagementFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BAz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28357BAz {
    public static void LIZ(DataChannel dataChannel, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            SubscriptionManagementFragment subscriptionManagementFragment = new SubscriptionManagementFragment();
            subscriptionManagementFragment.LJLLILLLL = enterFrom;
            subscriptionManagementFragment.show(fragmentManager, "SubscriptionManagementFragment");
        }
    }
}
