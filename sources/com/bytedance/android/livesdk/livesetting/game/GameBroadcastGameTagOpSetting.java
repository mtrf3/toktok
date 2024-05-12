package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_gametag_backend_search")
/* loaded from: classes6.dex */
public final class GameBroadcastGameTagOpSetting {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final GameBroadcastGameTagOpSetting INSTANCE = new GameBroadcastGameTagOpSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(GameBroadcastGameTagOpSetting.class);
    }
}
