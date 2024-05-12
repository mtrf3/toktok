package com.ss.android.socialbase.downloader.service;

import X.C16880lQ;
import X.C65210PiY;
import X.X1D;
import X.X41;
import com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader;

/* loaded from: classes16.dex */
public class DownloadServiceLoader implements IDownloadServiceLoader {
    public static final String LIZ = C16880lQ.LJLLJ(DownloadServiceLoader.class);
    public static boolean LIZIZ = false;

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void load() {
        synchronized (X41.class) {
            if (LIZIZ) {
                return;
            }
            LIZIZ = true;
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZ, "load", "Load download service start");
            }
            X41.LIZIZ(IDownloadMonitorHelperService.class, new DownloadMonitorHelperService());
            X41.LIZIZ(IDownloadIdGeneratorService.class, new DownloadIdGeneratorService());
            X41.LIZIZ(IDownloadComponentManagerService.class, new DownloadComponentManagerService());
            X41.LIZIZ(IDownloadProcessDispatcherService.class, new DownloadProcessDispatcherService());
            X41.LIZIZ(IDownloadNetTrafficManagerService.class, new DownloadNetTrafficManagerService());
            X41.LIZIZ(IDownloadNotificationManagerService.class, new DownloadNotificationManagerService());
            X41.LIZIZ(IDownloadPreconnecterService.class, new DownloadPreconnecterService());
            X41.LIZIZ(IDownloadRetrySchedulerService.class, new DownloadRetrySchedulerService());
            X41.LIZIZ(IDownloadMultiProcService.class, new DownloadMultiProcService());
            X41.LIZLLL = true;
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZ, "load", "Load download service end");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void defaultLoadCallback(boolean z, String str) {
        if (C65210PiY.LIZ()) {
            String str2 = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Load status:");
            LIZ2.append(z);
            LIZ2.append(" errorMsg:");
            LIZ2.append(str);
            C65210PiY.LIZIZ(str2, "defaultLoadCallback", X1D.LIZIZ(LIZ2));
        }
    }
}
