package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_guide_trigger_duration_setting")
/* loaded from: classes6.dex */
public final class LiveGiftGuideTriggerDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 600000;
    public static final LiveGiftGuideTriggerDurationSetting INSTANCE = new LiveGiftGuideTriggerDurationSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftGuideTriggerDurationSetting.class);
    }
}
