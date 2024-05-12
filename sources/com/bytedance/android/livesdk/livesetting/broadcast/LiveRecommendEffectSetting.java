package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_recommend")
/* loaded from: classes6.dex */
public final class LiveRecommendEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveRecommendEffectSetting INSTANCE = new LiveRecommendEffectSetting();

    public final boolean disable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveRecommendEffectSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean increasePanelHeight() {
        if (SettingsManager.INSTANCE.getIntValue(LiveRecommendEffectSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean keepPanelHeight() {
        if (SettingsManager.INSTANCE.getIntValue(LiveRecommendEffectSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean enable() {
        return !disable();
    }
}
