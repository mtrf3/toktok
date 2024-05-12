package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.Js2XssConfig;

/* renamed from: X.Dxk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35576Dxk implements InterfaceC37086Eh0 {
    @Override // X.InterfaceC37086Eh0
    public final boolean LIZ(EnumC35578Dxm enumC35578Dxm) {
        Js2XssConfig js2XssConfig;
        int i = C35577Dxl.LIZ[enumC35578Dxm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return ((Boolean) DOR.LIZLLL.getValue()).booleanValue();
            }
            return ((Boolean) DOR.LIZJ.getValue()).booleanValue();
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            js2XssConfig = C35575Dxj.LIZ;
            Js2XssConfig js2XssConfig2 = (Js2XssConfig) LIZLLL.LJIIIIZZ("js2_xss_config", Js2XssConfig.class, js2XssConfig);
            if (js2XssConfig2 != null) {
                js2XssConfig = js2XssConfig2;
            }
        } catch (Throwable unused) {
            js2XssConfig = C35575Dxj.LIZ;
        }
        return js2XssConfig.xssCallBackEnable;
    }
}
