package X;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X2U extends X2R {
    public final /* synthetic */ InterfaceC84186X2g LJLILLLLZI;

    public X2U(InterfaceC84186X2g interfaceC84186X2g) {
        this.LJLILLLLZI = interfaceC84186X2g;
    }

    @Override // X.X2W
    public final boolean LLIIZ(DownloadInfo downloadInfo) {
        C84185X2f c84185X2f = (C84185X2f) this.LJLILLLLZI;
        c84185X2f.getClass();
        try {
            return c84185X2f.LIZ.LLIIZ(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X2W
    public final boolean LLLLLILLIL(DownloadInfo downloadInfo) {
        C84185X2f c84185X2f = (C84185X2f) this.LJLILLLLZI;
        c84185X2f.getClass();
        try {
            return c84185X2f.LIZ.LLLLLILLIL(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X2W
    public final boolean N(DownloadInfo downloadInfo) {
        C84185X2f c84185X2f = (C84185X2f) this.LJLILLLLZI;
        c84185X2f.getClass();
        try {
            return c84185X2f.LIZ.N(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
