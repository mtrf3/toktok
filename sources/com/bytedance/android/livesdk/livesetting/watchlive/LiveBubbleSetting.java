package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;

@SettingsKey("live_bubble_setting")
/* loaded from: classes11.dex */
public final class LiveBubbleSetting {
    public static final LiveBubbleSetting INSTANCE = new LiveBubbleSetting();

    @Group(isDefault = true, value = "default")
    public static final BubbleSettingData DEFAULT = new BubbleSettingData(0, 0, 0, 7, null);

    public final BubbleSettingData getConfig() {
        BubbleSettingData bubbleSettingData = (BubbleSettingData) SettingsManager.INSTANCE.getValueSafely(LiveBubbleSetting.class);
        if (bubbleSettingData == null) {
            return DEFAULT;
        }
        return bubbleSettingData;
    }

    public final BubbleSettingData getDEFAULT() {
        return DEFAULT;
    }
}
