package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_share_to_more_panel")
/* loaded from: classes6.dex */
public final class LiveSharePanelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSharePanelSetting INSTANCE = new LiveSharePanelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSharePanelSetting.class);
    }
}
