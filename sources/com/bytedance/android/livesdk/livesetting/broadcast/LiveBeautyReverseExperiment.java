package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C28255B7b;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_beauty_reverse_experiment")
/* loaded from: classes6.dex */
public final class LiveBeautyReverseExperiment {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBeautyReverseExperiment INSTANCE = new LiveBeautyReverseExperiment();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C28255B7b.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final boolean isInExperiment() {
        if (getSettingValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean notInExperiment() {
        if (getSettingValue() == 0) {
            return true;
        }
        return false;
    }
}
