package X;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X2a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84180X2a implements IDownloadDepend {
    public final /* synthetic */ X2Z LIZ;

    public C84180X2a(X2Z x2z) {
        this.LIZ = x2z;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadDepend
    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (downloadInfo == null) {
            return;
        }
        try {
            this.LIZ.monitorLogSend(downloadInfo, baseException, i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
