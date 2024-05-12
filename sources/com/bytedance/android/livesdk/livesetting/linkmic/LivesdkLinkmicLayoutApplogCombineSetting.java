package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livesdk_linkmic_layout_applog_combine")
/* loaded from: classes14.dex */
public final class LivesdkLinkmicLayoutApplogCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivesdkLinkmicLayoutApplogCombineSetting INSTANCE = new LivesdkLinkmicLayoutApplogCombineSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicLayoutApplogCombineSetting.class);
    }

    public final boolean isChannelIdMismatchReportEnable() {
        if ((getValue() & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isDslDownloadFailedReportEnable() {
        if ((getValue() & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isDslLoadFailedReportEnable() {
        if ((getValue() & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isFirstSeiLoseReportEnable() {
        if ((getValue() & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutNotFoundReportEnable() {
        if ((getValue() & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkUserNotFoundReportEnable() {
        if ((getValue() & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSeiWrongOrderReportEnable() {
        if ((getValue() & 64) != 0) {
            return true;
        }
        return false;
    }
}
