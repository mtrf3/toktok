package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_preview_small_gift")
/* loaded from: classes6.dex */
public final class LiveMatchPreviewSmallGiftSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LiveMatchPreviewSmallGiftSetting INSTANCE = new LiveMatchPreviewSmallGiftSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchPreviewSmallGiftSetting.class);
    }
}
