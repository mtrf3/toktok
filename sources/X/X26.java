package X;

import android.os.RemoteException;

/* loaded from: classes16.dex */
public final class X26 implements X27 {
    public final /* synthetic */ X25 LJLIL;

    public X26(X25 x25) {
        this.LJLIL = x25;
    }

    @Override // X.X27
    public final long LJJII(int i, int i2) {
        try {
            return this.LJLIL.LJJII(i, i2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }
}
