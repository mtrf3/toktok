package X;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X2c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84182X2c implements InterfaceC84183X2d {
    public final /* synthetic */ InterfaceC84181X2b LIZ;

    public C84182X2c(InterfaceC84181X2b interfaceC84181X2b) {
        this.LIZ = interfaceC84181X2b;
    }

    @Override // X.InterfaceC84183X2d
    public final void LJJJJZ(DownloadInfo downloadInfo) {
        try {
            this.LIZ.LJJJJZ(downloadInfo);
        } catch (RemoteException e) {
            throw new BaseException(1008, e);
        }
    }

    @Override // X.InterfaceC84183X2d
    public final boolean LJJJLL(DownloadInfo downloadInfo) {
        try {
            return this.LIZ.LJJJLL(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
