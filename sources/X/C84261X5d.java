package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import java.io.File;
import java.util.List;

/* renamed from: X.X5d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84261X5d {
    public String globalDefaultSavePath;
    public String globalDefaultSaveTempPath;
    public IDownloadProcessDispatcherService dispatcherService = (IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class);
    public IDownloadComponentManagerService componentService = (IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class);

    public void clearSqlDownloadCacheData() {
        this.componentService.clearSqlDownloadCacheData();
    }

    public void destoryDownloader() {
        this.componentService.unRegisterDownloadReceiver();
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        return this.dispatcherService.getAllDownloadInfo();
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath);
    }

    public X3A getReserveWifiStatusListener() {
        this.componentService.getReserveWifiStatusListener();
        return null;
    }

    public void initDownloadCacheImmediately() {
        this.componentService.initDownloadCacheImmediately();
    }

    public boolean isDownloadCacheSyncSuccess() {
        return this.dispatcherService.isDownloadCacheSyncSuccess();
    }

    public boolean isHttpServiceInit() {
        return this.dispatcherService.isHttpServiceInit();
    }

    public void pauseAll() {
        this.dispatcherService.pauseAll();
    }

    public void setDownloadInMultiProcess() {
        this.componentService.setDownloadInMultiProcess();
    }

    private File getGlobalSaveDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!C84246X4o.LIZJ(file)) {
            return null;
        }
        return file;
    }

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    public boolean canResume(int i) {
        return this.dispatcherService.canResume(i);
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public void clearDownloadData(int i) {
        this.dispatcherService.clearDownloadData(i, true);
    }

    public void clearMemoryCacheData(double d) {
        this.componentService.clearMemoryCacheData(d);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        this.dispatcherService.forceDownloadIngoreRecommendSize(i);
    }

    public long getCurBytes(int i) {
        return this.dispatcherService.getCurBytes(i);
    }

    public X2C getDownloadFileUriProvider(int i) {
        return this.dispatcherService.getDownloadFileUriProvider(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        return this.dispatcherService.getDownloadInfo(i);
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        return this.dispatcherService.getDownloadInfoList(str);
    }

    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.dispatcherService.getDownloadInfosByFileExtension(str);
    }

    public InterfaceC84187X2h getDownloadNotificationEventListener(int i) {
        return this.dispatcherService.getDownloadNotificationEventListener(i);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getDownloadingDownloadInfosWithMimeType(str);
    }

    public int getStatus(int i) {
        return this.dispatcherService.getStatus(i);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getSuccessedDownloadInfosWithMimeType(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getUnCompletedDownloadInfosWithMimeType(str);
    }

    public boolean isDownloadServiceForeground(int i) {
        return this.dispatcherService.isDownloadServiceForeground(i);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return this.dispatcherService.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    public boolean isDownloading(int i) {
        return this.dispatcherService.isDownloading(i);
    }

    public void pause(int i) {
        this.dispatcherService.pause(i);
    }

    public void registerDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        this.dispatcherService.registerDownloadCacheSyncListener(interfaceC84218X3m);
    }

    public void registerDownloaderProcessConnectedListener(X35 x35) {
        this.dispatcherService.registerDownloaderProcessConnectedListener(x35);
    }

    public void removeTaskMainListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, EnumC84256X4y.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, EnumC84256X4y.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, EnumC84256X4y.SUB, true);
    }

    public void restart(int i) {
        this.dispatcherService.restart(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllFailedDownloadTasks(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    public void resume(int i) {
        this.dispatcherService.resume(i);
    }

    public void setDefaultSavePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSavePath = str;
        }
    }

    public void setDefaultSaveTempPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSaveTempPath = str;
        }
    }

    public void setDownloadDBListener(InterfaceC84209X3d interfaceC84209X3d) {
        this.componentService.setDownloadDBListener(interfaceC84209X3d);
    }

    public void setDownloadMemoryInfoListener(InterfaceC84210X3e interfaceC84210X3e) {
        this.componentService.setDownloadMemoryInfoListener(interfaceC84210X3e);
    }

    public void setDownloadThreadCheckListener(InterfaceC84208X3c interfaceC84208X3c) {
        this.componentService.setDownloadThreadCheckListener(interfaceC84208X3c);
    }

    public void setLogLevel(int i) {
        this.dispatcherService.setLogLevel(i);
    }

    public void setReserveWifiStatusListener(X3A x3a) {
        this.componentService.setReserveWifiStatusListener(x3a);
    }

    public void unRegisterDownloadCacheSyncListener(InterfaceC84218X3m interfaceC84218X3m) {
        this.dispatcherService.unRegisterDownloadCacheSyncListener(interfaceC84218X3m);
    }

    public void unRegisterDownloaderProcessConnectedListener(X35 x35) {
        this.dispatcherService.unRegisterDownloaderProcessConnectedListener(x35);
    }

    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        this.componentService.updateDownloadInfo(downloadInfo);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.MAIN, false);
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.NOTIFICATION, false);
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.SUB, false);
    }

    public void cancel(int i, boolean z) {
        this.dispatcherService.cancel(i, z);
    }

    public void clearDownloadData(int i, boolean z) {
        this.dispatcherService.clearDownloadData(i, z);
    }

    public int getDownloadId(String str, String str2) {
        return this.dispatcherService.getDownloadId(str, str2);
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return this.dispatcherService.getDownloadInfo(str, str2);
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, EnumC84256X4y.MAIN, false);
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, EnumC84256X4y.NOTIFICATION, false);
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, EnumC84256X4y.SUB, false);
    }

    public void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h) {
        this.dispatcherService.setDownloadNotificationEventListener(i, interfaceC84187X2h);
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.MAIN, true);
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.NOTIFICATION, true);
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.SUB, true);
    }

    public void setThrottleNetSpeed(int i, long j) {
        setThrottleNetSpeed(i, j, 0);
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, EnumC84256X4y.MAIN, true, z);
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        this.dispatcherService.setThrottleNetSpeed(i, j, i2);
    }
}
