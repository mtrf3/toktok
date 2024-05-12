package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_preview_components_simplify_type")
/* loaded from: classes6.dex */
public final class LivePreviewComponentsSimplifyTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePreviewComponentsSimplifyTypeSetting INSTANCE = new LivePreviewComponentsSimplifyTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePreviewComponentsSimplifyTypeSetting.class);
    }

    public final boolean inExperiment() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean needShadowForTitle() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean showBottomLiveGoalBtn() {
        int value = getValue();
        if (1 > value || value >= 3) {
            return false;
        }
        return true;
    }

    public final boolean showFullLiveGoalBtn() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }
}
