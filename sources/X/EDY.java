package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaConfig;

/* loaded from: classes7.dex */
public final class EDY {
    public static final RomaConfig LIZ = new RomaConfig(false, false, null, null, 15, null);

    public static RomaConfig LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            RomaConfig romaConfig = LIZ;
            RomaConfig romaConfig2 = (RomaConfig) LIZLLL.LJIIIIZZ("roma_check_setting", RomaConfig.class, romaConfig);
            if (romaConfig2 != null) {
                return romaConfig2;
            }
            return romaConfig;
        } catch (Exception unused) {
            return LIZ;
        }
    }
}
