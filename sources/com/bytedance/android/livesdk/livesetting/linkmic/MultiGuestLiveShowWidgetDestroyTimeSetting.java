package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show_widget_destroy_time")
/* loaded from: classes11.dex */
public final class MultiGuestLiveShowWidgetDestroyTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("fix")
    public static final int FIX = 1;
    public static final MultiGuestLiveShowWidgetDestroyTimeSetting INSTANCE = new MultiGuestLiveShowWidgetDestroyTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowWidgetDestroyTimeSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
