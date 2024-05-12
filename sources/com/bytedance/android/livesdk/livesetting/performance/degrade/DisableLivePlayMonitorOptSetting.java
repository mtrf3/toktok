package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.B65;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("disable_live_play_monitor_opt")
/* loaded from: classes6.dex */
public final class DisableLivePlayMonitorOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean DISABLE = true;
    public static final DisableLivePlayMonitorOptSetting INSTANCE = new DisableLivePlayMonitorOptSetting();
    public static final C5H3 disable$delegate = C221108m2.LIZIZ(B65.LJLIL);

    public final boolean getDisable() {
        return ((Boolean) disable$delegate.getValue()).booleanValue();
    }
}
