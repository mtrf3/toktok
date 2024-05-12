package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58500Mxc;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_cold_data_delay_time")
/* loaded from: classes11.dex */
public final class LiveColdDataDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 0;
    public static final LiveColdDataDelaySetting INSTANCE = new LiveColdDataDelaySetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58500Mxc.LJLIL);

    private final long getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).longValue();
    }

    public final long getValue() {
        return getSettingValue();
    }
}
