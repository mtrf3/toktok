package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Gf7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42065Gf7 extends AbsDownloadListener {
    public final /* synthetic */ InterfaceC42064Gf6 LJLIL;
    public final /* synthetic */ C68322mC<android.net.Uri> LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        InterfaceC42064Gf6 interfaceC42064Gf6 = this.LJLIL;
        if (interfaceC42064Gf6 != null) {
            new RuntimeException("Download is canceled");
            interfaceC42064Gf6.onFailure();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC42064Gf6 interfaceC42064Gf6 = this.LJLIL;
            downloadInfo.getCurBytes();
            downloadInfo.getTotalBytes();
            if (interfaceC42064Gf6 != null) {
                interfaceC42064Gf6.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        InterfaceC42064Gf6 interfaceC42064Gf6 = this.LJLIL;
        if (interfaceC42064Gf6 != null) {
            interfaceC42064Gf6.LIZ(this.LJLILLLLZI.element);
        }
    }

    public C42065Gf7(C41273GHt c41273GHt, C68322mC c68322mC) {
        this.LJLIL = c41273GHt;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        InterfaceC42064Gf6 interfaceC42064Gf6 = this.LJLIL;
        if (interfaceC42064Gf6 != null) {
            interfaceC42064Gf6.onFailure();
        }
    }
}
