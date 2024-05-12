package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_msg_type_alog_enable")
/* loaded from: classes6.dex */
public final class LiveMsgTypeAlogEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMsgTypeAlogEnableSetting INSTANCE = new LiveMsgTypeAlogEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMsgTypeAlogEnableSetting.class);
    }
}
