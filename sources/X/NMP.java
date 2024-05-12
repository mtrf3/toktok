package X;

import Y.ACallableS59S0300000_10;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;

/* loaded from: classes11.dex */
public final class NMP implements IDownloadListener {
    public final /* synthetic */ TopViewAdEventLogger LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        this.LJLIL.LJIILIIL(NMA.LJIIIIZZ);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download cancel");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        this.LJLIL.LJIILIIL(NMA.LJII);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first succeed");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download pause");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        this.LJLIL.LJIILIIL(NMA.LJFF);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download prepare");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        this.LJLIL.LJIILIIL(NMA.LJI);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        C10K.LIZJ(new ACallableS59S0300000_10(this.LJLILLLLZI, this.LJLIL, downloadInfo, 1));
    }

    public NMP(TopViewAdEventLogger topViewAdEventLogger, Aweme aweme) {
        this.LJLIL = topViewAdEventLogger;
        this.LJLILLLLZI = aweme;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(final DownloadInfo downloadInfo, BaseException baseException) {
        final int errorCode;
        final String errorMessage;
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download failed");
        if (baseException == null) {
            errorCode = 0;
            errorMessage = "";
        } else {
            errorCode = baseException.getErrorCode();
            errorMessage = baseException.getErrorMessage();
        }
        this.LJLIL.LJ(NMA.LIZLLL, new InterfaceC88472Yns() { // from class: X.NMG
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                DownloadInfo downloadInfo2 = DownloadInfo.this;
                int i = errorCode;
                String str = errorMessage;
                C58620MzY c58620MzY = (C58620MzY) obj;
                c58620MzY.LJIIJ(downloadInfo2);
                NMB.LIZ.getClass();
                c58620MzY.LJII(NMB.LJI, Integer.valueOf(i));
                c58620MzY.LJII(NMB.LJII, str);
                return null;
            }
        });
        if (errorCode == 1034) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(NPQ.LIZJ);
            LIZ.append(this.LJLILLLLZI.getAid());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (C55511LqV.LJ(this.LJLILLLLZI)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(NPQ.LIZJ);
                LIZ2.append(C55511LqV.LIZLLL(this.LJLILLLLZI.getAid()));
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            File file = new File(LIZIZ);
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
        }
        NPW.LIZ(this.LJLILLLLZI, Integer.valueOf(errorCode), errorMessage, downloadInfo.getUrl(), false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry delay");
    }
}
