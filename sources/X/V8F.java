package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes14.dex */
public abstract class V8F extends AbsDownloadListener {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ V8F(int i) {
        this.LJLIL = i;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        switch (this.LJLIL) {
            case 0:
                super.onCanceled(downloadInfo);
                if (downloadInfo != null) {
                    Downloader.getInstance(C6PB.LIZ()).removeMainThreadListener(downloadInfo.getId(), this);
                    return;
                }
                return;
            default:
                super.onCanceled(downloadInfo);
                return;
        }
    }
}
