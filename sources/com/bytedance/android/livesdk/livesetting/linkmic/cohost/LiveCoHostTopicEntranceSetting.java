package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_topic_entrance_update")
/* loaded from: classes11.dex */
public final class LiveCoHostTopicEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHostTopicEntranceSetting INSTANCE = new LiveCoHostTopicEntranceSetting();

    public final Integer getValue() {
        return (Integer) SettingsManager.INSTANCE.getValueSafely(LiveCoHostTopicEntranceSetting.class);
    }
}
