package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C31328CRg;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_report_height_ratio_enable")
/* loaded from: classes6.dex */
public final class ReportHeightRatioSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final ReportHeightRatioSetting INSTANCE = new ReportHeightRatioSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31328CRg.LJLIL);

    public static final boolean enable() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
