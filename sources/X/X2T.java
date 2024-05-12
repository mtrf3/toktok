package X;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X2T extends X2P {
    public final /* synthetic */ InterfaceC84187X2h LJLILLLLZI;

    @Override // X.X2X
    public final String LLJJJIL() {
        C84184X2e c84184X2e = (C84184X2e) this.LJLILLLLZI;
        c84184X2e.getClass();
        try {
            return c84184X2e.LIZ.LLJJJIL();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public X2T(InterfaceC84187X2h interfaceC84187X2h) {
        this.LJLILLLLZI = interfaceC84187X2h;
    }

    @Override // X.X2X
    public final boolean e(boolean z) {
        C84184X2e c84184X2e = (C84184X2e) this.LJLILLLLZI;
        c84184X2e.getClass();
        try {
            return c84184X2e.LIZ.e(z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X2X
    public final void LLLLL(int i, DownloadInfo downloadInfo, String str, String str2) {
        C84184X2e c84184X2e = (C84184X2e) this.LJLILLLLZI;
        c84184X2e.getClass();
        try {
            c84184X2e.LIZ.LLLLL(i, downloadInfo, str, str2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
