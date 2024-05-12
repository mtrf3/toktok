package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audio_metrics_url")
/* loaded from: classes6.dex */
public final class LiveAudioMetricsSetting {
    public static final LiveAudioMetricsSetting INSTANCE = new LiveAudioMetricsSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final String getAudioUrl() {
        return SettingsManager.INSTANCE.getStringValue(LiveAudioMetricsSetting.class);
    }
}
