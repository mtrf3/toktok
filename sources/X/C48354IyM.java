package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.IyM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48354IyM extends AbsDownloadListener {
    public final /* synthetic */ InterfaceC84870XSo LJLIL;
    public final /* synthetic */ C48325Ixt LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC84870XSo interfaceC84870XSo = this.LJLIL;
            if (downloadInfo.getTotalBytes() <= 0) {
                return;
            }
            interfaceC84870XSo.onProgress((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r2 == null) goto L31;
     */
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48354IyM.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        String str;
        super.onFailed(downloadInfo, baseException);
        InterfaceC84870XSo interfaceC84870XSo = this.LJLIL;
        if (baseException != null) {
            i = baseException.getErrorCode();
        } else {
            i = -1;
        }
        String str2 = null;
        if (baseException != null) {
            str = baseException.getErrorMessage();
        } else {
            str = null;
        }
        if (downloadInfo != null) {
            str2 = downloadInfo.getConnectionUrl();
        }
        interfaceC84870XSo.LIZ(new XSX(i, str, str2));
    }

    public C48354IyM(XSW xsw, C48325Ixt c48325Ixt, boolean z) {
        this.LJLIL = xsw;
        this.LJLILLLLZI = c48325Ixt;
        this.LJLJI = z;
    }
}
