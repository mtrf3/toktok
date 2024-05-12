package X;

import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* renamed from: X.X2y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC84204X2y<T extends DownloadService> {
    void LIZ();

    IBinder LIZIZ(Intent intent);

    void LIZJ();

    void LIZLLL(DownloadTask downloadTask);

    void LJ();

    void setLogLevel(int i);

    void tryDownload(DownloadTask downloadTask);
}
