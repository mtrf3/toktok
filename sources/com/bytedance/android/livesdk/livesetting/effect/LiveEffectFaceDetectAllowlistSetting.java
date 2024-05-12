package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_face_detect_requirement_list")
/* loaded from: classes6.dex */
public final class LiveEffectFaceDetectAllowlistSetting {
    public static final LiveEffectFaceDetectAllowlistSetting INSTANCE = new LiveEffectFaceDetectAllowlistSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];
    public static final String[] ALLOWLIST = SettingsManager.INSTANCE.getStringArrayValue(LiveEffectFaceDetectAllowlistSetting.class);

    public final String[] getALLOWLIST() {
        return ALLOWLIST;
    }
}
