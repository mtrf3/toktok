package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.O3z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61299O3z extends AbsDownloadListener {
    public final /* synthetic */ C61295O3v LJLIL;
    public final /* synthetic */ File LJLILLLLZI;
    public final /* synthetic */ C61296O3w LJLJI;
    public final /* synthetic */ CountDownLatch LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    public final void LJ(Integer num) {
        if (num == null) {
            return;
        }
        Downloader.getInstance(this.LJLJJLL).removeSubThreadListener(num.intValue(), this);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        Integer num;
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        } else {
            num = null;
        }
        LJ(num);
        C61296O3w c61296O3w = this.LJLJI;
        c61296O3w.getClass();
        c61296O3w.LIZ = O4F.CANCEL;
        c61296O3w.LIZ();
        c61296O3w.LJIIJJI = null;
        this.LJLJJI.countDown();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        this.LJLJI.LJIIL.LJLJI = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downloader paused, url: ");
        LIZ.append(this.LJLJJL);
        C39930Flm.LIZ("res-DownloaderDepend", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.LJLIL.W(null, "cdn_download_internal_start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        Integer num = null;
        if (C61297O3x.LJ(this.LJLIL, this.LJLILLLLZI)) {
            this.LJLIL.W(null, "cdn_download_finish");
            if (downloadInfo != null) {
                num = Integer.valueOf(downloadInfo.getId());
            }
            LJ(num);
            C61297O3x.LIZLLL(this.LJLIL, this.LJLJI, downloadInfo);
            this.LJLJJI.countDown();
            return;
        }
        this.LJLJI.LIZIZ(new O4H(6, "fetch succeeded but file not exists"));
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        }
        LJ(num);
        this.LJLJJI.countDown();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        java.util.Map<String, String> map;
        O4H o4h;
        super.onFailed(downloadInfo, baseException);
        if (baseException != null) {
            this.LJLIL.LL.LIZLLL = baseException.getErrorCode();
            if (baseException instanceof DownloadHttpException) {
                this.LJLIL.LL.LJ = ((DownloadHttpException) baseException).getHttpStatusCode();
            }
            C61287O3n c61287O3n = this.LJLIL.LL;
            String errorMessage = baseException.getErrorMessage();
            o.LJFF(errorMessage, "errorMessage");
            c61287O3n.getClass();
            c61287O3n.LJIIJ = errorMessage;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed, httpHeaders:");
        Integer num = null;
        if (downloadInfo != null) {
            map = downloadInfo.getHttpHeaders();
        } else {
            map = null;
        }
        LIZ.append(map);
        OC6.LIZJ("res-DownloaderDepend", X1D.LIZIZ(LIZ), baseException);
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        }
        LJ(num);
        C61296O3w c61296O3w = this.LJLJI;
        if (baseException != null) {
            int errorCode = baseException.getErrorCode();
            String errorMessage2 = baseException.getErrorMessage();
            o.LJFF(errorMessage2, "e.errorMessage");
            o4h = new O4H(errorCode, errorMessage2);
        } else {
            o4h = new O4H(3, "download failed");
        }
        c61296O3w.LIZIZ(o4h);
        this.LJLJJI.countDown();
    }

    public C61299O3z(C61295O3v c61295O3v, File file, C61296O3w c61296O3w, CountDownLatch countDownLatch, String str, Context context) {
        this.LJLIL = c61295O3v;
        this.LJLILLLLZI = file;
        this.LJLJI = c61296O3w;
        this.LJLJJI = countDownLatch;
        this.LJLJJL = str;
        this.LJLJJLL = context;
    }
}
