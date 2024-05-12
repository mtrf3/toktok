package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_camera_revert_fix")
/* loaded from: classes6.dex */
public final class MultiGuestCameraRevertFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("is fix")
    public static final int FIX = 1;
    public static final MultiGuestCameraRevertFixSetting INSTANCE = new MultiGuestCameraRevertFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestCameraRevertFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
