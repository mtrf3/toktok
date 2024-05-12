package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("deco_text_modify_frequency")
/* loaded from: classes6.dex */
public final class DecoTextModifyFrequencySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final DecoTextModifyFrequencySetting INSTANCE = new DecoTextModifyFrequencySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(DecoTextModifyFrequencySetting.class);
    }
}
