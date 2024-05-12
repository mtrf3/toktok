package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_effects_download_retry_count")
/* loaded from: classes6.dex */
public final class LiveGiftEffectsDownloadRetryCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveGiftEffectsDownloadRetryCountSetting INSTANCE = new LiveGiftEffectsDownloadRetryCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftEffectsDownloadRetryCountSetting.class);
    }
}
