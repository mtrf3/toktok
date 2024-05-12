package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58486MxO;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_restore_effect_bug_fix")
/* loaded from: classes11.dex */
public final class LinkMicRestoreEffectBugFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicRestoreEffectBugFixSetting INSTANCE = new LinkMicRestoreEffectBugFixSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58486MxO.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicRestoreEffectBugFixSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
