package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.security.csrf.CSRFSettingsBean;

/* renamed from: X.EiH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37165EiH {
    public static final CSRFSettingsBean LIZ = new CSRFSettingsBean(false, false, false, false, false, false, false, null, null, null, null, null, null, 8191, null);

    public static CSRFSettingsBean LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            CSRFSettingsBean cSRFSettingsBean = LIZ;
            CSRFSettingsBean cSRFSettingsBean2 = (CSRFSettingsBean) LIZLLL.LJIIIIZZ("csrf_client_setting", CSRFSettingsBean.class, cSRFSettingsBean);
            if (cSRFSettingsBean2 != null) {
                return cSRFSettingsBean2;
            }
            return cSRFSettingsBean;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
