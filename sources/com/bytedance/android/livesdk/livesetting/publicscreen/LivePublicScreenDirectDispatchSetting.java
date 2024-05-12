package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C5H3;
import X.CHH;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

@SettingsKey("live_public_screen_direct_dispatch_config")
/* loaded from: classes6.dex */
public final class LivePublicScreenDirectDispatchSetting {
    public static final LivePublicScreenDirectDispatchSetting INSTANCE = new LivePublicScreenDirectDispatchSetting();

    @Group(isDefault = true, value = "default group")
    public static final LivePublicScreenDistributeConfig DEFAULT = new LivePublicScreenDistributeConfig();
    public static final C5H3 strategy$delegate = C221108m2.LIZIZ(CHH.LJLIL);

    /* loaded from: classes6.dex */
    public static final class LivePublicScreenDistributeConfig {

        @InterfaceC65349Pkn("live_public_screen_dispatch_enable")
        public boolean enable;

        @InterfaceC65349Pkn("live_public_screen_dispatch_interval")
        public float live_public_screen_dispatch_interval = 2.0f;

        @InterfaceC65349Pkn("live_public_screen_min_msg_threshold")
        public int live_public_screen_min_msg_threshold = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

        @InterfaceC65349Pkn("live_public_screen_reset_timer_after_direct_dispatch")
        public boolean live_public_screen_reset_timer_after_direct_dispatch;
    }

    public static final boolean enable() {
        return INSTANCE.getStrategy().enable;
    }

    public static final int getDirectDispatchAccumulation() {
        return INSTANCE.getStrategy().live_public_screen_min_msg_threshold;
    }

    public static final float getDirectDispatchMaxInterval() {
        return INSTANCE.getStrategy().live_public_screen_dispatch_interval * 1000;
    }

    public static final float getDispatchInterval() {
        return INSTANCE.getStrategy().live_public_screen_dispatch_interval * 1000;
    }

    public static final boolean getResetDirectDispatch() {
        return INSTANCE.getStrategy().live_public_screen_reset_timer_after_direct_dispatch;
    }

    private final LivePublicScreenDistributeConfig getStrategy() {
        return (LivePublicScreenDistributeConfig) strategy$delegate.getValue();
    }

    public static final LivePublicScreenDistributeConfig getValue() {
        LivePublicScreenDistributeConfig livePublicScreenDistributeConfig = (LivePublicScreenDistributeConfig) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenDirectDispatchSetting.class);
        if (livePublicScreenDistributeConfig == null) {
            return DEFAULT;
        }
        return livePublicScreenDistributeConfig;
    }
}
