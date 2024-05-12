package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComPdpConfig;

/* renamed from: X.2VO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VO {
    public static final EComPdpConfig LIZ = new EComPdpConfig(LiveTryModeCountDownThresholdSetting.DEFAULT, 10, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);

    public static final EComPdpConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EComPdpConfig eComPdpConfig = LIZ;
        EComPdpConfig eComPdpConfig2 = (EComPdpConfig) LIZLLL.LJIIIIZZ("ecom_pdp_settings_config", EComPdpConfig.class, eComPdpConfig);
        if (eComPdpConfig2 == null) {
            return eComPdpConfig;
        }
        return eComPdpConfig2;
    }
}
