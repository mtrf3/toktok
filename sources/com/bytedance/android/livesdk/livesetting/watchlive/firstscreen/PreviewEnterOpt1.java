package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("preview_enter_opt1")
/* loaded from: classes6.dex */
public final class PreviewEnterOpt1 {
    public static final PreviewEnterOpt1 INSTANCE = new PreviewEnterOpt1();

    @Group(isDefault = true, value = "v1 group")
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(PreviewEnterOpt1.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
