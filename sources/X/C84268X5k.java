package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.X5k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84268X5k extends AbstractC84266X5i {
    public final /* synthetic */ C84270X5m LJLIL;

    public C84268X5k(C84270X5m c84270X5m) {
        this.LJLIL = c84270X5m;
    }

    @Override // X.AbstractC84266X5i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        this.LJLIL.getClass();
        CountDownLatch countDownLatch = this.LJLIL.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84270X5m c84270X5m = this.LJLIL;
        C84276X5s c84276X5s = c84270X5m.LJFF;
        if (c84276X5s != null) {
            c84276X5s.LIZIZ(c84270X5m.LIZ, c84270X5m);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        CountDownLatch countDownLatch = this.LJLIL.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C84270X5m c84270X5m = this.LJLIL;
        C84276X5s c84276X5s = c84270X5m.LJFF;
        if (c84276X5s != null) {
            c84276X5s.LIZ(c84270X5m.LIZ, c84270X5m);
        }
        this.LJLIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat start time: ");
        LIZ.append(System.currentTimeMillis());
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC84266X5i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        Long l;
        super.onSuccessed(downloadInfo);
        this.LJLIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat success time: ");
        LIZ.append(System.currentTimeMillis());
        LIZ.append(" duration: ");
        if (downloadInfo != null) {
            l = Long.valueOf(downloadInfo.getDownloadTime());
        } else {
            l = null;
        }
        LIZ.append(l);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        CountDownLatch countDownLatch = this.LJLIL.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84270X5m c84270X5m = this.LJLIL;
        C84276X5s c84276X5s = c84270X5m.LJFF;
        if (c84276X5s != null) {
            c84276X5s.LIZIZ(c84270X5m.LIZ, c84270X5m);
        }
    }

    @Override // X.AbstractC84266X5i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        this.LJLIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat beat url fail, cur url: ");
        Integer num = null;
        if (downloadInfo != null) {
            str = downloadInfo.getConnectionUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",retry url index: ");
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
        }
        LIZ.append(num);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        CountDownLatch countDownLatch = this.LJLIL.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84270X5m c84270X5m = this.LJLIL;
        C84276X5s c84276X5s = c84270X5m.LJFF;
        if (c84276X5s != null) {
            c84276X5s.LIZIZ(c84270X5m.LIZ, c84270X5m);
        }
    }
}
