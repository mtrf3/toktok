package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_new_broadcast_education_h5_scheme")
/* loaded from: classes6.dex */
public final class LiveNewGameBroadcastEducationScheme {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveNewGameBroadcastEducationScheme INSTANCE = new LiveNewGameBroadcastEducationScheme();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveNewGameBroadcastEducationScheme.class);
    }
}
