package X;

import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public final class X41 {
    public static final String LIZ = C16880lQ.LJLLJ(X41.class);
    public static final ConcurrentHashMap<Class, Object> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = null;
    public static volatile boolean LIZLLL = false;

    public static boolean LIZJ() {
        try {
            Class<?> cls = Class.forName("com.ss.android.socialbase.downloader.service.DownloadServiceLoader");
            cls.getMethod("load", new Class[0]).invoke(cls.newInstance(), new Object[0]);
            if (C65210PiY.LIZ()) {
                String str = LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Run load :");
                LIZ2.append("com.ss.android.socialbase.downloader.service.DownloadServiceLoader");
                LIZ2.append(" success");
                C65210PiY.LIZIZ(str, "runLoad", X1D.LIZIZ(LIZ2));
                return true;
            }
            return true;
        } catch (Throwable th) {
            LIZJ = th.toString();
            String str2 = LIZ;
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("Run load :", "com.ss.android.socialbase.downloader.service.DownloadServiceLoader", "fail, ");
            LIZIZ2.append(th.toString());
            C65210PiY.LIZJ(str2, "runLoad", X1D.LIZIZ(LIZIZ2));
            return false;
        }
    }

    public static <T> T LIZ(Class<T> cls) {
        if (!LIZLLL) {
            synchronized (X41.class) {
                if (!LIZLLL) {
                    if (LIZJ()) {
                        LIZLLL = true;
                    } else {
                        LIZIZ(IDownloadMonitorHelperService.class, new IDownloadMonitorHelperService.DefaultDownloadMonitorHelperService());
                        LIZIZ(IDownloadIdGeneratorService.class, new IDownloadIdGeneratorService.DefaultDownloadIdGeneratorService());
                        LIZIZ(IDownloadComponentManagerService.class, new IDownloadComponentManagerService.DefaultDownloadComponentManagerService());
                        LIZIZ(IDownloadProcessDispatcherService.class, new IDownloadProcessDispatcherService.DefaultDownloadProcessDispatcherService());
                        LIZIZ(IDownloadNetTrafficManagerService.class, new IDownloadNetTrafficManagerService.DefaultDownloadNetTrafficManagerService());
                        LIZIZ(IDownloadNotificationManagerService.class, new IDownloadNotificationManagerService.DefaultDownloadNotificationManagerService());
                        LIZIZ(IDownloadPreconnecterService.class, new IDownloadPreconnecterService.DefaultDownloadPreconnecterService());
                        LIZIZ(IDownloadRetrySchedulerService.class, new IDownloadRetrySchedulerService.DefaultDownloadRetrySchedulerService());
                        LIZIZ(IDownloadMultiProcService.class, new IDownloadMultiProcService.DefaultDownloadMultiProcService());
                        C65210PiY.LIZJ(LIZ, "loadDefaultService", "Run");
                        LIZLLL = true;
                    }
                }
            }
        }
        return (T) LIZIZ.get(cls);
    }

    public static <T> void LIZIZ(Class<T> cls, T t) {
        LIZIZ.put(cls, t);
    }
}
