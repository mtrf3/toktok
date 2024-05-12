package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_zstd_load_setting")
/* loaded from: classes6.dex */
public final class LiveMessageZstdLoadSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMessageZstdLoadSetting INSTANCE = new LiveMessageZstdLoadSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageZstdLoadSetting.class);
    }

    public final boolean isZstdLoadWhenLivePlay() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isZstdLoadWhenSDKStart() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
