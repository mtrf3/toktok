package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.QpS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68186QpS extends AbstractC68187QpT {
    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public final boolean LJIIIZ() {
        LJI();
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LIZ.LIZ, "connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = C16880lQ.LJJLI(connectivityManager);
            } catch (SecurityException unused) {
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C68186QpS(C68241QqL c68241QqL) {
        super(c68241QqL);
    }
}
