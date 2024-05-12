package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_msg_type_alog_duration")
/* loaded from: classes6.dex */
public final class LiveMsgTypeAlogDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveMsgTypeAlogDurationSetting INSTANCE = new LiveMsgTypeAlogDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMsgTypeAlogDurationSetting.class);
    }
}
