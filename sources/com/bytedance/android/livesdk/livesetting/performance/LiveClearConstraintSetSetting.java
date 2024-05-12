package com.bytedance.android.livesdk.livesetting.performance;

import X.C58514Mxq;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_clear_constraint_set")
/* loaded from: classes11.dex */
public final class LiveClearConstraintSetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveClearConstraintSetSetting INSTANCE = new LiveClearConstraintSetSetting();
    public static final C5H3 enabled$delegate = C78996UzQ.LJJIJIIJI(C58514Mxq.LJLIL);

    public final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveClearConstraintSetSetting.class);
    }
}
