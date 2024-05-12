package com.bytedance.android.livesdk.broadcast.setting;

import X.C221108m2;
import X.C30399BwR;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("broadcast_overall_score_level")
/* loaded from: classes6.dex */
public final class BroadcastOverallScoreLevelSetting {
    public static final BroadcastOverallScoreLevelSetting INSTANCE = new BroadcastOverallScoreLevelSetting();

    @Group(isDefault = true, value = "default group")
    public static final BroadcastOverallScoreLevelMapping DEFAULT = new BroadcastOverallScoreLevelMapping(0.0f, 0.0f, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30399BwR.LJLIL);

    private final BroadcastOverallScoreLevelMapping getSettingValue() {
        return (BroadcastOverallScoreLevelMapping) settingValue$delegate.getValue();
    }

    public final BroadcastOverallScoreLevelMapping getValue() {
        return getSettingValue();
    }
}
