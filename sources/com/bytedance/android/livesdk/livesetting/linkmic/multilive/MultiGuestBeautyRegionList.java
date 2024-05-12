package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_beauty_region_list")
/* loaded from: classes6.dex */
public final class MultiGuestBeautyRegionList {
    public static final MultiGuestBeautyRegionList INSTANCE = new MultiGuestBeautyRegionList();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];

    public static final String[] getWhiteList() {
        return SettingsManager.INSTANCE.getStringArrayValue(MultiGuestBeautyRegionList.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
