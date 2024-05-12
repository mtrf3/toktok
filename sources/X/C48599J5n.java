package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.J5n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48599J5n extends AbstractC48597J5l {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZJ;
    public final ArrayList<AbstractC48600J5o> LIZLLL = new ArrayList<>();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();
    public final ArrayList<InterfaceC35582Dxq> LJFF = new ArrayList<>();
    public final ReentrantReadWriteLock LJI = new ReentrantReadWriteLock();
    public final ConcurrentHashMap<String, List<String>> LJII = new ConcurrentHashMap<>();

    @Override // X.AbstractC48600J5o
    public final ConcurrentHashMap<String, String> LJFF() {
        ConcurrentHashMap concurrentHashMap = null;
        if (!this.LIZLLL.isEmpty()) {
            this.LJ.readLock().lock();
            try {
                Iterator<AbstractC48600J5o> it = this.LIZLLL.iterator();
                while (it.hasNext()) {
                    concurrentHashMap = LJI(it.next().LJFF(), concurrentHashMap);
                }
            } finally {
                this.LJ.readLock().unlock();
            }
        }
        return LJI(J60.LIZ().LJFF(), LJI(C48609J5x.LIZ().LJFF(), concurrentHashMap));
    }

    @Override // X.AbstractC48600J5o
    public final boolean LIZ(String str) {
        if (str != null) {
            if (J60.LIZ().LIZ(str) || C48609J5x.LIZ().LIZ(str)) {
                return true;
            }
            if (!this.LIZLLL.isEmpty()) {
                this.LJ.readLock().lock();
                try {
                    Iterator<AbstractC48600J5o> it = this.LIZLLL.iterator();
                    while (it.hasNext()) {
                        if (it.next().LIZ(str)) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                    this.LJ.readLock().unlock();
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC48600J5o
    public final String LIZJ(String str) {
        if (str != null) {
            if (J60.LIZ().LIZ(str)) {
                return J60.LIZ().LIZJ(str);
            }
            if (C48609J5x.LIZ().LIZ(str)) {
                return C48609J5x.LIZ().LIZJ(str);
            }
            if (!this.LIZLLL.isEmpty()) {
                this.LJ.readLock().lock();
                try {
                    Iterator<AbstractC48600J5o> it = this.LIZLLL.iterator();
                    while (it.hasNext()) {
                        AbstractC48600J5o next = it.next();
                        if (next.LIZ(str)) {
                            return next.LIZJ(str);
                        }
                    }
                    return null;
                } finally {
                    this.LJ.readLock().unlock();
                }
            }
            return null;
        }
        return null;
    }

    public final void LJII(AbstractC48596J5k abstractC48596J5k) {
        if (abstractC48596J5k != null) {
            this.LJ.writeLock().lock();
            try {
                if (!this.LIZLLL.contains(abstractC48596J5k)) {
                    this.LIZLLL.add(abstractC48596J5k);
                }
                this.LJ.writeLock().unlock();
                ScheduledExecutorService LIZ = C48602J5q.LIZ();
                if (LIZ != null) {
                    LIZ.execute(new ARunnableS44S0100000_8(abstractC48596J5k, 99));
                }
            } catch (Throwable th) {
                this.LJ.writeLock().unlock();
                throw th;
            }
        }
    }

    public static ConcurrentHashMap LJI(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        if (concurrentHashMap != null && (!concurrentHashMap.isEmpty())) {
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
            }
            concurrentHashMap2.putAll(concurrentHashMap);
        }
        return concurrentHashMap2;
    }

    public final void LJIIIIZZ(Context context, ScheduledExecutorService scheduledExecutorService) {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C48602J5q.LIZIZ = C16880lQ.LLLLL(context);
        if (scheduledExecutorService != null) {
            C48602J5q.LIZJ = scheduledExecutorService;
        }
        ScheduledExecutorService LIZ = C48602J5q.LIZ();
        if (LIZ != null) {
            LIZ.execute(RunnableC48601J5p.LJLIL);
        }
    }
}
