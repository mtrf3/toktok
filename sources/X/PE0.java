package X;

import defpackage.i0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes12.dex */
public final class PE0 {
    public volatile ExecutorService LIZ;
    public volatile boolean LIZIZ = true;
    public final C64106PDy LIZLLL = new C64106PDy(this);
    public final C64107PDz LJ = new C64107PDz(this);
    public final CopyOnWriteArraySet<PE2> LJFF = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<PE2> LJI = new CopyOnWriteArraySet<>();
    public final PE3 LIZJ = PD2.LIZ;

    public final boolean LIZIZ() {
        long j;
        if (this.LIZJ != null) {
            long id = C16880lQ.LLLLIIIILLL().getId();
            PE3 pe3 = this.LIZJ;
            Long l = (Long) ((ConcurrentHashMap) pe3.LIZLLL).get(PD7.LIGHT_WEIGHT);
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            if (id == j) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(PE2 pe2) {
        if (pe2 != null) {
            try {
                if (this.LIZIZ && !this.LJFF.contains(pe2)) {
                    this.LJFF.add(pe2);
                    LJFF(this.LIZLLL);
                    LJ(this.LIZLLL);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZJ(Runnable runnable) {
        if (this.LIZJ == null || runnable == null || !this.LIZIZ) {
            return;
        }
        this.LIZJ.LJII(new PE1(PD7.LIGHT_WEIGHT, runnable, i0.LJFF("AsyncEventManager-", "post")));
    }

    public final void LJ(PD3 pd3) {
        if (this.LIZJ == null || pd3 == null || !this.LIZIZ) {
            return;
        }
        this.LIZJ.LJIIIIZZ(pd3, 30000L);
    }

    public final void LJFF(PD3 pd3) {
        PE3 pe3 = this.LIZJ;
        if (pe3 == null || pd3 == null) {
            return;
        }
        try {
            C39050FUg LIZIZ = pe3.LIZIZ(pd3);
            ThreadPoolExecutor threadPoolExecutor = LIZIZ.LJLJJI;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.remove(pd3);
            }
            LIZIZ.LIZ(pd3);
        } catch (Throwable th) {
            pe3.LIZ("Apm-Async-task-removeTask", th);
        }
    }

    public final void LJI(PE2 pe2) {
        if (pe2 != null) {
            try {
                this.LJFF.remove(pe2);
            } catch (Throwable unused) {
            }
        }
    }

    public final void LJII(Runnable runnable) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    PE3 pe3 = this.LIZJ;
                    if (pe3 != null) {
                        this.LIZ = pe3.LIZJ();
                    } else {
                        this.LIZ = C16880lQ.LLLLZI(1, new F3P());
                    }
                }
            }
        }
        if (this.LIZ != null) {
            this.LIZ.submit(runnable);
        }
    }

    public final void LIZLLL(long j, Runnable runnable) {
        if (this.LIZJ == null || !this.LIZIZ) {
            return;
        }
        this.LIZJ.LJIIIIZZ(new PE1(PD7.LIGHT_WEIGHT, runnable, i0.LJFF("AsyncEventManager-", "postDelayed")), j);
    }
}
