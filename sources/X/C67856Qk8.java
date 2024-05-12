package X;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: X.Qk8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67856Qk8 {
    public final SparseIntArray LIZ = new SparseIntArray();
    public final C67258QaU LIZIZ;

    public C67856Qk8(C67258QaU c67258QaU) {
        QH7.LJIIIIZZ(c67258QaU);
        this.LIZIZ = c67258QaU;
    }

    public final int LIZ(Context context, InterfaceC67836Qjo interfaceC67836Qjo) {
        QH7.LJIIIIZZ(context);
        QH7.LJIIIIZZ(interfaceC67836Qjo);
        if (!interfaceC67836Qjo.LJIILLIIL()) {
            return 0;
        }
        int LJIILJJIL = interfaceC67836Qjo.LJIILJJIL();
        int i = this.LIZ.get(LJIILJJIL, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < this.LIZ.size()) {
                    int keyAt = this.LIZ.keyAt(i2);
                    if (keyAt > LJIILJJIL && this.LIZ.get(keyAt) == 0) {
                        i = 0;
                        break;
                    }
                    i2++;
                } else {
                    i = this.LIZIZ.isGooglePlayServicesAvailable(context, LJIILJJIL);
                    break;
                }
            }
            this.LIZ.put(LJIILJJIL, i);
        }
        return i;
    }
}
