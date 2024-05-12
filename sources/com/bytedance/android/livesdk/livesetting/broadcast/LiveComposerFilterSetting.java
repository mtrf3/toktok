package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_composer_filter_setting")
/* loaded from: classes6.dex */
public final class LiveComposerFilterSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveComposerFilterSetting INSTANCE = new LiveComposerFilterSetting();

    public final boolean isComposerSupported() {
        if (SettingsManager.INSTANCE.getIntValue(LiveComposerFilterSetting.class) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isNewEngineExperiment() {
        if (SettingsManager.INSTANCE.getIntValue(LiveComposerFilterSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
