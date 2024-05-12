package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "mt_live_finish_page_preload_type")
/* loaded from: classes6.dex */
public final class LiveFinishPagePreloadTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveFinishPagePreloadTypeSetting INSTANCE = new LiveFinishPagePreloadTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFinishPagePreloadTypeSetting.class);
    }
}
