package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.Camera2AB;

@SettingsKey("camera_type_setting")
/* loaded from: classes6.dex */
public final class CameraTypeSettingSetting {
    public static final CameraTypeSettingSetting INSTANCE = new CameraTypeSettingSetting();

    @Group(isDefault = true, value = "default group")
    public static final Camera2AB DEFAULT = new Camera2AB(1, 0);

    public final Camera2AB getValue() {
        Camera2AB camera2AB = (Camera2AB) SettingsManager.INSTANCE.getValueSafely(CameraTypeSettingSetting.class);
        if (camera2AB == null) {
            return DEFAULT;
        }
        return camera2AB;
    }
}
