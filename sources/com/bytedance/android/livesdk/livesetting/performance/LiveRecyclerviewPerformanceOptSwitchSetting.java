package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31011CFb;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_recyclerview_preformance_opt_switch")
/* loaded from: classes6.dex */
public final class LiveRecyclerviewPerformanceOptSwitchSetting {
    public static final LiveRecyclerviewPerformanceOptSwitchSetting INSTANCE = new LiveRecyclerviewPerformanceOptSwitchSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveRecyclerviewPerformanceOptData DEFAULT = new LiveRecyclerviewPerformanceOptData(false, false, false, 7, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31011CFb.LJLIL);

    private final LiveRecyclerviewPerformanceOptData getSettingValue() {
        return (LiveRecyclerviewPerformanceOptData) settingValue$delegate.getValue();
    }

    public final boolean enableOtherOpt() {
        return getSettingValue().other;
    }

    public final boolean enableReusePool() {
        return getSettingValue().reusePool;
    }

    public final boolean enableViewHolderLayoutPreload() {
        return getSettingValue().viewHolderLayoutPreload;
    }
}
