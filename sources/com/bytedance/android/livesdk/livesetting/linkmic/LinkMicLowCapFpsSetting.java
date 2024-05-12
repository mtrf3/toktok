package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58472MxA;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_low_cap_fps_setting")
/* loaded from: classes11.dex */
public final class LinkMicLowCapFpsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicLowCapFpsSetting INSTANCE = new LinkMicLowCapFpsSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58472MxA.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicLowCapFpsSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
