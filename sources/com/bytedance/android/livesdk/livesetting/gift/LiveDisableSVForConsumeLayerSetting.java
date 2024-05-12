package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_disable_trans_surfaceview_for_user_layer")
/* loaded from: classes6.dex */
public final class LiveDisableSVForConsumeLayerSetting {

    @Group(isDefault = true, value = "TextureView")
    public static final int DEFAULT = -1;
    public static final LiveDisableSVForConsumeLayerSetting INSTANCE = new LiveDisableSVForConsumeLayerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDisableSVForConsumeLayerSetting.class);
    }

    public final boolean inLayer() {
        int value = getValue();
        if (value >= 0 && LiveGiftUserConsumeLayerSetting.INSTANCE.getValue() >= value) {
            return true;
        }
        return false;
    }
}
