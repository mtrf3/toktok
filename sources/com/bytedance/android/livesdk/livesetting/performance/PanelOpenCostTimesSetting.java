package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C29885Bo9;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_sdk_panel_open_cost_times")
/* loaded from: classes6.dex */
public final class PanelOpenCostTimesSetting {
    public static final PanelOpenCostTimesSetting INSTANCE = new PanelOpenCostTimesSetting();

    @Group(isDefault = true, value = "default group")
    public static final LivePanelCostTimeModel DEFAULT = new LivePanelCostTimeModel(false, 0, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C29885Bo9.LJLIL);

    private final LivePanelCostTimeModel getSettingValue() {
        return (LivePanelCostTimeModel) settingValue$delegate.getValue();
    }

    public final LivePanelCostTimeModel getValue() {
        return getSettingValue();
    }
}
