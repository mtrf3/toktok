package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_sticker_gift_tracking_setting")
/* loaded from: classes6.dex */
public final class FacialGiftTrackingSettings {
    public static final FacialGiftTrackingSettings INSTANCE = new FacialGiftTrackingSettings();

    @Group(isDefault = true, value = "Default value (On)")
    public static final FacialGiftTrackingModel DEFAULT = new FacialGiftTrackingModel(null, null, 3, null);

    public final int getMultiHostPermanentSeiMinVersion() {
        Integer num;
        FacialGiftTrackingModel facialGiftTrackingModel = (FacialGiftTrackingModel) SettingsManager.INSTANCE.getValueSafely(FacialGiftTrackingSettings.class);
        if (facialGiftTrackingModel != null && (num = facialGiftTrackingModel.linkTrackingMinVersion) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean isEnabled() {
        FacialGiftTrackingModel facialGiftTrackingModel = (FacialGiftTrackingModel) SettingsManager.INSTANCE.getValueSafely(FacialGiftTrackingSettings.class);
        if (facialGiftTrackingModel != null) {
            return o.LJ(facialGiftTrackingModel.trackingEnabled, Boolean.TRUE);
        }
        return false;
    }
}
