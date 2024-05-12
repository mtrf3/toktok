package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_cancel_message_center_restriction")
/* loaded from: classes6.dex */
public final class LiveRemoveLimitationForExtendedScreenSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRemoveLimitationForExtendedScreenSetting INSTANCE = new LiveRemoveLimitationForExtendedScreenSetting();

    public final boolean removeLimitation() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRemoveLimitationForExtendedScreenSetting.class);
    }
}
