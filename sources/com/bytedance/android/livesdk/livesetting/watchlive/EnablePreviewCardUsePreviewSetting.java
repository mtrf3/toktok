package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_preview_card_use_preview")
/* loaded from: classes6.dex */
public final class EnablePreviewCardUsePreviewSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnablePreviewCardUsePreviewSetting INSTANCE = new EnablePreviewCardUsePreviewSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnablePreviewCardUsePreviewSetting.class);
    }
}
