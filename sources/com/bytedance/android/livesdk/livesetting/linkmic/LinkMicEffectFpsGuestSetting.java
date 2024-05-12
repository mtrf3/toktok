package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58485MxN;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_effect_fps_guest")
/* loaded from: classes11.dex */
public final class LinkMicEffectFpsGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicEffectFpsGuestSetting INSTANCE = new LinkMicEffectFpsGuestSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58485MxN.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicEffectFpsGuestSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
