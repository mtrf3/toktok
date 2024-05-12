package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_anchor_send_pause_sei")
/* loaded from: classes6.dex */
public final class GameBroadcastAnchorEnableSendPauseSeiSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameBroadcastAnchorEnableSendPauseSeiSetting INSTANCE = new GameBroadcastAnchorEnableSendPauseSeiSetting();

    @Group("experiment_group")
    public static final boolean ENABLE = true;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(GameBroadcastAnchorEnableSendPauseSeiSetting.class) == ENABLE) {
            return true;
        }
        return false;
    }
}
