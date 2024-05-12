package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* renamed from: X.FnU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40036FnU extends AbsDownloadListener {
    public final /* synthetic */ File LJLIL;

    public C40036FnU(File file) {
        this.LJLIL = file;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        C40035FnT.LIZIZ(this.LJLIL, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C40035FnT.LIZIZ(this.LJLIL, true);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download failed: ");
        if (baseException == null || (str = baseException.getErrorMessage()) == null) {
            str = "Unknown error.";
        }
        C13870gZ.LIZJ(LIZ, str, LIZ, 4, "LynxSettingsDownloader");
        super.onFailed(downloadInfo, baseException);
        C40035FnT.LIZIZ(this.LJLIL, false);
    }
}
