package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.B69;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("black_screen_monitor_setting")
/* loaded from: classes6.dex */
public final class BlackScreenMonitorSetting {
    public static final BlackScreenMonitorSetting INSTANCE = new BlackScreenMonitorSetting();

    @Group(isDefault = true, value = "control_group")
    public static final int DEFAULT = 1;

    @Group("online check")
    public static final int ENABLE_ONLINE = 2;

    @Group("online and local check")
    public static final int ENABLE_ALL_SCENE = 3;
    public static final C5H3 enable$delegate = C221108m2.LIZ(EnumC221088m0.NONE, B69.LJLIL);

    public final int getEnable() {
        return ((Number) enable$delegate.getValue()).intValue();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE_ALL_SCENE() {
        return ENABLE_ALL_SCENE;
    }

    public final int getENABLE_ONLINE() {
        return ENABLE_ONLINE;
    }
}
