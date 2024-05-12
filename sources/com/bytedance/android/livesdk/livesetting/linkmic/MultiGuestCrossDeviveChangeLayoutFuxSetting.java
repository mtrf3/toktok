package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_cross_devive_change_layout_fux")
/* loaded from: classes6.dex */
public final class MultiGuestCrossDeviveChangeLayoutFuxSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestCrossDeviveChangeLayoutFuxSetting INSTANCE = new MultiGuestCrossDeviveChangeLayoutFuxSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestCrossDeviveChangeLayoutFuxSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
