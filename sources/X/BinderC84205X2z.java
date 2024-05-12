package X;

import Y.ARunnableS26S0300000_15;
import Y.ARunnableS34S0200000_15;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X2z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class BinderC84205X2z extends AbstractBinderC84192X2m {
    public final /* synthetic */ IDownloadListener LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.X32
    public final int LJLI() {
        return this.LJLILLLLZI.hashCode();
    }

    @Override // X.X32
    public final void LJJJJL(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LJLILLLLZI;
        if (iDownloadListener instanceof InterfaceC78603Ut5) {
            if (this.LJLJI) {
                X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 39));
            } else {
                ((InterfaceC78603Ut5) iDownloadListener).LJJJJL(downloadInfo);
            }
        }
    }

    @Override // X.X32
    public final void onCanceled(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 45));
        } else {
            this.LJLILLLLZI.onCanceled(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onFirstStart(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 46));
        } else {
            this.LJLILLLLZI.onFirstStart(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 47));
        } else {
            this.LJLILLLLZI.onFirstSuccess(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onPause(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 43));
        } else {
            this.LJLILLLLZI.onPause(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onPrepare(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 40));
        } else {
            this.LJLILLLLZI.onPrepare(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onProgress(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 42));
        } else {
            this.LJLILLLLZI.onProgress(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onStart(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 41));
        } else {
            this.LJLILLLLZI.onStart(downloadInfo);
        }
    }

    @Override // X.X32
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS34S0200000_15(downloadInfo, this, 44));
        } else {
            this.LJLILLLLZI.onSuccessed(downloadInfo);
        }
    }

    public BinderC84205X2z(IDownloadListener iDownloadListener, boolean z) {
        this.LJLILLLLZI = iDownloadListener;
        this.LJLJI = z;
    }

    @Override // X.X32
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS26S0300000_15(downloadInfo, baseException, this, 6));
        } else {
            this.LJLILLLLZI.onFailed(downloadInfo, baseException);
        }
    }

    @Override // X.X32
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS26S0300000_15(downloadInfo, baseException, this, 4));
        } else {
            this.LJLILLLLZI.onRetry(downloadInfo, baseException);
        }
    }

    @Override // X.X32
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LJLJI) {
            X30.LIZ.post(new ARunnableS26S0300000_15(downloadInfo, baseException, this, 5));
        } else {
            this.LJLILLLLZI.onRetryDelay(downloadInfo, baseException);
        }
    }
}
