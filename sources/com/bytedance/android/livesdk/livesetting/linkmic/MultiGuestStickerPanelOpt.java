package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_preview_panel_effect_opt")
/* loaded from: classes6.dex */
public final class MultiGuestStickerPanelOpt {
    public static final MultiGuestStickerPanelOpt INSTANCE = new MultiGuestStickerPanelOpt();

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = true;

    public static final boolean enableOpt() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestStickerPanelOpt.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
