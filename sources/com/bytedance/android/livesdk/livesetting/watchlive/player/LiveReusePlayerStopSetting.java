package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.BQB;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_reuse_player_stop_setting")
/* loaded from: classes6.dex */
public final class LiveReusePlayerStopSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveReusePlayerStopSetting INSTANCE = new LiveReusePlayerStopSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, BQB.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
