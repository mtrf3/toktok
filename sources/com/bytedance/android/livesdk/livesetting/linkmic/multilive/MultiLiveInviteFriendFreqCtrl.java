package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_host_invite_friend_freq")
/* loaded from: classes6.dex */
public final class MultiLiveInviteFriendFreqCtrl {
    public static final MultiLiveInviteFriendFreqCtrl INSTANCE = new MultiLiveInviteFriendFreqCtrl();

    @Group(isDefault = true, value = "default group")
    public static final InviteFriendFreCtrlConfig DEFAULT = new InviteFriendFreCtrlConfig(null, 0, 3, null);

    public final InviteFriendFreCtrlConfig getValue() {
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig = (InviteFriendFreCtrlConfig) SettingsManager.INSTANCE.getValueSafely(MultiLiveInviteFriendFreqCtrl.class);
        if (inviteFriendFreCtrlConfig == null) {
            return DEFAULT;
        }
        return inviteFriendFreCtrlConfig;
    }

    public final InviteFriendFreCtrlConfig getDEFAULT() {
        return DEFAULT;
    }
}
