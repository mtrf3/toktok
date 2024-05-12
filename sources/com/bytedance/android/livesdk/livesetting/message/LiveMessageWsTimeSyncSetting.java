package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ws_time_sync_config")
/* loaded from: classes6.dex */
public final class LiveMessageWsTimeSyncSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageWsTimeSyncConfig DEFAULT;
    public static final LiveMessageWsTimeSyncSetting INSTANCE = new LiveMessageWsTimeSyncSetting();
    public static LiveMessageWsTimeSyncConfig liveMessageSyncConfig;
    public static boolean optHBTimeSync;
    public static boolean sendHBAfterWsConnect;
    public static long validWsRequestInterval;

    static {
        LiveMessageWsTimeSyncConfig liveMessageWsTimeSyncConfig = new LiveMessageWsTimeSyncConfig(0L, false, false, 7, null);
        DEFAULT = liveMessageWsTimeSyncConfig;
        LiveMessageWsTimeSyncConfig liveMessageWsTimeSyncConfig2 = (LiveMessageWsTimeSyncConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageWsTimeSyncSetting.class);
        if (liveMessageWsTimeSyncConfig2 != null) {
            liveMessageWsTimeSyncConfig = liveMessageWsTimeSyncConfig2;
        }
        liveMessageSyncConfig = liveMessageWsTimeSyncConfig;
        validWsRequestInterval = liveMessageWsTimeSyncConfig.getValidWsRequestInterval();
        optHBTimeSync = liveMessageSyncConfig.getOptHBTimeSync();
        sendHBAfterWsConnect = liveMessageSyncConfig.getSendHBAfterWsConnect();
    }
}
