package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_request_layout_governance")
/* loaded from: classes6.dex */
public final class LiveMatchRequestLayoutSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMatchRequestLayoutSettings INSTANCE = new LiveMatchRequestLayoutSettings();

    private final int getValue() {
        Integer num = (Integer) SettingsManager.INSTANCE.getValueSafely(LiveMatchRequestLayoutSettings.class);
        if (num != null) {
            return num.intValue();
        }
        return DEFAULT;
    }

    public final boolean isMatchEnabled() {
        if ((getValue() & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isRankListEnabled() {
        if ((getValue() & 1) == 1) {
            return true;
        }
        return false;
    }
}
