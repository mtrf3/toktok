package X;

import android.os.RemoteException;

/* renamed from: X.X1z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84179X1z implements X21 {
    public final /* synthetic */ X20 LIZ;

    public C84179X1z(X20 x20) {
        this.LIZ = x20;
    }

    public final boolean LIZ(long j, long j2, InterfaceC84175X1v interfaceC84175X1v) {
        BinderC84173X1t binderC84173X1t;
        try {
            X20 x20 = this.LIZ;
            if (interfaceC84175X1v == null) {
                binderC84173X1t = null;
            } else {
                binderC84173X1t = new BinderC84173X1t(interfaceC84175X1v);
            }
            return x20.LLLFZ(j, j2, binderC84173X1t);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
