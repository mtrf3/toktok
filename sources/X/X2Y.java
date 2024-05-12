package X;

import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X2Y extends X2K {
    public final /* synthetic */ IDownloadDepend LJLILLLLZI;

    public X2Y(IDownloadDepend iDownloadDepend) {
        this.LJLILLLLZI = iDownloadDepend;
    }

    @Override // X.X2Z
    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        this.LJLILLLLZI.monitorLogSend(downloadInfo, baseException, i);
    }
}
