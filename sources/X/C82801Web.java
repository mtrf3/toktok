package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Web, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82801Web extends AbsDownloadListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C82800Wea.LIZJ(this.LJLIL, this.LJLILLLLZI, true, true, null);
    }

    public C82801Web(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        C82800Wea.LIZJ(this.LJLIL, this.LJLILLLLZI, true, false, "download failed");
    }
}
