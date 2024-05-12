package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C58481MxJ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "is_enable_linkmic_algorithm_model_predownload")
/* loaded from: classes11.dex */
public final class LivePreloadLinkMicSmallModelSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePreloadLinkMicSmallModelSetting INSTANCE = new LivePreloadLinkMicSmallModelSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58481MxJ.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreloadLinkMicSmallModelSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
