package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_video_player_timeout")
/* loaded from: classes6.dex */
public final class LiveGiftVideoTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LiveGiftVideoTimeoutSetting INSTANCE = new LiveGiftVideoTimeoutSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftVideoTimeoutSetting.class);
    }
}
