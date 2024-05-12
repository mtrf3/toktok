package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_live_perception_enable")
/* loaded from: classes6.dex */
public final class MultiLivePerceptionSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 1;

    @Group("experiment_group")
    public static final int DISABLE = 0;
    public static final MultiLivePerceptionSetting INSTANCE = new MultiLivePerceptionSetting();

    public static final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(MultiLivePerceptionSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
