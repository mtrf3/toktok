package com.ss.android.socialbase.downloader.service;

import X.C84212X3g;
import X.X46;
import X.X4J;
import X.X4K;
import Y.ARunnableS19S0101000_15;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class DownloadRetrySchedulerService implements IDownloadRetrySchedulerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void setRetryScheduleHandler(X46 x46) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void scheduleRetryWhenHasTaskConnected() {
        X4J.LIZJ().LJI(5, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void scheduleRetryWhenHasTaskSucceed() {
        X4J.LIZJ().LJI(2, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void doSchedulerRetry(int i) {
        X4J LIZJ = X4J.LIZJ();
        LIZJ.getClass();
        C84212X3g.LJFF().execute(new ARunnableS19S0101000_15(LIZJ, i, 0));
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void tryCancelScheduleRetry(int i) {
        X4J LIZJ = X4J.LIZJ();
        synchronized (LIZJ.LJLJI) {
            X4K x4k = LIZJ.LJLJI.get(i);
            if (x4k != null) {
                if (x4k.LJIIJJI) {
                    x4k.LJIIJJI = false;
                    int i2 = LIZJ.LJLJJLL - 1;
                    LIZJ.LJLJJLL = i2;
                    if (i2 < 0) {
                        LIZJ.LJLJJLL = 0;
                    }
                }
                if (x4k.LJFF) {
                    return;
                }
                LIZJ.LJLILLLLZI.removeMessages(i);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        boolean z;
        X4J LIZJ = X4J.LIZJ();
        LIZJ.getClass();
        if (downloadInfo == null || TextUtils.isEmpty("") || !"".equals(downloadInfo.getMimeType())) {
            return;
        }
        if (downloadInfo.isOnlyWifi() || downloadInfo.isPauseReserveOnWifi()) {
            z = true;
        } else {
            z = false;
        }
        LIZJ.LJII(downloadInfo, z, LIZJ.LIZLLL());
    }
}
