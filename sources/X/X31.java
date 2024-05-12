package X;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X31 implements InterfaceC78603Ut5 {
    public final /* synthetic */ X32 LJLIL;

    public X31(X32 x32) {
        this.LJLIL = x32;
    }

    @Override // X.InterfaceC78603Ut5
    public final void LJJJJL(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.LJJJJL(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onCanceled(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onFirstStart(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onFirstSuccess(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onPause(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onPrepare(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onProgress(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onStart(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        try {
            this.LJLIL.onSuccessed(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        try {
            this.LJLIL.onFailed(downloadInfo, baseException);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        try {
            this.LJLIL.onRetry(downloadInfo, baseException);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        try {
            this.LJLIL.onRetryDelay(downloadInfo, baseException);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
