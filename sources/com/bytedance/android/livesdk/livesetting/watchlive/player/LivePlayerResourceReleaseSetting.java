package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C221108m2;
import X.C28301B8v;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_player_resource_release_setting")
/* loaded from: classes6.dex */
public final class LivePlayerResourceReleaseSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;

    @Group("v1")
    public static final int ENABLE = 4000;
    public static final LivePlayerResourceReleaseSetting INSTANCE = new LivePlayerResourceReleaseSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C28301B8v.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
