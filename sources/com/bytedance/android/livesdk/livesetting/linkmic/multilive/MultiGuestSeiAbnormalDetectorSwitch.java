package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_sei_abnormal_detector_switch")
/* loaded from: classes6.dex */
public final class MultiGuestSeiAbnormalDetectorSwitch {
    public static final MultiGuestSeiAbnormalDetectorSwitch INSTANCE = new MultiGuestSeiAbnormalDetectorSwitch();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestSeiAbnormalDetectorSetting DEFAULT = new MultiGuestSeiAbnormalDetectorSetting(false, 0, 0, 7, null);

    public final MultiGuestSeiAbnormalDetectorSetting getValue() {
        MultiGuestSeiAbnormalDetectorSetting multiGuestSeiAbnormalDetectorSetting = (MultiGuestSeiAbnormalDetectorSetting) SettingsManager.INSTANCE.getValueSafely(MultiGuestSeiAbnormalDetectorSwitch.class);
        if (multiGuestSeiAbnormalDetectorSetting == null) {
            return DEFAULT;
        }
        return multiGuestSeiAbnormalDetectorSetting;
    }
}
