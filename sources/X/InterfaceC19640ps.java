package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.0ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC19640ps {
    void LIZ();

    void LIZIZ(DownloadInfo downloadInfo);

    void onFailed(DownloadInfo downloadInfo, BaseException baseException);

    void onProgress(DownloadInfo downloadInfo);
}
