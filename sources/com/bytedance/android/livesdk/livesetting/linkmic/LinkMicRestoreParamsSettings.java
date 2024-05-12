package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58487MxP;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_restore_params_settings")
/* loaded from: classes11.dex */
public final class LinkMicRestoreParamsSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicRestoreParamsSettings INSTANCE = new LinkMicRestoreParamsSettings();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58487MxP.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicRestoreParamsSettings.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
