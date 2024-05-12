package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("truth_or_dare_audience_visible")
/* loaded from: classes11.dex */
public final class TruthOrDareForAudienceAbTestSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final TruthOrDareForAudienceAbTestSetting INSTANCE = new TruthOrDareForAudienceAbTestSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TruthOrDareForAudienceAbTestSetting.class);
    }
}
