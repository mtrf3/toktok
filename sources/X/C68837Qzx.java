package X;

import android.os.RemoteException;

/* renamed from: X.Qzx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68837Qzx {
    public final InterfaceC68838Qzy LIZ;

    public final int hashCode() {
        try {
            return this.LIZ.LJII();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C68837Qzx(InterfaceC68838Qzy interfaceC68838Qzy) {
        QH7.LJIIIIZZ(interfaceC68838Qzy);
        this.LIZ = interfaceC68838Qzy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C68837Qzx)) {
            return false;
        }
        try {
            return this.LIZ.LLFFF(((C68837Qzx) obj).LIZ);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
