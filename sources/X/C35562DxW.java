package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom.CustomConfig;

/* renamed from: X.DxW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35562DxW {
    public static final CustomConfig LIZ = new CustomConfig(false, 1, null);

    public static CustomConfig LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            CustomConfig customConfig = LIZ;
            CustomConfig customConfig2 = (CustomConfig) LIZLLL.LJIIIIZZ("custom_check_setting", CustomConfig.class, customConfig);
            if (customConfig2 != null) {
                return customConfig2;
            }
            return customConfig;
        } catch (Exception unused) {
            return LIZ;
        }
    }
}
