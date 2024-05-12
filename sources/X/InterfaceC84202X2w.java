package X;

import android.app.Notification;
import android.os.IInterface;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: X.X2w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC84202X2w extends IInterface {
    boolean LJIIL(int i);

    void LJIILIIL(int i);

    boolean LJIILJJIL(int i);

    void LJJIFFI(int i, boolean z, boolean z2);

    void LJJIIJZLJL(boolean z);

    boolean LJJIJLIJ();

    void LJJJI(int i, boolean z);

    int LJJJJ(int i);

    void LJJJJIZL(int i, boolean z);

    void LJJLIIIJJI(int i, Notification notification);

    void LJJLIIIJLLLLLLLZ(int i, int i2);

    void LLILLL(InterfaceC84160X1g interfaceC84160X1g);

    void LLJJL(int i, int i2, X32 x32, int i3, boolean z);

    void LLLF(int i, X2X x2x);

    void LLLJ(InterfaceC84198X2s interfaceC84198X2s);

    void LLLLIILL(int i, int i2, X32 x32, int i3, boolean z, boolean z2);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearData();

    void d0(int i, int i2, X32 x32, int i3, boolean z);

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    X29 getDownloadFileUriProvider(int i);

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    X2X getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    X2W getNotificationClickCallback(int i);

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

    void setLogLevel(int i);

    void setThrottleNetSpeed(int i, long j, int i2);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
