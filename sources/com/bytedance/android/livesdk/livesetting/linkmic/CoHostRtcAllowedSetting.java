package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58508Mxk;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_cohost_split_dsl_params")
/* loaded from: classes11.dex */
public final class CoHostRtcAllowedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CoHostRtcAllowedSetting INSTANCE = new CoHostRtcAllowedSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58508Mxk.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostRtcAllowedSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
