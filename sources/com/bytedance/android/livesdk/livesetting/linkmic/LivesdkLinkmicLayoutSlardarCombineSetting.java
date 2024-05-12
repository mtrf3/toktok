package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livesdk_linkmic_layout_slardar_combine")
/* loaded from: classes14.dex */
public final class LivesdkLinkmicLayoutSlardarCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivesdkLinkmicLayoutSlardarCombineSetting INSTANCE = new LivesdkLinkmicLayoutSlardarCombineSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicLayoutSlardarCombineSetting.class);
    }

    public final boolean isLayoutGuestChangeReportEnable() {
        if ((getValue() & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutLoadReportEnable() {
        if ((getValue() & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutMeasureReportEnable() {
        if ((getValue() & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutRenderEnable() {
        if ((getValue() & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutSwitchReportEnable() {
        if ((getValue() & 1) != 0) {
            return true;
        }
        return false;
    }
}
