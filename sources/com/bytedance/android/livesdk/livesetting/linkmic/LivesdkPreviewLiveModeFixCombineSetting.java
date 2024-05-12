package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_preview_live_mode_fix_combine")
/* loaded from: classes6.dex */
public final class LivesdkPreviewLiveModeFixCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkPreviewLiveModeFixCombineSetting INSTANCE = new LivesdkPreviewLiveModeFixCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkPreviewLiveModeFixCombineSetting.class);
    }
}
