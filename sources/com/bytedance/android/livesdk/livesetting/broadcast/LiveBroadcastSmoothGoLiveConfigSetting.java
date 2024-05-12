package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C29197Bd3;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_broadcast_smooth_go_live_config")
/* loaded from: classes6.dex */
public final class LiveBroadcastSmoothGoLiveConfigSetting {
    public static final LiveBroadcastSmoothGoLiveConfigSetting INSTANCE = new LiveBroadcastSmoothGoLiveConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final BroadcastSmoothGoLiveConfig DEFAULT = new BroadcastSmoothGoLiveConfig(false, 0, 3, null);
    public static final C5H3 VALUE$delegate = C221108m2.LIZIZ(C29197Bd3.LJLIL);

    private final BroadcastSmoothGoLiveConfig getVALUE() {
        return (BroadcastSmoothGoLiveConfig) VALUE$delegate.getValue();
    }

    public final BroadcastSmoothGoLiveConfig getValue() {
        return getVALUE();
    }
}
