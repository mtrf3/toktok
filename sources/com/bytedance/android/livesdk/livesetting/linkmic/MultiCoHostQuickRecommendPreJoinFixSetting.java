package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_host_quick_recommend_pre_join_fix_channel")
/* loaded from: classes6.dex */
public final class MultiCoHostQuickRecommendPreJoinFixSetting {
    public static final MultiCoHostQuickRecommendPreJoinFixSetting INSTANCE = new MultiCoHostQuickRecommendPreJoinFixSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiCoHostQuickRecommendPreJoinFixSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
