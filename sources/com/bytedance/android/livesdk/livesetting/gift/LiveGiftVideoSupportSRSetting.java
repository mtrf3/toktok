package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_video_super_resolution_type")
/* loaded from: classes6.dex */
public final class LiveGiftVideoSupportSRSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftVideoSupportSRSetting INSTANCE = new LiveGiftVideoSupportSRSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftVideoSupportSRSetting.class);
    }
}
