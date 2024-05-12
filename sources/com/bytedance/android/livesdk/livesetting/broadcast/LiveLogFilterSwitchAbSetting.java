package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C30922CBq;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ttls_log_filter_ab")
/* loaded from: classes6.dex */
public final class LiveLogFilterSwitchAbSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveLogFilterSwitchAbSetting INSTANCE = new LiveLogFilterSwitchAbSetting();

    public final boolean enablePrintLog() {
        if (SettingsManager.INSTANCE.getIntValue(LiveLogFilterSwitchAbSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean printLogSwitch() {
        if (enablePrintLog() || C30922CBq.LIZIZ) {
            return true;
        }
        return false;
    }
}
