package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("request_audience_api")
/* loaded from: classes6.dex */
public final class RequestAudienceApiExperiment {

    @Group(isDefault = true, value = "disable")
    public static final int DEFAULT = 0;
    public static final RequestAudienceApiExperiment INSTANCE = new RequestAudienceApiExperiment();

    @Group("enable")
    public static final int ENABLE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(RequestAudienceApiExperiment.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
