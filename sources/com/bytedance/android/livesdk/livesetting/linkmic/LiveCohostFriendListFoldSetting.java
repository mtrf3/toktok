package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_friend_list_fold_setting")
/* loaded from: classes6.dex */
public final class LiveCohostFriendListFoldSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCohostFriendListFoldSetting INSTANCE = new LiveCohostFriendListFoldSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCohostFriendListFoldSetting.class);
    }
}
