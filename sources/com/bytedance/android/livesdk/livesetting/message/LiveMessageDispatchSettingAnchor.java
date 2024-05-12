package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey("live_message_dispatch_config_anchor")
/* loaded from: classes6.dex */
public final class LiveMessageDispatchSettingAnchor {

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageDispatchConfig DEFAULT;
    public static final LiveMessageDispatchSettingAnchor INSTANCE = new LiveMessageDispatchSettingAnchor();
    public static LiveMessageDispatchConfig liveMessageDispatchConfig;

    static {
        LiveMessageDispatchConfig liveMessageDispatchConfig2 = new LiveMessageDispatchConfig(false, false, null, null, null, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, false, false, false, 131071, null);
        DEFAULT = liveMessageDispatchConfig2;
        LiveMessageDispatchConfig liveMessageDispatchConfig3 = (LiveMessageDispatchConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageDispatchSettingAnchor.class);
        if (liveMessageDispatchConfig3 != null) {
            liveMessageDispatchConfig2 = liveMessageDispatchConfig3;
        }
        liveMessageDispatchConfig = liveMessageDispatchConfig2;
    }

    public final List<String> byPassDispatchAllowList() {
        return liveMessageDispatchConfig.byPassDispatchAllowList;
    }

    public final List<String> directDispatchAllowList() {
        return liveMessageDispatchConfig.directDispatchAllowList;
    }

    public final List<String> directDispatchP2pBlockList() {
        return liveMessageDispatchConfig.directDispatchP2pBlockList;
    }

    public final boolean directDispatchP2pMsg() {
        return liveMessageDispatchConfig.directDispatchP2pMsg;
    }

    public final int dispatchDynamicDuration() {
        return liveMessageDispatchConfig.dispatchDynamicDuration;
    }

    public final int dispatchLimitDuration() {
        return liveMessageDispatchConfig.dispatchLimitDuration;
    }

    public final long dispatchMessageTimeout() {
        return liveMessageDispatchConfig.dispatchMessageTimeout;
    }

    public final int dispatchStrategy() {
        return liveMessageDispatchConfig.dispatchStrategy;
    }

    public final boolean enableAsyncDispatch() {
        return liveMessageDispatchConfig.enableAsyncDispatch;
    }

    public final boolean enableDispatchListOptimize() {
        return liveMessageDispatchConfig.enableDispatchListOptimize;
    }

    public final boolean enableInactiveOpt() {
        return liveMessageDispatchConfig.enableInactiveOpt;
    }

    public final long fixreqDispatchInterval() {
        return liveMessageDispatchConfig.fixfreqDispatchInterval;
    }

    public final int fixreqDispatchSize() {
        return liveMessageDispatchConfig.fixfreqDispatchSize;
    }

    public final int fixreqMaxQueueSize() {
        return liveMessageDispatchConfig.fixfreqMaxQueueSize;
    }

    public final int optwindowMinDispatchSize() {
        return liveMessageDispatchConfig.optwindowMinDispatchSize;
    }

    public final long optwindowWindowTime() {
        return liveMessageDispatchConfig.optwindowWindowTime;
    }

    public final boolean smoothDispatchOptimize() {
        return liveMessageDispatchConfig.smoothDispatchOptimize;
    }
}
