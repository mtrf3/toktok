package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C29952BpE;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_goal_banner_enabled")
/* loaded from: classes6.dex */
public final class LiveGiftGoalBannerEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftGoalBannerEnabledSetting INSTANCE = new LiveGiftGoalBannerEnabledSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C29952BpE.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
