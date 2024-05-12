package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30632C0m;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_heat_level_enabled")
/* loaded from: classes6.dex */
public final class LiveHeatLevelSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveHeatLevelSetting INSTANCE = new LiveHeatLevelSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30632C0m.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
