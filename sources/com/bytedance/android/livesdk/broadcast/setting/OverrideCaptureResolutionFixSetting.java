package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_fix_resolution_override_enable")
/* loaded from: classes6.dex */
public final class OverrideCaptureResolutionFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final OverrideCaptureResolutionFixSetting INSTANCE = new OverrideCaptureResolutionFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OverrideCaptureResolutionFixSetting.class);
    }
}
