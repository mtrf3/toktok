package X;

import android.os.RemoteException;

/* renamed from: X.X1o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84168X1o implements InterfaceC84169X1p {
    public final /* synthetic */ InterfaceC84167X1n LIZ;

    @Override // X.InterfaceC84169X1p
    public final boolean LIZ() {
        try {
            return this.LIZ.LJIIIZ();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public C84168X1o(InterfaceC84167X1n interfaceC84167X1n) {
        this.LIZ = interfaceC84167X1n;
    }
}
