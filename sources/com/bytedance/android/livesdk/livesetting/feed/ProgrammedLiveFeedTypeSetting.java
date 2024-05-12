package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "programmed_live_feed_type")
/* loaded from: classes6.dex */
public final class ProgrammedLiveFeedTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final ProgrammedLiveFeedTypeSetting INSTANCE = new ProgrammedLiveFeedTypeSetting();

    @Group("v2 - info in first")
    public static final int V2 = 1;

    @Group("v3 - name in first")
    public static final int V3 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ProgrammedLiveFeedTypeSetting.class);
    }
}
