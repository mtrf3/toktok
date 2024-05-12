package X;

import android.os.RemoteException;

/* loaded from: classes16.dex */
public final class X2A extends X28 {
    public final /* synthetic */ X2C LJLILLLLZI;

    public X2A(X2C x2c) {
        this.LJLILLLLZI = x2c;
    }

    @Override // X.X29
    public final android.net.Uri K(String str, String str2) {
        X2B x2b = (X2B) this.LJLILLLLZI;
        x2b.getClass();
        try {
            return x2b.LIZ.K(str, str2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
