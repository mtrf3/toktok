package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C32776Ctg;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_stream_combo_clickable_area_enlarge")
/* loaded from: classes6.dex */
public final class LiveComboLargeClickableAreaSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveComboLargeClickableAreaSetting INSTANCE = new LiveComboLargeClickableAreaSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C32776Ctg.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
