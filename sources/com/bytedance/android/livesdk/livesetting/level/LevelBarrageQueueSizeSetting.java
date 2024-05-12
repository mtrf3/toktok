package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("level_barrage_message_queue_size")
/* loaded from: classes6.dex */
public final class LevelBarrageQueueSizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LevelBarrageQueueSizeSetting INSTANCE = new LevelBarrageQueueSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LevelBarrageQueueSizeSetting.class);
    }
}
