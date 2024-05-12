package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_x_settings")
/* loaded from: classes6.dex */
public final class LiveMatchXSetting {
    public static boolean sparkLoadSuccess;
    public static final LiveMatchXSetting INSTANCE = new LiveMatchXSetting();

    @Group(isDefault = true, value = "default group")
    public static final MatchXData DEFAULT = new MatchXData(false, null, 3, null);

    public final MatchXData getValue() {
        MatchXData matchXData = (MatchXData) SettingsManager.INSTANCE.getValueSafely(LiveMatchXSetting.class);
        if (matchXData == null) {
            return DEFAULT;
        }
        return matchXData;
    }

    public final String getLynxUrl() {
        return getValue().lynxUrl;
    }

    public final boolean isEnable() {
        return getValue().enable;
    }

    public final boolean getSparkLoadSuccess() {
        return sparkLoadSuccess;
    }

    public final void setSparkLoadSuccess(boolean z) {
        sparkLoadSuccess = z;
    }
}
