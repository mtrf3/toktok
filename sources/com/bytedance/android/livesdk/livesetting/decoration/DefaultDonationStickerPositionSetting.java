package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;

@SettingsKey("default_donation_sticker_position")
/* loaded from: classes6.dex */
public final class DefaultDonationStickerPositionSetting {
    public static final DefaultDonationStickerPositionSetting INSTANCE = new DefaultDonationStickerPositionSetting();

    @Group(isDefault = true, value = "default group")
    public static final DefaultDonationStickerPosition DEFAULT = new DefaultDonationStickerPosition();

    public final DefaultDonationStickerPosition getValue() {
        DefaultDonationStickerPosition defaultDonationStickerPosition = (DefaultDonationStickerPosition) SettingsManager.INSTANCE.getValueSafely(DefaultDonationStickerPositionSetting.class);
        if (defaultDonationStickerPosition == null) {
            return DEFAULT;
        }
        return defaultDonationStickerPosition;
    }
}
