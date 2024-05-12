package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C31007CEx;
import X.C5H3;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_async_schedule")
/* loaded from: classes6.dex */
public final class LiveSdkPublicScreenMessageScheduleStrategySetting {
    public static final LiveSdkPublicScreenMessageScheduleStrategySetting INSTANCE = new LiveSdkPublicScreenMessageScheduleStrategySetting();

    @Group(isDefault = true, value = "default group")
    public static final LivePublicScreenAsyncConfig DEFAULT = new LivePublicScreenAsyncConfig();
    public static final C5H3 priority$delegate = C221108m2.LIZIZ(C31007CEx.LJLIL);

    /* loaded from: classes6.dex */
    public static final class LivePublicScreenAsyncConfig {

        @InterfaceC65349Pkn("async_schedule")
        public int messageScheduleStrategy;

        @InterfaceC65349Pkn("message_schedule_thread_priority")
        public int threadPriority = 5;
    }

    public static final int getMessageScheduleStrategy() {
        return INSTANCE.getPriority().messageScheduleStrategy;
    }

    private final LivePublicScreenAsyncConfig getPriority() {
        return (LivePublicScreenAsyncConfig) priority$delegate.getValue();
    }

    public static final int getThreadPriority() {
        return INSTANCE.getPriority().threadPriority;
    }

    public final LivePublicScreenAsyncConfig getValue() {
        LivePublicScreenAsyncConfig livePublicScreenAsyncConfig = (LivePublicScreenAsyncConfig) SettingsManager.INSTANCE.getValueSafely(LiveSdkPublicScreenMessageScheduleStrategySetting.class);
        if (livePublicScreenAsyncConfig == null) {
            return DEFAULT;
        }
        return livePublicScreenAsyncConfig;
    }
}
