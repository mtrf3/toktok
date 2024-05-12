package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("rank_precreate_spark_view")
/* loaded from: classes6.dex */
public final class RankPreCreateSparkViewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final RankPreCreateSparkViewSetting INSTANCE = new RankPreCreateSparkViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RankPreCreateSparkViewSetting.class);
    }
}
