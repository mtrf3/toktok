package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_multithreaded_event_tracking")
/* loaded from: classes6.dex */
public final class LiveGiftMultithreadedEventTrackingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftMultithreadedEventTrackingSetting INSTANCE = new LiveGiftMultithreadedEventTrackingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftMultithreadedEventTrackingSetting.class);
    }
}
