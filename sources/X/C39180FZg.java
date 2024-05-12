package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.b;
import ms.bd.o.o2;

/* renamed from: X.FZg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39180FZg extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Object[] array;
        o2 LIZ = o2.LIZ();
        LIZ.getClass();
        try {
            if (((ReentrantLock) LIZ.LIZIZ).tryLock(5L, TimeUnit.SECONDS) && i > 0) {
                if (LIZ.LIZ.size() > i) {
                    array = LIZ.LIZ.subList(0, i).toArray();
                } else {
                    array = LIZ.LIZ.toArray();
                }
                o2.LIZLLL = i;
                LIZ.LIZIZ();
                return array;
            }
        } catch (Throwable unused) {
        }
        LIZ.LIZIZ();
        return null;
    }
}
