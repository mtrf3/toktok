package X;

import android.os.RemoteException;

/* loaded from: classes12.dex */
public final class R0A {
    public final R04 LIZ;

    public final int hashCode() {
        try {
            return this.LIZ.LIZJ();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public R0A(R04 r04) {
        QH7.LJIIIIZZ(r04);
        this.LIZ = r04;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R0A)) {
            return false;
        }
        try {
            return this.LIZ.LJLZ(((R0A) obj).LIZ);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
