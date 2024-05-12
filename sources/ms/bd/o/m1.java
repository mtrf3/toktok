package ms.bd.o;

import java.util.Arrays;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class m1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Throwable th;
        v2 LIZ = v2.LIZ();
        synchronized (LIZ) {
            th = LIZ.LIZIZ;
        }
        if (th != null) {
            return Arrays.toString(th.getStackTrace());
        }
        return "";
    }
}
