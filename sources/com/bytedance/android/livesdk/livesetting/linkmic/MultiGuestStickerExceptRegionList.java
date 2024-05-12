package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_sticker_except_region_list")
/* loaded from: classes6.dex */
public final class MultiGuestStickerExceptRegionList {
    public static final MultiGuestStickerExceptRegionList INSTANCE = new MultiGuestStickerExceptRegionList();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];

    public static final String[] getAsiaRegionList() {
        return SettingsManager.INSTANCE.getStringArrayValue(MultiGuestStickerExceptRegionList.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
