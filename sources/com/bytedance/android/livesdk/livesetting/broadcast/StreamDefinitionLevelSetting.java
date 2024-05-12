package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("stream_definition_level")
/* loaded from: classes6.dex */
public final class StreamDefinitionLevelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final StreamDefinitionLevelSetting INSTANCE = new StreamDefinitionLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StreamDefinitionLevelSetting.class);
    }
}
