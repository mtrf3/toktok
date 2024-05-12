package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.io.File;
import ujb.o;

/* renamed from: X.Gkp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42419Gkp extends AbsDownloadListener {
    public final /* synthetic */ AbstractC42414Gkk LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        AbstractC42414Gkk abstractC42414Gkk;
        int i;
        super.onProgress(downloadInfo);
        AbstractC42414Gkk abstractC42414Gkk2 = this.LJLIL;
        if (abstractC42414Gkk2 != null) {
            if (downloadInfo != null) {
                i = downloadInfo.getDownloadProcess();
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            } else {
                i = 0;
            }
            abstractC42414Gkk2.LIZLLL(i);
        }
        if (C42431Gl1.LIZ() && C42423Gkt.LIZ() && (abstractC42414Gkk = this.LJLIL) != null && abstractC42414Gkk.LIZ()) {
            DownloadServiceManager.INSTANCE.getDownloadService().cancel(this.LJLILLLLZI.element);
            this.LJLIL.LIZJ(null, null, "download canceled by user");
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        AbstractC42414Gkk abstractC42414Gkk = this.LJLIL;
        if (abstractC42414Gkk != null) {
            abstractC42414Gkk.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        AbstractC42414Gkk abstractC42414Gkk = this.LJLIL;
        if (abstractC42414Gkk != null) {
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
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
            abstractC42414Gkk.LJ(str, str2);
        }
    }

    public C42419Gkp(AbstractC42414Gkk abstractC42414Gkk, C76732zl c76732zl) {
        this.LJLIL = abstractC42414Gkk;
        this.LJLILLLLZI = c76732zl;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        AbstractC42414Gkk abstractC42414Gkk = this.LJLIL;
        if (abstractC42414Gkk != null) {
            Integer num = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                str = null;
            }
            abstractC42414Gkk.LIZJ(baseException, num, str);
        }
    }
}
