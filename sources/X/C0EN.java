package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.0EN, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0EN {
    void LIZ(DownloadInfo downloadInfo);

    void onFailed(DownloadInfo downloadInfo, BaseException baseException);

    void onPause(DownloadInfo downloadInfo);

    void onProgress(DownloadInfo downloadInfo);
}
