package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sticker_audience_enable")
/* loaded from: classes6.dex */
public final class StickerAudienceEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final StickerAudienceEnableSetting INSTANCE = new StickerAudienceEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StickerAudienceEnableSetting.class);
    }
}
