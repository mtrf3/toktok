package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58497MxZ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "is_enable_multiguestv3_effect_downgrading")
/* loaded from: classes11.dex */
public final class MultiGuestEffectDowngradingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestEffectDowngradingSetting INSTANCE = new MultiGuestEffectDowngradingSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58497MxZ.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestEffectDowngradingSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
