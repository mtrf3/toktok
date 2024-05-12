package ms.bd.o;

import android.content.Context;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class g0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        c2.LIZ(context).LIZJ();
        c2 LIZ = c2.LIZ(context);
        synchronized (LIZ) {
            if (LIZ.LJLILLLLZI.isAlive()) {
                LIZ.LJLILLLLZI.quit();
            }
        }
        return null;
    }
}
