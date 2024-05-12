package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_video_player_timeout_scale")
/* loaded from: classes6.dex */
public final class LiveGiftVideoTimeoutScaleSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 0.0f;
    public static final LiveGiftVideoTimeoutScaleSetting INSTANCE = new LiveGiftVideoTimeoutScaleSetting();

    public static final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveGiftVideoTimeoutScaleSetting.class);
    }
}
