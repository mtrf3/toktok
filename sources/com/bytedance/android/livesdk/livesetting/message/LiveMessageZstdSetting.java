package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_zstd_setting_v2")
/* loaded from: classes6.dex */
public final class LiveMessageZstdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMessageZstdSetting INSTANCE = new LiveMessageZstdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageZstdSetting.class);
    }

    public final boolean enable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final int zstdType() {
        return getValue();
    }
}
