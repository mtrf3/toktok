package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.UnP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78251UnP implements IDownloadListener {
    public final /* synthetic */ InterfaceC78252UnQ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download canceled, entity: ");
        LIZ.append(downloadInfo);
        C221018lt.LIZ("ProfileAigcHelperUtil", X1D.LIZIZ(LIZ));
        this.LJLIL.LIZJ(this.LJLILLLLZI);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        this.LJLIL.LIZ(this.LJLILLLLZI);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download listener, onSuccessed, entity: ");
        LIZ.append(downloadInfo);
        C221018lt.LIZ("ProfileAigcHelperUtil", X1D.LIZIZ(LIZ));
        InterfaceC78252UnQ interfaceC78252UnQ = this.LJLIL;
        String str = this.LJLILLLLZI;
        C78250UnO c78250UnO = C78250UnO.LIZ;
        String str2 = this.LJLJI;
        Context context = this.LJLJJI;
        c78250UnO.getClass();
        interfaceC78252UnQ.LIZIZ(C78250UnO.LIZJ(context, str2), str);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed, entity: ");
        LIZ.append(downloadInfo);
        LIZ.append(", e: ");
        LIZ.append(baseException);
        C221018lt.LIZ("ProfileAigcHelperUtil", X1D.LIZIZ(LIZ));
        this.LJLIL.LIZJ(this.LJLILLLLZI);
    }

    public C78251UnP(InterfaceC78252UnQ interfaceC78252UnQ, String str, String str2, Context context) {
        this.LJLIL = interfaceC78252UnQ;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = context;
    }
}
