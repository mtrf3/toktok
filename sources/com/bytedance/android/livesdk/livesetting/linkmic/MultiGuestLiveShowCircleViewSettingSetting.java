package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show_circle_view_setting")
/* loaded from: classes11.dex */
public final class MultiGuestLiveShowCircleViewSettingSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestLiveShowCircleViewSettingSetting INSTANCE = new MultiGuestLiveShowCircleViewSettingSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowCircleViewSettingSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
