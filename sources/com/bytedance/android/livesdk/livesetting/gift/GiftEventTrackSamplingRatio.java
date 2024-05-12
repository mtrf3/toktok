package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_event_track_sampling_ratio")
/* loaded from: classes6.dex */
public final class GiftEventTrackSamplingRatio {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final GiftEventTrackSamplingRatio INSTANCE = new GiftEventTrackSamplingRatio();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GiftEventTrackSamplingRatio.class);
    }
}
