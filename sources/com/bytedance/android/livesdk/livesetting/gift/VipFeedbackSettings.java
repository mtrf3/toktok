package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_vip_feedback_im")
/* loaded from: classes6.dex */
public final class VipFeedbackSettings {
    public static final VipFeedbackSettings INSTANCE = new VipFeedbackSettings();

    @Group(isDefault = true, value = "Default")
    public static final VipFeedbackStruct DEFAULT = new VipFeedbackStruct(false, null, null, null, 15, null);

    private final VipFeedbackStruct getValue() {
        VipFeedbackStruct vipFeedbackStruct = (VipFeedbackStruct) SettingsManager.INSTANCE.getValueSafely(VipFeedbackSettings.class);
        if (vipFeedbackStruct == null) {
            return DEFAULT;
        }
        return vipFeedbackStruct;
    }

    public final String getGiftSchema() {
        String str = getValue().giftSchema;
        if (str.length() > 0) {
            return str;
        }
        return DEFAULT.giftSchema;
    }
}
