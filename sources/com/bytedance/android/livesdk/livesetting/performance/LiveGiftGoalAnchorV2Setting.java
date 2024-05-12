package com.bytedance.android.livesdk.livesetting.performance;

import X.BHB;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_goal_2_anchor_style_enable")
/* loaded from: classes6.dex */
public final class LiveGiftGoalAnchorV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftGoalAnchorV2Setting INSTANCE = new LiveGiftGoalAnchorV2Setting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, BHB.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
