package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ws_reuse")
/* loaded from: classes6.dex */
public final class LiveMessageWsReuseSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMessageWsReuseSetting INSTANCE = new LiveMessageWsReuseSetting();
    public static boolean webSocketReuse = SettingsManager.INSTANCE.getBooleanValue(LiveMessageWsReuseSetting.class);
}
