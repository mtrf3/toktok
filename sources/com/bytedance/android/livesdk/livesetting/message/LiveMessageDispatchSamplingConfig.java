package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;

@SettingsKey("live_message_dispatch_sampling")
/* loaded from: classes6.dex */
public final class LiveMessageDispatchSamplingConfig {

    @Group(isDefault = true, value = "default group")
    public static final LiveIMMessageTrackConfig DEFAULT;
    public static final LiveMessageDispatchSamplingConfig INSTANCE = new LiveMessageDispatchSamplingConfig();
    public static LiveIMMessageTrackConfig liveIMMessageTrackConfig;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LiveIMMessageTrackConfig liveIMMessageTrackConfig2 = new LiveIMMessageTrackConfig(d, d, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        DEFAULT = liveIMMessageTrackConfig2;
        LiveIMMessageTrackConfig liveIMMessageTrackConfig3 = (LiveIMMessageTrackConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageDispatchSamplingConfig.class);
        if (liveIMMessageTrackConfig3 != null) {
            liveIMMessageTrackConfig2 = liveIMMessageTrackConfig3;
        }
        liveIMMessageTrackConfig = liveIMMessageTrackConfig2;
    }

    public final double commonSamplingRate() {
        return liveIMMessageTrackConfig.getSamplingRate();
    }

    public final List<String> getAllowedMethods() {
        return liveIMMessageTrackConfig.getAllowedMethods();
    }

    public final List<String> getAllowedP2PMethods() {
        return liveIMMessageTrackConfig.getAllowedP2PMethods();
    }

    public final double p2pSamplingRate() {
        return liveIMMessageTrackConfig.getP2pFullSampling();
    }

    public final LiveIMMessageTrackConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveIMMessageTrackConfig getValue() {
        return liveIMMessageTrackConfig;
    }
}
