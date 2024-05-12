package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58492MxU;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_multiguestv3_min_cap_fps_guest")
/* loaded from: classes11.dex */
public final class MultiGuestV3GuestMinCapSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3GuestMinCapSetting INSTANCE = new MultiGuestV3GuestMinCapSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58492MxU.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3GuestMinCapSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
