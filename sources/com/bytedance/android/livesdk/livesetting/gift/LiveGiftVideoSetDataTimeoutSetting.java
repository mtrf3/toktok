package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_gift_video_setdata_timeout")
/* loaded from: classes6.dex */
public final class LiveGiftVideoSetDataTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LiveGiftVideoSetDataTimeoutSetting INSTANCE = new LiveGiftVideoSetDataTimeoutSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftVideoSetDataTimeoutSetting.class);
    }
}
