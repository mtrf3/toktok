package X;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Pgw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65110Pgw {
    public static C65118Ph4 LIZJ;
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final ConcurrentHashMap<String, C65116Ph2> LIZIZ = new ConcurrentHashMap<>();
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final AtomicInteger LJ = new AtomicInteger(0);

    public static void LIZ(String str) {
        HashSet<String> hashSet = LIZ;
        synchronized (hashSet) {
            hashSet.remove(str);
        }
        ConcurrentHashMap<String, C65116Ph2> concurrentHashMap = LIZIZ;
        C65116Ph2 c65116Ph2 = concurrentHashMap.get(str);
        if (c65116Ph2 != null) {
            ReentrantLock reentrantLock = c65116Ph2.LIZ;
            reentrantLock.lock();
            try {
                c65116Ph2.LIZIZ.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }
        concurrentHashMap.remove(str);
    }
}
