package X;

import android.os.RemoteException;

/* renamed from: X.X1u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84174X1u implements InterfaceC84175X1v {
    public final /* synthetic */ InterfaceC84172X1s LIZ;

    @Override // X.InterfaceC84175X1v
    public final void LJJIJ() {
        try {
            this.LIZ.LJJIJ();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C84174X1u(InterfaceC84172X1s interfaceC84172X1s) {
        this.LIZ = interfaceC84172X1s;
    }
}
