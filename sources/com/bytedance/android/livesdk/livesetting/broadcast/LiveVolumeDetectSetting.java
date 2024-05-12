package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C58576Myq;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;

@SettingsKey("live_volume_detect_config")
/* loaded from: classes11.dex */
public final class LiveVolumeDetectSetting {
    public static final LiveVolumeDetectSetting INSTANCE = new LiveVolumeDetectSetting();

    @Group(isDefault = true, value = "default group")
    public static final VolumeDetectConfig DEFAULT = new VolumeDetectConfig(0, 0, 0, 0, 0, 31, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58576Myq.LJLIL);

    private final VolumeDetectConfig getSettingValue() {
        return (VolumeDetectConfig) settingValue$delegate.getValue();
    }

    public final VolumeDetectConfig getValue() {
        return getSettingValue();
    }
}
