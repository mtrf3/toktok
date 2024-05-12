package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_match_resume_policy")
/* loaded from: classes6.dex */
public final class LiveCohostEnableMatchResumeSetting {
    public static final LiveCohostEnableMatchResumeSetting INSTANCE = new LiveCohostEnableMatchResumeSetting();

    @Group(isDefault = true, value = "default group")
    public static final CohostMatchResumeSetting DEFAULT = new CohostMatchResumeSetting(0, 0, 3, null);

    public final CohostMatchResumeSetting getValue() {
        CohostMatchResumeSetting cohostMatchResumeSetting = (CohostMatchResumeSetting) SettingsManager.INSTANCE.getValueSafely(LiveCohostEnableMatchResumeSetting.class);
        if (cohostMatchResumeSetting == null) {
            return DEFAULT;
        }
        return cohostMatchResumeSetting;
    }

    public final boolean isEnableCoHostResume() {
        if (getValue().enableMatchResume == 1) {
            return true;
        }
        return false;
    }
}
