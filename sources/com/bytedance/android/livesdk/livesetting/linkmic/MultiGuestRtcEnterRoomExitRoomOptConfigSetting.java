package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_enter_and_leave_rtc_room_opt_config")
/* loaded from: classes6.dex */
public final class MultiGuestRtcEnterRoomExitRoomOptConfigSetting {
    public static final MultiGuestRtcEnterRoomExitRoomOptConfigSetting INSTANCE = new MultiGuestRtcEnterRoomExitRoomOptConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestRtcEnterRoomExitRoomOptConfig DEFAULT = new MultiGuestRtcEnterRoomExitRoomOptConfig(0, 0, 3, null);

    private final MultiGuestRtcEnterRoomExitRoomOptConfig getValue() {
        MultiGuestRtcEnterRoomExitRoomOptConfig multiGuestRtcEnterRoomExitRoomOptConfig = (MultiGuestRtcEnterRoomExitRoomOptConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestRtcEnterRoomExitRoomOptConfigSetting.class);
        if (multiGuestRtcEnterRoomExitRoomOptConfig == null) {
            return DEFAULT;
        }
        return multiGuestRtcEnterRoomExitRoomOptConfig;
    }

    public final long timeoutStopThresholdOneInSeconds() {
        return getValue().stopDurationThreshold1;
    }

    public final long timeoutStopThresholdTwoInSeconds() {
        long j = getValue().stopDurationThreshold2 - getValue().stopDurationThreshold1;
        if (j > 0) {
            return j;
        }
        return 0L;
    }
}
