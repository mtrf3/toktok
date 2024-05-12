package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes8.dex */
public final class GMT extends AbsDownloadListener {
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = GMQ.LJII;
        if (interfaceC88472Yns != null) {
            if (downloadInfo != null) {
                str = downloadInfo.getTargetFilePath();
            } else {
                str = null;
            }
            interfaceC88472Yns.invoke(str);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = GMQ.LJII;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke("");
        }
    }
}
