package ms.bd.o;

import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class i0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        boolean z;
        c2 LIZ = c2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            if (!LIZ.LJLJJI && LIZ.LJLILLLLZI.isAlive()) {
                LIZ.LIZLLL();
            }
            if (LIZ.LJLJJLL.size() >= LIZ.LJLJLLL && !LIZ.LJLJL) {
                z = true;
                LIZ.LJLJL = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
