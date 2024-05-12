package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Ut1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78599Ut1 implements IDownloadListener {
    public final IDownloadListener LJLIL;
    public final InterfaceC78602Ut4 LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onCanceled(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstSuccess(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onPause(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onPrepare(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onProgress(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        InterfaceC78602Ut4 interfaceC78602Ut4 = this.LJLILLLLZI;
        if (interfaceC78602Ut4 != null) {
            interfaceC78602Ut4.LIZ(downloadInfo);
        }
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onSuccessed(downloadInfo);
        }
    }

    public C78599Ut1(IDownloadListener iDownloadListener, InterfaceC78602Ut4 interfaceC78602Ut4) {
        this.LJLIL = iDownloadListener;
        this.LJLILLLLZI = interfaceC78602Ut4;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onRetry(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.LJLIL;
        if (iDownloadListener != null) {
            iDownloadListener.onRetryDelay(downloadInfo, baseException);
        }
    }
}
