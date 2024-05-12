package X;

import android.os.RemoteException;

/* renamed from: X.X1i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84162X1i implements InterfaceC84163X1j {
    public final /* synthetic */ InterfaceC84160X1g LIZ;

    public C84162X1i(InterfaceC84160X1g interfaceC84160X1g) {
        this.LIZ = interfaceC84160X1g;
    }

    @Override // X.InterfaceC84163X1j
    public final void LJJJIL(int i, int i2) {
        try {
            this.LIZ.LJJJIL(i, i2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
