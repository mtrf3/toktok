package ms.bd.o;

import java.util.ArrayList;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class c1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        int LIZJ;
        int LIZIZ;
        t2 LIZ = t2.LIZ(a.LIZIZ.LIZ);
        LIZ.getClass();
        try {
            synchronized (LIZ) {
                LIZJ = LIZ.LIZJ();
                LIZIZ = LIZ.LIZIZ();
            }
            i2 = (LIZJ * 10000) + LIZIZ;
        } catch (Exception unused) {
            i2 = -10001;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null) {
            return null;
        }
        ((ArrayList) LIZ.LIZIZ).add(valueOf);
        try {
            int size = ((ArrayList) LIZ.LIZIZ).size();
            if (size <= 20) {
                return null;
            }
            ArrayList arrayList = new ArrayList(((ArrayList) LIZ.LIZIZ).subList(size - 10, size));
            ((ArrayList) LIZ.LIZIZ).clear();
            LIZ.LIZIZ = arrayList;
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
