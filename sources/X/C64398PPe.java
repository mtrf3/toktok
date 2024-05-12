package X;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PPe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64398PPe implements InterfaceC66032Pvo {
    public static final C64398PPe LIZ = new C64398PPe();

    public static String LIZIZ(int i) {
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return "ANR";
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "OTHER KILLS BY SYSTEM";
            default:
                return "UNKNOWN";
        }
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        C65977Puv c65977Puv;
        o.LJIIIZ(newSettings, "newSettings");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                    o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                    Application application = heliosEnvImpl.LJIIIIZZ;
                    o.LJIIIIZZ(application, "HeliosEnvImpl.get().application");
                    if (C36836Ecy.LIZIZ(application) && (c65977Puv = C65972Puq.LIZIZ) != null && c65977Puv.LJLJJL) {
                        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                        Application application2 = heliosEnvImpl2.LJIIIIZZ;
                        if (application2 != null) {
                            Object LLIZ = C16880lQ.LLIZ("activity", application2);
                            if (LLIZ != null) {
                                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) LLIZ).getHistoricalProcessExitReasons(application2.getPackageName(), 0, 1);
                                o.LJIIIIZZ(historicalProcessExitReasons, "(it as ActivityManager).…                        )");
                                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) ORZ.LJLLLL(historicalProcessExitReasons);
                                if (applicationExitInfo != null) {
                                    String LIZIZ = LIZIZ(applicationExitInfo.getReason());
                                    ApmEvent apmEvent = new ApmEvent("helios_app_exit_reason");
                                    apmEvent.LIZ(LIZIZ, "reason");
                                    C66059PwF.LIZIZ(apmEvent);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            C65929Pu9.LIZ(currentTimeMillis, "AppExitReasonManager.onNewSettings", false);
        }
    }
}
