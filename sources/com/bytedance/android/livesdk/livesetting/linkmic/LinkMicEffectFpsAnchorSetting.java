package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58484MxM;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_effect_fps_anchor")
/* loaded from: classes11.dex */
public final class LinkMicEffectFpsAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicEffectFpsAnchorSetting INSTANCE = new LinkMicEffectFpsAnchorSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58484MxM.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicEffectFpsAnchorSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
