package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("rank_list_fps_optimization")
/* loaded from: classes6.dex */
public final class RankListPageFpsOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final RankListPageFpsOptSetting INSTANCE = new RankListPageFpsOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RankListPageFpsOptSetting.class);
    }
}
