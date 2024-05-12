package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_tools_rename_setting")
/* loaded from: classes6.dex */
public final class LiveToolsRename {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveToolsRename INSTANCE = new LiveToolsRename();

    @Group("name V1")
    public static final int SETTING1 = 1;

    @Group("name V2")
    public static final int SETTING2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveToolsRename.class);
    }

    public final boolean isV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isV2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
