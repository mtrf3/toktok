package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Pbp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64793Pbp {
    public static final ConcurrentHashMap<EnumC64792Pbo, C64793Pbp> LJ;
    public final ConcurrentHashMap<AbstractRunnableC64795Pbr, ScheduledFuture> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC64795Pbr, Runnable> LIZIZ = new ConcurrentHashMap<>();
    public final EnumC64792Pbo LIZJ;
    public final PThreadScheduledThreadPoolExecutor LIZLLL;

    static {
        C16880lQ.LJLLJ(C64793Pbp.class);
        LJ = new ConcurrentHashMap<>();
    }

    public C64793Pbp(EnumC64792Pbo enumC64792Pbo) {
        this.LIZJ = enumC64792Pbo;
        this.LIZLLL = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC31498CXu(enumC64792Pbo.name()));
    }

    public static C64793Pbp LIZ(EnumC64792Pbo enumC64792Pbo) {
        if (enumC64792Pbo != null) {
            ConcurrentHashMap<EnumC64792Pbo, C64793Pbp> concurrentHashMap = LJ;
            if (concurrentHashMap.get(enumC64792Pbo) == null) {
                synchronized (C64793Pbp.class) {
                    if (concurrentHashMap.get(enumC64792Pbo) == null) {
                        concurrentHashMap.put(enumC64792Pbo, new C64793Pbp(enumC64792Pbo));
                    }
                }
            }
            return concurrentHashMap.get(enumC64792Pbo);
        }
        throw new IllegalArgumentException("unsupported async task type");
    }

    public final void LIZIZ(AbstractRunnableC64795Pbr abstractRunnableC64795Pbr) {
        ScheduledFuture<?> schedule;
        abstractRunnableC64795Pbr.mTaskType = this.LIZJ;
        try {
            RunnableC64794Pbq runnableC64794Pbq = new RunnableC64794Pbq(abstractRunnableC64795Pbr);
            if (abstractRunnableC64795Pbr.isLoop()) {
                schedule = this.LIZLLL.scheduleWithFixedDelay(runnableC64794Pbq, abstractRunnableC64795Pbr.mInitialDelay, abstractRunnableC64795Pbr.mLoopInterval, abstractRunnableC64795Pbr.mTimeUnit);
            } else {
                schedule = this.LIZLLL.schedule(runnableC64794Pbq, abstractRunnableC64795Pbr.mInitialDelay, abstractRunnableC64795Pbr.mTimeUnit);
            }
            this.LIZIZ.put(abstractRunnableC64795Pbr, runnableC64794Pbq);
            this.LIZ.put(abstractRunnableC64795Pbr, schedule);
        } catch (Throwable unused) {
        }
    }
}
