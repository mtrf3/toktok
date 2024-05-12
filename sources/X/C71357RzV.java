package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EComImageConfig;

/* renamed from: X.RzV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71357RzV {
    public static final EComImageConfig LIZ = new EComImageConfig(1000, 100, 300, 1);

    public static final EComImageConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EComImageConfig eComImageConfig = LIZ;
        EComImageConfig eComImageConfig2 = (EComImageConfig) LIZLLL.LJIIIIZZ("ecom_image_anchor_settings_config", EComImageConfig.class, eComImageConfig);
        if (eComImageConfig2 == null) {
            return eComImageConfig;
        }
        return eComImageConfig2;
    }
}
