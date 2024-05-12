package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_prefetch_max_interval")
/* loaded from: classes6.dex */
public final class LiveMessagePrefetchResultValidIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5000;
    public static final LiveMessagePrefetchResultValidIntervalSetting INSTANCE = new LiveMessagePrefetchResultValidIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMessagePrefetchResultValidIntervalSetting.class);
    }
}
