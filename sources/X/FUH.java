package X;

import Y.ARunnableS2S1201000_6;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.tools.cutsamemv.CutSameSdkDownloadService;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FUH extends AbsDownloadListener {
    public final /* synthetic */ CutSameSdkDownloadService LJLIL;
    public final /* synthetic */ FL6 LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            CutSameSdkDownloadService cutSameSdkDownloadService = this.LJLIL;
            FL6 fl6 = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CutSameSdkDownload, success : downloadId=");
            LIZ.append(cutSameSdkDownloadService.LJLJJI.remove(downloadInfo.getUrl()));
            LIZ.append(", url=");
            LIZ.append(downloadInfo.getUrl());
            LIZ.append(", path=");
            LIZ.append(downloadInfo.getTargetFilePath());
            H7B.LJ(X1D.LIZIZ(LIZ));
            String url = downloadInfo.getUrl();
            o.LJIIIIZZ(url, "this.url");
            String targetFilePath = downloadInfo.getTargetFilePath();
            o.LJIIIIZZ(targetFilePath, "this.targetFilePath");
            fl6.LIZ(url, targetFilePath);
        }
    }

    public FUH(CutSameSdkDownloadService cutSameSdkDownloadService, FL6 fl6) {
        this.LJLIL = cutSameSdkDownloadService;
        this.LJLILLLLZI = fl6;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        if (downloadInfo != null) {
            CutSameSdkDownloadService cutSameSdkDownloadService = this.LJLIL;
            FL6 fl6 = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CutSameSdkDownload, failed : downloadId=");
            LIZ.append(cutSameSdkDownloadService.LJLJJI.remove(downloadInfo.getUrl()));
            LIZ.append(", url=");
            LIZ.append(downloadInfo.getUrl());
            LIZ.append(", path=");
            LIZ.append(downloadInfo.getTargetFilePath());
            H7B.LIZJ(X1D.LIZIZ(LIZ));
            String url = downloadInfo.getUrl();
            o.LJIIIIZZ(url, "this.url");
            if (baseException != null) {
                i = baseException.getErrorCode();
            } else {
                i = -1;
            }
            fl6.getClass();
            if (!o.LJ(url, fl6.LIZ)) {
                return;
            }
            AbsDownloadService absDownloadService = fl6.LIZLLL;
            absDownloadService.LJLIL.post(new ARunnableS2S1201000_6(i, url, fl6, absDownloadService, 0));
        }
    }
}
