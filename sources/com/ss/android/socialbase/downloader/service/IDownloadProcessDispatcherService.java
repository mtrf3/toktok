package com.ss.android.socialbase.downloader.service;

import X.EnumC84256X4y;
import X.InterfaceC84186X2g;
import X.InterfaceC84187X2h;
import X.InterfaceC84218X3m;
import X.X2C;
import X.X35;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes16.dex */
public interface IDownloadProcessDispatcherService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadProcessDispatcherService implements IDownloadProcessDispatcherService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean canResume(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void cancel(int i, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void clearDownloadData(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void clearDownloadData(int i, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void forceDownloadIngoreRecommendSize(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getAllDownloadInfo() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public long getCurBytes(int i) {
            return 0L;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public X2C getDownloadFileUriProvider(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public int getDownloadId(String str, String str2) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public DownloadInfo getDownloadInfo(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public DownloadInfo getDownloadInfo(String str, String str2) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadInfoList(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public InterfaceC84187X2h getDownloadNotificationEventListener(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public InterfaceC84186X2g getNotificationClickCallback(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public int getStatus(int i) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadCacheSyncSuccess() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadServiceForeground(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloading(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isHttpServiceInit() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void pause(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void pauseAll() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void registerDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void registerDownloaderProcessConnectedListener(X35 x35) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeTaskNotificationListener(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeTaskSubListener(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restart(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restartAllFailedDownloadTasks(List<String> list) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void resume(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setLogLevel(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setThrottleNetSpeed(int i, long j, int i2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void tryDownload(DownloadTask downloadTask) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void unRegisterDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void unRegisterDownloaderProcessConnectedListener(X35 x35) {
        }
    }

    void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z);

    void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2);

    void addNotificationListener(int i, IDownloadListener iDownloadListener);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearDownloadData(int i);

    void clearDownloadData(int i, boolean z);

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    X2C getDownloadFileUriProvider(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    InterfaceC84187X2h getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    InterfaceC84186X2g getNotificationClickCallback(int i);

    int getStatus(int i);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean isDownloadServiceForeground(int i);

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo);

    boolean isDownloading(int i);

    boolean isHttpServiceInit();

    void pause(int i);

    void pauseAll();

    void registerDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m);

    void registerDownloaderProcessConnectedListener(X35 x35);

    void removeDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z);

    void removeNotificationListener(int i, IDownloadListener iDownloadListener);

    void removeSubThreadListener(int i, IDownloadListener iDownloadListener);

    void removeTaskNotificationListener(int i);

    void removeTaskSubListener(int i);

    void restart(int i);

    void restartAllFailedDownloadTasks(List<String> list);

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list);

    void resume(int i);

    void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h);

    void setLogLevel(int i);

    void setNotificationListener(int i, IDownloadListener iDownloadListener);

    void setThrottleNetSpeed(int i, long j, int i2);

    void tryDownload(DownloadTask downloadTask);

    void unRegisterDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m);

    void unRegisterDownloaderProcessConnectedListener(X35 x35);
}
