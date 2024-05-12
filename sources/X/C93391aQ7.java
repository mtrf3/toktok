package X;

import android.os.RemoteException;

/* renamed from: X.aQ7, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93391aQ7 implements C8DW {
    public final C68837Qzx LIZ;

    @Override // X.C8DW
    public final void remove() {
        C68837Qzx c68837Qzx = this.LIZ;
        c68837Qzx.getClass();
        try {
            c68837Qzx.LIZ.LJIILLIIL();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C93391aQ7(C68837Qzx c68837Qzx) {
        this.LIZ = c68837Qzx;
    }
}
