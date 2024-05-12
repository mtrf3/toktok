package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_consume_layer")
/* loaded from: classes6.dex */
public final class LiveGiftUserConsumeLayerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftUserConsumeLayerSetting INSTANCE = new LiveGiftUserConsumeLayerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftUserConsumeLayerSetting.class);
    }
}
