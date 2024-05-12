package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_items_sample_rate")
/* loaded from: classes6.dex */
public final class LiveMessageItemsSampleRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 0.0d;
    public static final LiveMessageItemsSampleRateSetting INSTANCE = new LiveMessageItemsSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(LiveMessageItemsSampleRateSetting.class);
    }
}
