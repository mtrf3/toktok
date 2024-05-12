package X;

import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* loaded from: classes9.dex */
public final class ILI {
    public static IPlayerEventReportService LIZ;
    public static ISimReporterConfig LIZIZ;

    public static synchronized IPlayerEventReportService LIZ() {
        IPlayerEventReportService iPlayerEventReportService;
        synchronized (ILI.class) {
            if (LIZIZ == null) {
                ISimReporterConfig iSimReporterConfig = (ISimReporterConfig) InjectedConfigManager.getConfig(ISimReporterConfig.class);
                LIZIZ = iSimReporterConfig;
                if (iSimReporterConfig == null) {
                    LIZIZ = new ILG();
                }
            }
            if (LIZIZ == null) {
                if (!C46982IcE.LIZIZ().isDebug()) {
                    C46982IcE.LJI().ensureNotReachHere(new Exception(), "SimReporterService getInstance NULL.");
                } else {
                    throw new RuntimeException("SimReporterService getInstance NULL.");
                }
            }
            if (LIZ == null) {
                IL9 il9 = IPlayerEventReportService.LIZ;
                ILB reporterType = LIZIZ.getReporterType();
                il9.getClass();
                IPlayerEventReportService LIZ2 = IL9.LIZ(reporterType);
                LIZ = LIZ2;
                LIZ2.initConfig(LIZIZ);
            }
            iPlayerEventReportService = LIZ;
        }
        return iPlayerEventReportService;
    }
}
