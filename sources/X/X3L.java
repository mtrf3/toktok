package X;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes16.dex */
public interface X3L {
    void LIZ();

    void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z);

    boolean LIZJ();

    void LIZLLL(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2);

    void LJ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z);

    boolean LJIIL(int i);

    void LJIILIIL(int i);

    boolean LJIILJJIL(int i);

    void LJIJ(DownloadInfo downloadInfo);

    void LJJIFFI(int i, boolean z, boolean z2);

    void LJJIIJZLJL(boolean z);

    boolean LJJIJLIJ();

    void LJJJI(int i, boolean z);

    int LJJJJ(int i);

    void LJJJJIZL(int i, boolean z);

    void LJJLIIIJJI(int i, Notification notification);

    void LJJLIIIJLLLLLLLZ(int i, int i2);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearData();

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    X2C getDownloadFileUriProvider(int i);

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    InterfaceC84187X2h getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    InterfaceC84186X2g getNotificationClickCallback(int i);

    int getStatus(int i);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo);

    boolean isDownloading(int i);

    void pauseAll();

    void restart(int i);

    void restartAllFailedDownloadTasks(List<String> list);

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list);

    void resume(int i);

    void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h);

    void setLogLevel(int i);

    void setThrottleNetSpeed(int i, long j, int i2);

    void tryDownload(DownloadTask downloadTask);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
