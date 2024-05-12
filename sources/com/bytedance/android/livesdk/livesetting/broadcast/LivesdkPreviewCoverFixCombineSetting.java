package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_preview_cover_fix_combine")
/* loaded from: classes6.dex */
public final class LivesdkPreviewCoverFixCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkPreviewCoverFixCombineSetting INSTANCE = new LivesdkPreviewCoverFixCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkPreviewCoverFixCombineSetting.class);
    }
}
