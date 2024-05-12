package com.ss.android.socialbase.downloader.service;

import X.InterfaceC84194X2o;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public interface IDownloadMonitorHelperService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadMonitorHelperService implements IDownloadMonitorHelperService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSendWithTaskMonitor(InterfaceC84194X2o interfaceC84194X2o, DownloadInfo downloadInfo, BaseException baseException, int i) {
        }
    }

    void monitorSend(DownloadTask downloadTask, BaseException baseException, int i);

    void monitorSendWithTaskMonitor(InterfaceC84194X2o interfaceC84194X2o, DownloadInfo downloadInfo, BaseException baseException, int i);
}
