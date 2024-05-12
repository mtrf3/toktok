package X;

import Y.ARunnableS25S0200000_6;
import android.os.Handler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.traffic.TrafficMonitorConfigSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class EG9 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EG7.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(EG8.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(DJT.LJLIL);
    public static String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel tiktokTrafficMonitorConfigModel = TrafficMonitorConfigSettings.LIZ;
        TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel tiktokTrafficMonitorConfigModel2 = (TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel) LIZLLL2.LJIIIIZZ("tiktok_traffic_monitor_config", TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel.class, tiktokTrafficMonitorConfigModel);
        if (tiktokTrafficMonitorConfigModel2 == null) {
            tiktokTrafficMonitorConfigModel2 = tiktokTrafficMonitorConfigModel;
        }
        if (!tiktokTrafficMonitorConfigModel2.enable && !((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            c68322mC.element = "app_boot_flow_monitor_new_user_login";
            c68322mC2.element = "app_boot_flow_monitor_new_user_no_login";
        } else if (((Boolean) LIZJ.getValue()).booleanValue()) {
            c68322mC.element = "app_boot_flow_monitor_overlay_user_login";
            c68322mC2.element = "app_boot_flow_monitor_overlay_user_no_login";
        } else {
            c68322mC.element = "app_boot_flow_monitor_normal_user_login";
            c68322mC2.element = "app_boot_flow_monitor_normal_user_no_login";
        }
        String str = (String) c68322mC2.element;
        PHG phg = EGB.LIZ;
        phg.LJJJLIIL(str, true);
        phg.LJJJLIIL((String) c68322mC.element, true);
        Handler handler = C37179EiV.LJFF;
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(c68322mC2, c68322mC, 27);
        TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel tiktokTrafficMonitorConfigModel3 = (TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_traffic_monitor_config", TrafficMonitorConfigSettings.TiktokTrafficMonitorConfigModel.class, tiktokTrafficMonitorConfigModel);
        if (tiktokTrafficMonitorConfigModel3 != null) {
            tiktokTrafficMonitorConfigModel = tiktokTrafficMonitorConfigModel3;
        }
        handler.postDelayed(aRunnableS25S0200000_6, tiktokTrafficMonitorConfigModel.loginMonitorDuration);
    }
}
