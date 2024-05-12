package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58503Mxf;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_guide_popup_at_left_under_rtl_enable")
/* loaded from: classes11.dex */
public final class LiveGiftGuideOnLeftRTLEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftGuideOnLeftRTLEnableSetting INSTANCE = new LiveGiftGuideOnLeftRTLEnableSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58503Mxf.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
