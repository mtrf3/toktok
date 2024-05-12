package com.ss.android.socialbase.downloader.service;

import X.X46;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public interface IDownloadRetrySchedulerService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadRetrySchedulerService implements IDownloadRetrySchedulerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void doSchedulerRetry(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void scheduleRetryWhenHasTaskConnected() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void scheduleRetryWhenHasTaskSucceed() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void setRetryScheduleHandler(X46 x46) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void tryCancelScheduleRetry(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        }
    }

    void doSchedulerRetry(int i);

    void scheduleRetryWhenHasTaskConnected();

    void scheduleRetryWhenHasTaskSucceed();

    void setRetryScheduleHandler(X46 x46);

    void tryCancelScheduleRetry(int i);

    void tryStartScheduleRetry(DownloadInfo downloadInfo);
}
