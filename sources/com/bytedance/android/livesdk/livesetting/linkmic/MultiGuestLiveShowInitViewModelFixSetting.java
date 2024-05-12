package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show_init_view_model_fix")
/* loaded from: classes6.dex */
public final class MultiGuestLiveShowInitViewModelFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestLiveShowInitViewModelFixSetting INSTANCE = new MultiGuestLiveShowInitViewModelFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowInitViewModelFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
