package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_replay_download_global_network_listen_enable")
/* loaded from: classes6.dex */
public final class LiveReplayDownloadGlobalNetworkListenEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveReplayDownloadGlobalNetworkListenEnableSetting INSTANCE = new LiveReplayDownloadGlobalNetworkListenEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveReplayDownloadGlobalNetworkListenEnableSetting.class);
    }
}
