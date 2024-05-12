package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_match_timeout")
/* loaded from: classes6.dex */
public final class LiveMatchTimeOutSetting {
    public static final LiveMatchTimeOutSetting INSTANCE = new LiveMatchTimeOutSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveMatchTimeOutData DEFAULT = new LiveMatchTimeOutData(40, 50, 60, 10);

    public final LiveMatchTimeOutData getValue() {
        LiveMatchTimeOutData liveMatchTimeOutData = (LiveMatchTimeOutData) SettingsManager.INSTANCE.getValueSafely(LiveMatchTimeOutSetting.class);
        if (liveMatchTimeOutData == null) {
            return DEFAULT;
        }
        return liveMatchTimeOutData;
    }

    public final LiveMatchTimeOutData getDEFAULT() {
        return DEFAULT;
    }
}
