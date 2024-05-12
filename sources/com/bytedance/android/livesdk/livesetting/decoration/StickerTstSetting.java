package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sticker_tst_codes")
/* loaded from: classes6.dex */
public final class StickerTstSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final StickerTstSetting INSTANCE = new StickerTstSetting();

    public final boolean isTestEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(StickerTstSetting.class);
    }
}
