package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import ujb.o;

/* renamed from: X.Io0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47712Io0 {
    public static final C47712Io0 LIZ = new C47712Io0();
    public static final ReentrantReadWriteLock.ReadLock LIZIZ;
    public static final ReentrantReadWriteLock.WriteLock LIZJ;
    public static final C0M6<String, Long> LIZLLL;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZIZ = reentrantReadWriteLock.readLock();
        LIZJ = reentrantReadWriteLock.writeLock();
        LIZLLL = new C0M6<>(10);
    }

    public static final long LIZ(String str, String str2) {
        if (!C46273IEb.LIZ().enableRecordPosBeforeStop || str == null || o.LJJJJJL(str) || str2 == null || o.LJJJJJL(str2)) {
            return -1L;
        }
        ReentrantReadWriteLock.ReadLock readLock = LIZIZ;
        readLock.lock();
        C0M6<String, Long> c0m6 = LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('}');
        Long LIZIZ2 = c0m6.LIZIZ(X1D.LIZIZ(LIZ2));
        if (LIZIZ2 == null) {
            LIZIZ2 = -1L;
        }
        long longValue = LIZIZ2.longValue();
        readLock.unlock();
        return longValue;
    }

    public final void LIZIZ(long j, String str, String str2) {
        if (!C46273IEb.LIZ().enableRecordPosBeforeStop || str == null || o.LJJJJJL(str) || str2 == null || o.LJJJJJL(str2)) {
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = LIZJ;
        writeLock.lock();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('}');
        LIZLLL.LIZJ(X1D.LIZIZ(LIZ2), Long.valueOf(j));
        writeLock.unlock();
    }
}
