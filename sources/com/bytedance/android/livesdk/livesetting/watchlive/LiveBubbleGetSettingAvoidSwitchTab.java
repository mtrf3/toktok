package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58464Mx2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_bubble_get_setting_avoid_switch_tab")
/* loaded from: classes11.dex */
public final class LiveBubbleGetSettingAvoidSwitchTab {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBubbleGetSettingAvoidSwitchTab INSTANCE = new LiveBubbleGetSettingAvoidSwitchTab();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C58464Mx2.LJLIL);

    private final boolean getSetting() {
        return ((Boolean) setting$delegate.getValue()).booleanValue();
    }

    public final boolean disable() {
        return !getSetting();
    }
}
