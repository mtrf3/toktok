package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.PLNetMonitorConfig;

/* renamed from: X.Puo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65970Puo {
    public static final PLNetMonitorConfig LIZ;

    static {
        SettingsManager.LIZLLL().LJIIIZ(C65971Pup.LJLIL);
        LIZ = new PLNetMonitorConfig(false, 0, 0, 7, null);
    }

    public static PLNetMonitorConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PLNetMonitorConfig pLNetMonitorConfig = LIZ;
        PLNetMonitorConfig pLNetMonitorConfig2 = (PLNetMonitorConfig) LIZLLL.LJIIIIZZ("pns_pl_net_monitor_settings", PLNetMonitorConfig.class, pLNetMonitorConfig);
        if (pLNetMonitorConfig2 == null) {
            return pLNetMonitorConfig;
        }
        return pLNetMonitorConfig2;
    }
}
