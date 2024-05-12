package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;

/* renamed from: X.HnF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45117HnF extends AbsDownloadListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C45116HnE LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        K k = this.LJLILLLLZI.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC45118HnG) k).onGetMusicFailed(new Exception("cancelled"), "task is cancelled");
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C45116HnE c45116HnE = this.LJLILLLLZI;
        K k = c45116HnE.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC45118HnG) k).onGetMusicSuccess((MusicList) c45116HnE.LJLIL.getData(), this.LJLIL);
        }
    }

    public C45117HnF(C45116HnE c45116HnE, String str) {
        this.LJLILLLLZI = c45116HnE;
        this.LJLIL = str;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        K k = this.LJLILLLLZI.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC45118HnG) k).onGetMusicFailed(new Exception(baseException.getMessage()), baseException.getMessage());
        }
    }
}
