package com.bytedance.android.livesdk.livesetting.feed;

import X.BUD;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_drawer_edge_enable")
/* loaded from: classes6.dex */
public final class LiveDrawerEdgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean V1 = true;
    public static final LiveDrawerEdgeSetting INSTANCE = new LiveDrawerEdgeSetting();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(BUD.LJLIL);

    public final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }
}
