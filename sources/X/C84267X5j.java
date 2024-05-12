package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X5j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84267X5j extends AbstractC84266X5i {
    public final /* synthetic */ InterfaceC84273X5p LJLIL;

    public C84267X5j(XSV xsv) {
        this.LJLIL = xsv;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC84273X5p interfaceC84273X5p = this.LJLIL;
            if (downloadInfo.getTotalBytes() <= 0) {
                return;
            }
            interfaceC84273X5p.onProgress((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2 == null) goto L6;
     */
    @Override // X.AbstractC84266X5i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r4) {
        /*
            r3 = this;
            super.onSuccessed(r4)
            if (r4 == 0) goto L1d
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r4.getSavePath()
            r1.append(r0)
            java.lang.String r0 = r4.getName()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            if (r2 != 0) goto L1f
        L1d:
            java.lang.String r2 = ""
        L1f:
            X.X5p r1 = r3.LJLIL
            r0 = 0
            r1.LIZ(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84267X5j.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    @Override // X.AbstractC84266X5i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        String str;
        super.onFailed(downloadInfo, baseException);
        InterfaceC84273X5p interfaceC84273X5p = this.LJLIL;
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
        interfaceC84273X5p.LIZIZ(new XAL(i, str, str2));
    }
}
