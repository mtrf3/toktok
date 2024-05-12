package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService;

/* loaded from: classes16.dex */
public final class X47 implements IDownloadRetrySchedulerService {
    public static volatile X47 LIZIZ;
    public final IDownloadRetrySchedulerService LIZ = (IDownloadRetrySchedulerService) X41.LIZ(IDownloadRetrySchedulerService.class);

    public static X47 LIZ() {
        if (LIZIZ == null) {
            synchronized (X47.class) {
                if (LIZIZ == null) {
                    LIZIZ = new X47();
                }
            }
        }
        return LIZIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void scheduleRetryWhenHasTaskConnected() {
        this.LIZ.scheduleRetryWhenHasTaskConnected();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void scheduleRetryWhenHasTaskSucceed() {
        this.LIZ.scheduleRetryWhenHasTaskSucceed();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void doSchedulerRetry(int i) {
        this.LIZ.doSchedulerRetry(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void setRetryScheduleHandler(X46 x46) {
        this.LIZ.setRetryScheduleHandler(null);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void tryCancelScheduleRetry(int i) {
        this.LIZ.tryCancelScheduleRetry(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        this.LIZ.tryStartScheduleRetry(downloadInfo);
    }
}
