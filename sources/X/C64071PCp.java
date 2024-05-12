package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PCp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64071PCp {
    public static final java.util.Map<PD6, C64071PCp> LIZLLL = new HashMap();
    public final PThreadScheduledThreadPoolExecutor LIZ;
    public final ConcurrentHashMap<AbstractRunnableC64070PCo, ScheduledFuture> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC64070PCo, Runnable> LIZJ = new ConcurrentHashMap<>();

    public C64071PCp(String str) {
        this.LIZ = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC64063PCh(str));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized C64071PCp LIZ(PD6 pd6) {
        synchronized (C64071PCp.class) {
            if (pd6 != null) {
                try {
                    java.util.Map<PD6, C64071PCp> map = LIZLLL;
                    try {
                        try {
                            try {
                                C64071PCp c64071PCp = (C64071PCp) ((HashMap) map).get(pd6);
                                if (c64071PCp == null) {
                                    try {
                                        try {
                                            try {
                                                c64071PCp = new C64071PCp(pd6.name());
                                                try {
                                                    try {
                                                        ((HashMap) map).put(pd6, c64071PCp);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                return c64071PCp;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } else {
                try {
                    try {
                        try {
                            throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
            }
            throw th;
        }
    }

    public final void LIZIZ(AbstractRunnableC64070PCo abstractRunnableC64070PCo) {
        try {
            this.LIZ.remove(this.LIZJ.remove(abstractRunnableC64070PCo));
            ScheduledFuture remove = this.LIZIZ.remove(abstractRunnableC64070PCo);
            if (remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-AsyncTask", "removeTask failed", th);
        }
    }

    public final void LIZJ(AbstractRunnableC64070PCo abstractRunnableC64070PCo) {
        ScheduledFuture<?> schedule;
        if (abstractRunnableC64070PCo == null) {
            return;
        }
        try {
            RunnableC64053PBx runnableC64053PBx = new RunnableC64053PBx(abstractRunnableC64070PCo);
            if (abstractRunnableC64070PCo.LJLILLLLZI) {
                schedule = this.LIZ.scheduleWithFixedDelay(runnableC64053PBx, abstractRunnableC64070PCo.LJLIL, abstractRunnableC64070PCo.LJLJI, TimeUnit.MILLISECONDS);
            } else {
                schedule = this.LIZ.schedule(runnableC64053PBx, abstractRunnableC64070PCo.LJLIL, TimeUnit.MILLISECONDS);
            }
            this.LIZJ.put(abstractRunnableC64070PCo, runnableC64053PBx);
            this.LIZIZ.put(abstractRunnableC64070PCo, schedule);
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-AsyncTask", "sendTask failed.", th);
        }
    }
}
