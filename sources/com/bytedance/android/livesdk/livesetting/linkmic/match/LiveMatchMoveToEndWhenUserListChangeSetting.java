package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_move_to_end_when_user_list_change")
/* loaded from: classes11.dex */
public final class LiveMatchMoveToEndWhenUserListChangeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchMoveToEndWhenUserListChangeSetting INSTANCE = new LiveMatchMoveToEndWhenUserListChangeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchMoveToEndWhenUserListChangeSetting.class);
    }
}
