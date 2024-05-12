package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_game_dual_device_source_param")
/* loaded from: classes6.dex */
public final class LiveGameDualDeviceSourceSetting {
    public static final LiveGameDualDeviceSourceSetting INSTANCE = new LiveGameDualDeviceSourceSetting();

    @Group(isDefault = true, value = "default group")
    public static final SourceParam DEFAULT = new SourceParam(false, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);

    public final boolean enable() {
        SourceParam sourceParam = (SourceParam) SettingsManager.INSTANCE.getValueSafely(LiveGameDualDeviceSourceSetting.class);
        if (sourceParam == null) {
            sourceParam = DEFAULT;
        }
        return sourceParam.enable;
    }

    public final int getBitRate() {
        SourceParam sourceParam = (SourceParam) SettingsManager.INSTANCE.getValueSafely(LiveGameDualDeviceSourceSetting.class);
        if (sourceParam == null) {
            sourceParam = DEFAULT;
        }
        return sourceParam.bitRate;
    }

    public final long getDuration() {
        SourceParam sourceParam = (SourceParam) SettingsManager.INSTANCE.getValueSafely(LiveGameDualDeviceSourceSetting.class);
        if (sourceParam == null) {
            sourceParam = DEFAULT;
        }
        return sourceParam.retryDuration;
    }

    public final int getFPS() {
        SourceParam sourceParam = (SourceParam) SettingsManager.INSTANCE.getValueSafely(LiveGameDualDeviceSourceSetting.class);
        if (sourceParam == null) {
            sourceParam = DEFAULT;
        }
        return sourceParam.cameraFPS;
    }

    /* loaded from: classes6.dex */
    public static final class SourceParam {

        @InterfaceC65349Pkn("live_game_dual_device_camera_bit_rate")
        public int bitRate;

        @InterfaceC65349Pkn("live_game_dual_device_camera_fps")
        public int cameraFPS;

        @InterfaceC65349Pkn("live_game_dual_device_camera_enable")
        public boolean enable;

        @InterfaceC65349Pkn("live_game_dual_device_camera_retry_duration_sec")
        public long retryDuration;

        /* JADX WARN: Multi-variable type inference failed */
        public SourceParam() {
            this(false, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
        }

        public SourceParam(boolean z, long j, int i, int i2) {
            this.enable = z;
            this.retryDuration = j;
            this.cameraFPS = i;
            this.bitRate = i2;
        }

        public /* synthetic */ SourceParam(boolean z, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 500L : j, (i3 & 4) != 0 ? 30 : i, (i3 & 8) != 0 ? 4 : i2);
        }
    }
}
