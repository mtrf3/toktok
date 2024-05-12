package com.ss.android.socialbase.downloader.downloader;

import X.C84213X3h;
import X.C84261X5d;
import X.InterfaceC84187X2h;
import X.InterfaceC84208X3c;
import X.InterfaceC84209X3d;
import X.InterfaceC84210X3e;
import X.InterfaceC84218X3m;
import X.X2C;
import X.X35;
import X.X3A;
import X.X41;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.util.List;

/* loaded from: classes16.dex */
public class Downloader extends C84261X5d {
    public static volatile Downloader instance;

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getAllDownloadInfo() {
        return super.getAllDownloadInfo();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ File getGlobalSaveDir() {
        return super.getGlobalSaveDir();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ File getGlobalSaveTempDir() {
        return super.getGlobalSaveTempDir();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ X3A getReserveWifiStatusListener() {
        super.getReserveWifiStatusListener();
        return null;
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean isDownloadCacheSyncSuccess() {
        return super.isDownloadCacheSyncSuccess();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean isHttpServiceInit() {
        return super.isHttpServiceInit();
    }

    public Downloader() {
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void clearSqlDownloadCacheData() {
        super.clearSqlDownloadCacheData();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void destoryDownloader() {
        super.destoryDownloader();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void initDownloadCacheImmediately() {
        super.initDownloadCacheImmediately();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void pauseAll() {
        super.pauseAll();
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDownloadInMultiProcess() {
        super.setDownloadInMultiProcess();
    }

    public Downloader(C84213X3h c84213X3h) {
        ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).initComponent(c84213X3h);
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).setAppContext(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static void init(C84213X3h c84213X3h) {
        initOrCover(c84213X3h, false);
    }

    public static void loadService(IDownloadServiceLoader iDownloadServiceLoader) {
        boolean z;
        if (iDownloadServiceLoader != null) {
            iDownloadServiceLoader.load();
            String str = X41.LIZJ;
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            iDownloadServiceLoader.defaultLoadCallback(z, str);
        }
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean canResume(int i) {
        return super.canResume(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void cancel(int i) {
        super.cancel(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void clearDownloadData(int i) {
        super.clearDownloadData(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void clearMemoryCacheData(double d) {
        super.clearMemoryCacheData(d);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void forceDownloadIngoreRecommendSize(int i) {
        super.forceDownloadIngoreRecommendSize(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ long getCurBytes(int i) {
        return super.getCurBytes(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ X2C getDownloadFileUriProvider(int i) {
        return super.getDownloadFileUriProvider(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(int i) {
        return super.getDownloadInfo(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getDownloadInfoList(String str) {
        return super.getDownloadInfoList(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getDownloadInfosByFileExtension(String str) {
        return super.getDownloadInfosByFileExtension(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ InterfaceC84187X2h getDownloadNotificationEventListener(int i) {
        return super.getDownloadNotificationEventListener(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getDownloadingDownloadInfosWithMimeType(String str) {
        return super.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ int getStatus(int i) {
        return super.getStatus(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getSuccessedDownloadInfosWithMimeType(String str) {
        return super.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ List getUnCompletedDownloadInfosWithMimeType(String str) {
        return super.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean isDownloadServiceForeground(int i) {
        return super.isDownloadServiceForeground(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return super.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ boolean isDownloading(int i) {
        return super.isDownloading(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void pause(int i) {
        super.pause(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void registerDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        super.registerDownloadCacheSyncListener(interfaceC84218X3m);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void registerDownloaderProcessConnectedListener(X35 x35) {
        super.registerDownloaderProcessConnectedListener(x35);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeTaskMainListener(int i) {
        super.removeTaskMainListener(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeTaskNotificationListener(int i) {
        super.removeTaskNotificationListener(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeTaskSubListener(int i) {
        super.removeTaskSubListener(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void restart(int i) {
        super.restart(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void restartAllFailedDownloadTasks(List list) {
        super.restartAllFailedDownloadTasks(list);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void restartAllPauseReserveOnWifiDownloadTasks(List list) {
        super.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void resume(int i) {
        super.resume(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDefaultSavePath(String str) {
        super.setDefaultSavePath(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDefaultSaveTempPath(String str) {
        super.setDefaultSaveTempPath(str);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDownloadDBListener(InterfaceC84209X3d interfaceC84209X3d) {
        super.setDownloadDBListener(interfaceC84209X3d);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDownloadMemoryInfoListener(InterfaceC84210X3e interfaceC84210X3e) {
        super.setDownloadMemoryInfoListener(interfaceC84210X3e);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDownloadThreadCheckListener(InterfaceC84208X3c interfaceC84208X3c) {
        super.setDownloadThreadCheckListener(interfaceC84208X3c);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setLogLevel(int i) {
        super.setLogLevel(i);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setReserveWifiStatusListener(X3A x3a) {
        super.setReserveWifiStatusListener(x3a);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void unRegisterDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        super.unRegisterDownloadCacheSyncListener(interfaceC84218X3m);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void unRegisterDownloaderProcessConnectedListener(X35 x35) {
        super.unRegisterDownloaderProcessConnectedListener(x35);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void updateDownloadInfo(DownloadInfo downloadInfo) {
        super.updateDownloadInfo(downloadInfo);
    }

    public static synchronized void initOrCover(C84213X3h c84213X3h, boolean z) {
        synchronized (Downloader.class) {
            if (c84213X3h == null) {
                return;
            }
            if (instance == null) {
                instance = new Downloader(c84213X3h);
                return;
            }
            IDownloadComponentManagerService iDownloadComponentManagerService = (IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class);
            if (!iDownloadComponentManagerService.isInit()) {
                iDownloadComponentManagerService.initComponent(c84213X3h);
            } else if (z) {
                iDownloadComponentManagerService.coverComponent(c84213X3h);
            }
        }
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.addNotificationListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void cancel(int i, boolean z) {
        super.cancel(i, z);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void clearDownloadData(int i, boolean z) {
        super.clearDownloadData(i, z);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ int getDownloadId(String str, String str2) {
        return super.getDownloadId(str, str2);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(String str, String str2) {
        return super.getDownloadInfo(str, str2);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.removeNotificationListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h) {
        super.setDownloadNotificationEventListener(i, interfaceC84187X2h);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.setNotificationListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i, long j) {
        super.setThrottleNetSpeed(i, j);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        super.setMainThreadListener(i, iDownloadListener, z);
    }

    @Override // X.C84261X5d
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i, long j, int i2) {
        super.setThrottleNetSpeed(i, j, i2);
    }
}
