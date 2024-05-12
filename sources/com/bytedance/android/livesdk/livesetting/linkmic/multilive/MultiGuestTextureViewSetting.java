package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multiguest_preview_texture_view")
/* loaded from: classes6.dex */
public final class MultiGuestTextureViewSetting {

    @Group(isDefault = true, value = "enable texture preview view.")
    public static final int DEFAULT = 1;
    public static final MultiGuestTextureViewSetting INSTANCE = new MultiGuestTextureViewSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestTextureViewSetting.class);
    }

    public final boolean enableTextureView() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
