package com.bytedance.android.livesdk.livesetting.broadcast;

import X.BX9;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_try_mode_count_down_duration")
/* loaded from: classes6.dex */
public final class LiveTryModeCountDownDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LiveTryModeCountDownDurationSetting INSTANCE = new LiveTryModeCountDownDurationSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BX9.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final int duration() {
        return getValue();
    }
}
