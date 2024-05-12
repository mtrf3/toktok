package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.BKS;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_surface_new_version_setting")
/* loaded from: classes6.dex */
public final class LiveSurfaceNewVersionSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;
    public static final LiveSurfaceNewVersionSetting INSTANCE = new LiveSurfaceNewVersionSetting();

    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BKS.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
