package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("public_screen_buffer_sample_rate")
/* loaded from: classes6.dex */
public final class LivePublicScreenBufferSampleRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 0.0d;
    public static final LivePublicScreenBufferSampleRateSetting INSTANCE = new LivePublicScreenBufferSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(LivePublicScreenBufferSampleRateSetting.class);
    }
}
