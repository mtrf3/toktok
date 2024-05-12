package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.LiveGameFloatMsgPanelConfig;

@SettingsKey("live_game_float_msg_panel_config")
/* loaded from: classes6.dex */
public final class LiveGameFloatMsgPanelConfigSetting {
    public static final LiveGameFloatMsgPanelConfigSetting INSTANCE = new LiveGameFloatMsgPanelConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveGameFloatMsgPanelConfig DEFAULT = new LiveGameFloatMsgPanelConfig();

    public final LiveGameFloatMsgPanelConfig getValue() {
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig = (LiveGameFloatMsgPanelConfig) SettingsManager.INSTANCE.getValueSafely(LiveGameFloatMsgPanelConfigSetting.class);
        if (liveGameFloatMsgPanelConfig == null) {
            return DEFAULT;
        }
        return liveGameFloatMsgPanelConfig;
    }
}
