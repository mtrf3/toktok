package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30400BwS;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_goal_2_green_screen")
/* loaded from: classes6.dex */
public final class LiveGoal2GreenScreenSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGoal2GreenScreenSetting INSTANCE = new LiveGoal2GreenScreenSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30400BwS.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
