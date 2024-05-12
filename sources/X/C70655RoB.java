package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercebase.ab.EcomPerfMonitorSwitchConfig;

/* renamed from: X.RoB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70655RoB {
    public static final EcomPerfMonitorSwitchConfig LIZ;

    static {
        new C70655RoB();
        LIZ = new EcomPerfMonitorSwitchConfig(false, false, false, false, 15, null);
    }

    public static final EcomPerfMonitorSwitchConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomPerfMonitorSwitchConfig ecomPerfMonitorSwitchConfig = LIZ;
        EcomPerfMonitorSwitchConfig ecomPerfMonitorSwitchConfig2 = (EcomPerfMonitorSwitchConfig) LIZLLL.LJIIIIZZ("ecom_perf_monitor_switch_v2", EcomPerfMonitorSwitchConfig.class, ecomPerfMonitorSwitchConfig);
        if (ecomPerfMonitorSwitchConfig2 == null) {
            return ecomPerfMonitorSwitchConfig;
        }
        return ecomPerfMonitorSwitchConfig2;
    }

    public static final boolean LIZIZ() {
        return LIZ().f25switch;
    }
}
