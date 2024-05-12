package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_android_gauss_blur_opt")
/* loaded from: classes6.dex */
public final class MultiGuestAndroidGaussBlurOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestAndroidGaussBlurOptSetting INSTANCE = new MultiGuestAndroidGaussBlurOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestAndroidGaussBlurOptSetting.class);
    }

    public final boolean isOptGaussBlur() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
