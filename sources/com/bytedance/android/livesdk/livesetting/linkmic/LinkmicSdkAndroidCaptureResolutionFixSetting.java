package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_android_capture_resolution_fix")
/* loaded from: classes6.dex */
public final class LinkmicSdkAndroidCaptureResolutionFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("is fix")
    public static final int FIX = 1;
    public static final LinkmicSdkAndroidCaptureResolutionFixSetting INSTANCE = new LinkmicSdkAndroidCaptureResolutionFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkAndroidCaptureResolutionFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
