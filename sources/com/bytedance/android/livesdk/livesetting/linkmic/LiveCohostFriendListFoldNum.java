package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_friend_list_fold_num")
/* loaded from: classes6.dex */
public final class LiveCohostFriendListFoldNum {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveCohostFriendListFoldNum INSTANCE = new LiveCohostFriendListFoldNum();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostFriendListFoldNum.class);
    }
}
