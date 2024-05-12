package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_player_new_layout_topic_id")
/* loaded from: classes6.dex */
public final class LivePlayerNewLayoutTopicIdSetting {
    public static final LivePlayerNewLayoutTopicIdSetting INSTANCE = new LivePlayerNewLayoutTopicIdSetting();

    @Group(isDefault = true, value = "default group")
    public static final long[] DEFAULT = new long[0];

    public final long[] getValue() {
        long[] jArr = (long[]) SettingsManager.INSTANCE.getValueSafely(LivePlayerNewLayoutTopicIdSetting.class);
        if (jArr == null) {
            return DEFAULT;
        }
        return jArr;
    }
}
