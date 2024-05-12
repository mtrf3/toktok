package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.DownloadAwemeVideoServiceImpl;
import java.io.File;
import ujb.o;

/* renamed from: X.Gkb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42405Gkb extends AbsDownloadListener {
    public final /* synthetic */ AbstractC42411Gkh LJLIL;
    public final /* synthetic */ DownloadAwemeVideoServiceImpl LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        int i;
        long j;
        long j2;
        super.onProgress(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = this.LJLIL;
        if (abstractC42411Gkh != null) {
            if (downloadInfo != null) {
                i = downloadInfo.getDownloadProcess();
                j = downloadInfo.getCurBytes();
                j2 = downloadInfo.getTotalBytes();
            } else {
                i = 0;
                j = 0;
                j2 = 100;
            }
            abstractC42411Gkh.LIZJ(i, j, j2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = this.LJLIL;
        if (abstractC42411Gkh != null) {
            abstractC42411Gkh.LIZLLL();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = this.LJLIL;
        if (abstractC42411Gkh != null) {
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            this.LJLILLLLZI.getClass();
            if (downloadInfo != null) {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && o.LJJJJ(savePath, "/", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(downloadInfo.getSavePath());
                    LIZ.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(downloadInfo.getSavePath());
                    LIZ2.append(File.separator);
                    LIZ2.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ2);
                }
            }
            abstractC42411Gkh.LJ(str, str2);
        }
    }

    public C42405Gkb(AbstractC42411Gkh abstractC42411Gkh, DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl) {
        this.LJLIL = abstractC42411Gkh;
        this.LJLILLLLZI = downloadAwemeVideoServiceImpl;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        AbstractC42411Gkh abstractC42411Gkh = this.LJLIL;
        if (abstractC42411Gkh != null) {
            Integer num = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                str = null;
            }
            abstractC42411Gkh.LIZIZ(baseException, num, str);
        }
    }
}
