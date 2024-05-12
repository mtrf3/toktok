package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiGuestShowBeautyOnLowScoreDeviceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiGuestShowStickerOnLowScoreDeviceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBeautyDowngradeDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPropDowngradeDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;

/* renamed from: X.C6i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30784C6i {
    public static boolean LIZ() {
        TTliveAnchorDeviceScoreSetting tTliveAnchorDeviceScoreSetting = TTliveAnchorDeviceScoreSetting.INSTANCE;
        if (tTliveAnchorDeviceScoreSetting.getValue() < MultiGuestBeautyDowngradeDeviceScoreSetting.INSTANCE.getValue() && tTliveAnchorDeviceScoreSetting.getValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        TTliveAnchorDeviceScoreSetting tTliveAnchorDeviceScoreSetting = TTliveAnchorDeviceScoreSetting.INSTANCE;
        if (tTliveAnchorDeviceScoreSetting.getValue() < MultiGuestPropDowngradeDeviceScoreSetting.INSTANCE.getValue() && tTliveAnchorDeviceScoreSetting.getValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZ() && LIZIZ() && !LiveMultiGuestShowStickerOnLowScoreDeviceSetting.INSTANCE.canShowStickerEntrance() && !LiveMultiGuestShowBeautyOnLowScoreDeviceSetting.INSTANCE.enableBeautyOnLowScoreDevice()) {
            return true;
        }
        return false;
    }
}
