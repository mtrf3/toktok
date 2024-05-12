package com.ss.android.socialbase.downloader.service;

import X.InterfaceC84194X2o;
import X.X4R;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public class DownloadMonitorHelperService implements IDownloadMonitorHelperService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        X4R.LJI(downloadTask, baseException, i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSendWithTaskMonitor(InterfaceC84194X2o interfaceC84194X2o, DownloadInfo downloadInfo, BaseException baseException, int i) {
        X4R.LJIIIIZZ(interfaceC84194X2o, downloadInfo, baseException, i);
    }
}
