package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sticker_anchor_enable_new")
/* loaded from: classes6.dex */
public final class StickerAnchorEnableSettingNew {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final StickerAnchorEnableSettingNew INSTANCE = new StickerAnchorEnableSettingNew();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StickerAnchorEnableSettingNew.class);
    }
}
