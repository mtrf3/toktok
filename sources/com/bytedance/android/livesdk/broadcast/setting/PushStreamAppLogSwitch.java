package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("push_stream_switch_applog")
/* loaded from: classes6.dex */
public final class PushStreamAppLogSwitch {

    @Group("v1")
    public static final int APPLOG = 1;

    @Group("v3")
    public static final int APPLOG_INCLUDE_INTERACT = 3;

    @Group("v2")
    public static final int APPLOG_OPT = 2;

    @Group("v4")
    public static final int APPLOG_OPT_INCLUDE_INTERACT = 4;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final PushStreamAppLogSwitch INSTANCE = new PushStreamAppLogSwitch();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PushStreamAppLogSwitch.class);
    }
}
