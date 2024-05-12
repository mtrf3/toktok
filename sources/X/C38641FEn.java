package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.FEn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38641FEn implements InterfaceC38642FEo {
    public static final java.util.Map<Runnable, Executor> LIZ;
    public static final java.util.Set<String> LIZIZ;
    public static final java.util.Set<String> LIZJ;

    static {
        C16880lQ.LJLLJ(C38641FEn.class);
        new AtomicLong(0L);
        new AtomicInteger(0);
        new AtomicInteger(0);
        LIZ = new ConcurrentHashMap();
        new ReentrantReadWriteLock().writeLock();
        new ReentrantLock().newCondition();
        LIZIZ = new CopyOnWriteArraySet();
        LIZJ = new CopyOnWriteArraySet();
    }
}
