package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Gk5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42373Gk5 extends AbsDownloadListener {
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        long j;
        super.onSuccessed(downloadInfo);
        H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl onSuccess");
        C6BK c6bk = new C6BK();
        if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
            str = "";
        }
        c6bk.LIZ.put("url", str);
        if (downloadInfo != null) {
            j = downloadInfo.getDownloadTime();
        } else {
            j = -1;
        }
        c6bk.LIZ.put("duration", Long.valueOf(j));
        c6bk.LIZ.put("type", "icon");
        C43882HKc.LIZLLL(0, "special_plus_download", c6bk.LJ(), true);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        long j;
        super.onFailed(downloadInfo, baseException);
        H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl onFail");
        C6BK c6bk = new C6BK();
        if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
            str = "";
        }
        c6bk.LIZ.put("url", str);
        if (downloadInfo != null) {
            j = downloadInfo.getDownloadTime();
        } else {
            j = -1;
        }
        c6bk.LIZ.put("duration", Long.valueOf(j));
        c6bk.LIZ.put("type", "icon");
        C43882HKc.LIZLLL(1, "special_plus_download", c6bk.LJ(), true);
    }
}
