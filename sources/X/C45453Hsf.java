package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Hsf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45453Hsf extends AbsDownloadListener {
    public long LJLIL;
    public final /* synthetic */ AbstractC38911fr LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null && this.LJLILLLLZI != null) {
            new C45454Hsg(this.LJLJI, this.LJLJJI);
            downloadInfo.getDownloadProcess();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.LJLIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        AbstractC38911fr abstractC38911fr = this.LJLILLLLZI;
        if (abstractC38911fr != null) {
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = this.LJLJI;
            }
            abstractC38911fr.LJJII(System.currentTimeMillis() - this.LJLIL, str);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        long currentTimeMillis;
        Integer num;
        super.onFailed(downloadInfo, baseException);
        AbstractC38911fr abstractC38911fr = this.LJLILLLLZI;
        if (abstractC38911fr != null) {
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = this.LJLJI;
            }
            if (this.LJLIL == 0) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            }
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            abstractC38911fr.LJJIFFI(str, currentTimeMillis, baseException, num);
        }
    }

    public C45453Hsf(I1Z i1z, String str, String str2) {
        this.LJLILLLLZI = i1z;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
