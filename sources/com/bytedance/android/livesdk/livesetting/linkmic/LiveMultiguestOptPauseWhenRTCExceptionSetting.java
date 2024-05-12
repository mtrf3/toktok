package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multiguest_opt_pause_when_rtc_exception")
/* loaded from: classes6.dex */
public final class LiveMultiguestOptPauseWhenRTCExceptionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMultiguestOptPauseWhenRTCExceptionSetting INSTANCE = new LiveMultiguestOptPauseWhenRTCExceptionSetting();

    @Group("opt pause ui")
    public static final int OPT_PAUSE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMultiguestOptPauseWhenRTCExceptionSetting.class);
    }

    public final boolean isOptOnRTCException() {
        if (1 == getValue()) {
            return true;
        }
        return false;
    }
}
