package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;

@SettingsKey("live_message_received_sampling")
/* loaded from: classes6.dex */
public final class LiveMessageReceiveSamplingConfig {

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageReceiveTrackConfig DEFAULT;
    public static final LiveMessageReceiveSamplingConfig INSTANCE = new LiveMessageReceiveSamplingConfig();
    public static LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig;

    static {
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig2 = new LiveMessageReceiveTrackConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, 15, null);
        DEFAULT = liveMessageReceiveTrackConfig2;
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig3 = (LiveMessageReceiveTrackConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageReceiveSamplingConfig.class);
        if (liveMessageReceiveTrackConfig3 != null) {
            liveMessageReceiveTrackConfig2 = liveMessageReceiveTrackConfig3;
        }
        liveMessageReceiveTrackConfig = liveMessageReceiveTrackConfig2;
    }

    public final double commonSamplingRate() {
        return liveMessageReceiveTrackConfig.getSamplingRate();
    }

    public final List<String> getAllowedMethods() {
        return liveMessageReceiveTrackConfig.getAllowedMethods();
    }

    public final List<String> getAllowedP2PMethods() {
        return liveMessageReceiveTrackConfig.getAllowedP2PMethods();
    }

    public final double p2pSamplingRate() {
        return liveMessageReceiveTrackConfig.getP2pFullSampling();
    }

    public final LiveMessageReceiveTrackConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveMessageReceiveTrackConfig getValue() {
        return liveMessageReceiveTrackConfig;
    }
}
