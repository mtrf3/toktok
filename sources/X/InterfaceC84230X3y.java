package X;

import android.os.IInterface;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: X.X3y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC84230X3y extends IInterface {
    boolean LJIIL(int i);

    void LJIILIIL(int i);

    boolean LJIILJJIL(int i);

    void LJIJ(DownloadInfo downloadInfo);

    DownloadInfo LJIL(int i, String str, String str2, long j);

    DownloadInfo LJJI(int i);

    DownloadInfo LJJIJIIJI(int i);

    DownloadInfo LJJIJIL(int i, long j);

    DownloadInfo LJJIL(int i);

    DownloadInfo LJJJJLI(int i, long j);

    DownloadInfo LJJJLZIJ(int i, long j);

    DownloadInfo LJJLI(int i, long j);

    boolean LJJLIIIIJ();

    DownloadInfo LJJLIIIJJIZ(int i);

    void LLIIIJ(boolean z);

    void clearData();

    List<DownloadInfo> getAllDownloadInfo();

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    void q0(InterfaceC84190X2k interfaceC84190X2k);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
