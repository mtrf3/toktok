package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_preview_camera_remeber_switch")
/* loaded from: classes6.dex */
public final class MultiGuestPreviewCameraMemorySettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestPreviewCameraMemorySettings INSTANCE = new MultiGuestPreviewCameraMemorySettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestPreviewCameraMemorySettings.class);
    }
}
