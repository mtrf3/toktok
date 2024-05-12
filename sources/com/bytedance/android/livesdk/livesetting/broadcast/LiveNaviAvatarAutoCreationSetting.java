package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_navi_avatar_auto_creation")
/* loaded from: classes6.dex */
public final class LiveNaviAvatarAutoCreationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveNaviAvatarAutoCreationSetting INSTANCE = new LiveNaviAvatarAutoCreationSetting();

    @Group("support auto creation")
    public static final int V1 = 1;

    @Group("support auto creation, support multi_guest")
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNaviAvatarAutoCreationSetting.class);
    }

    public final boolean isExperiment() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
