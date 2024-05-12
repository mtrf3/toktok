package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_view_metrics_enabled")
/* loaded from: classes6.dex */
public final class LivePublicScreenViewMetricsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenViewMetricsSetting INSTANCE = new LivePublicScreenViewMetricsSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenViewMetricsSetting.class);
    }
}
