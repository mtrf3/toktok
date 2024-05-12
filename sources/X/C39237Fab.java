package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.a3;
import ms.bd.o.b;

/* renamed from: X.Fab, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39237Fab extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        a3 LIZ = a3.LIZ();
        LIZ.getClass();
        try {
            if (((ReentrantLock) LIZ.LJLJJLL).tryLock(5L, TimeUnit.SECONDS)) {
                if (LIZ.LJLJJL.size() >= a3.LJLLI) {
                    synchronized (LIZ) {
                        LIZ.LJ();
                    }
                }
                Object[] LIZJ = LIZ.LIZJ();
                LIZ.LJFF();
                return LIZJ;
            }
        } catch (Throwable unused) {
        }
        LIZ.LJFF();
        return null;
    }
}
