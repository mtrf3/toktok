package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_feed_live_avatar_tap_area")
/* loaded from: classes6.dex */
public final class EnableFeedLiveAvatarTapAreaSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableFeedLiveAvatarTapAreaSetting INSTANCE = new EnableFeedLiveAvatarTapAreaSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableFeedLiveAvatarTapAreaSetting.class);
    }
}
