package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_preview_min_gap")
/* loaded from: classes6.dex */
public final class LiveMatchPreviewMinGapSetting {

    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 0.08d;
    public static final LiveMatchPreviewMinGapSetting INSTANCE = new LiveMatchPreviewMinGapSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveMatchPreviewMinGapSetting.class);
    }
}
