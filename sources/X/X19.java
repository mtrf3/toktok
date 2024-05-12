package X;

import android.os.RemoteException;

/* loaded from: classes16.dex */
public final class X19 implements X1C {
    public final /* synthetic */ X1B LIZ;

    public X19(X1B x1b) {
        this.LIZ = x1b;
    }

    public final boolean LIZ(X15 x15) {
        X16 x16;
        try {
            X1B x1b = this.LIZ;
            if (x15 == null) {
                x16 = null;
            } else {
                x16 = new X16(x15);
            }
            return x1b.LLIZ(x16);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
