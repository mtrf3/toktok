package X;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.aPV, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class C93353aPV {
    public final R0A LIZ;
    public LatLng LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C93353aPV(R0A r0a) {
        this.LIZ = r0a;
        r0a.getClass();
        try {
            this.LIZIZ = r0a.LIZ.LJII();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C93353aPV) {
            return this.LIZ.equals(((C93353aPV) obj).LIZ);
        }
        return false;
    }
}
