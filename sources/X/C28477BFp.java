package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingDialogNew;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BFp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28477BFp {
    public static void LIZ(DataChannel dataChannel, String enterFrom, LiveSubOnlyConfig liveSubOnlyConfig, boolean z) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(enterFrom, "enterFrom");
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = new SubOnlyLiveSettingDialogNew();
            subOnlyLiveSettingDialogNew.LJLLLLLL = enterFrom;
            subOnlyLiveSettingDialogNew.LJLZ = liveSubOnlyConfig;
            subOnlyLiveSettingDialogNew.LJZL = z;
            subOnlyLiveSettingDialogNew.show(fragmentManager, "SubOnlyLiveSettingDialogNew");
        }
    }
}
