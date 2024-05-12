package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.ttlivestreamer.core.utils.QualcommGpuUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("webcast_broadcast_qualcomm_gpu_hint_opt")
/* loaded from: classes6.dex */
public final class QualcommGpuHintSettings {
    public static final QualcommGpuHintSettings INSTANCE = new QualcommGpuHintSettings();

    @Group(isDefault = true, value = "default group")
    public static final GpuHintSettings DEFAULT = new GpuHintSettings(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);

    public final int getTime() {
        GpuHintSettings gpuHintSettings = (GpuHintSettings) SettingsManager.INSTANCE.getValueSafely(QualcommGpuHintSettings.class);
        if (gpuHintSettings == null) {
            gpuHintSettings = DEFAULT;
        }
        return gpuHintSettings.gpuHintDuration;
    }

    public final QualcommGpuUtils.CommandType getType() {
        GpuHintSettings gpuHintSettings = (GpuHintSettings) SettingsManager.INSTANCE.getValueSafely(QualcommGpuHintSettings.class);
        if (gpuHintSettings == null) {
            gpuHintSettings = DEFAULT;
        }
        int i = gpuHintSettings.gpuHintType;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return QualcommGpuUtils.CommandType.DEFAULT;
                }
                return QualcommGpuUtils.CommandType.HIGH;
            }
            return QualcommGpuUtils.CommandType.LOW;
        }
        return QualcommGpuUtils.CommandType.DISABLE;
    }

    public final boolean isEnable() {
        GpuHintSettings gpuHintSettings = (GpuHintSettings) SettingsManager.INSTANCE.getValueSafely(QualcommGpuHintSettings.class);
        if (gpuHintSettings == null) {
            gpuHintSettings = DEFAULT;
        }
        return gpuHintSettings.enable;
    }

    /* loaded from: classes6.dex */
    public static final class GpuHintSettings {

        @InterfaceC65349Pkn("webcast_broadcast_qualcomm_gpu_hint_enable")
        public boolean enable;

        @InterfaceC65349Pkn("webcast_broadcast_qualcomm_gpu_hint_duration")
        public int gpuHintDuration;

        @InterfaceC65349Pkn("webcast_broadcast_qualcomm_gpu_hint_type")
        public int gpuHintType;

        /* JADX WARN: Multi-variable type inference failed */
        public GpuHintSettings() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public GpuHintSettings(boolean z, int i, int i2) {
            this.enable = z;
            this.gpuHintType = i;
            this.gpuHintDuration = i2;
        }

        public /* synthetic */ GpuHintSettings(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
        }
    }
}
