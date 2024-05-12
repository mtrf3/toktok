package X;

import Y.ARunnableS11S1100000_10;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS46S0100000_10;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes11.dex */
public final class OWB extends AbsDownloadListener {
    public final /* synthetic */ OWC LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        long totalBytes = downloadInfo.getTotalBytes();
        if (totalBytes > 0) {
            C38816FLg.LIZJ(new ARunnableS14S0101000_10((int) ((((float) downloadInfo.getCurBytes()) / ((float) totalBytes)) * 100.0f), this.LJLIL, 3));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String targetFilePath;
        if (downloadInfo == null || (targetFilePath = downloadInfo.getTargetFilePath()) == null || targetFilePath.length() == 0) {
            OWC owc = this.LJLIL;
            C39579Fg7.LJIL(owc.LIZJ);
            C38816FLg.LIZJ(new ARunnableS46S0100000_10(owc, 104));
        } else {
            C39579Fg7.LIZLLL(targetFilePath, this.LJLILLLLZI);
            OWC owc2 = this.LJLIL;
            String str = this.LJLILLLLZI;
            C39579Fg7.LJIL(owc2.LIZJ);
            C38816FLg.LIZJ(new ARunnableS11S1100000_10(owc2, str, 7));
        }
    }

    public OWB(OWC owc, String str) {
        this.LJLIL = owc;
        this.LJLILLLLZI = str;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        OWC owc = this.LJLIL;
        C39579Fg7.LJIL(owc.LIZJ);
        C38816FLg.LIZJ(new ARunnableS46S0100000_10(owc, 104));
    }
}
