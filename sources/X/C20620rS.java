package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0rS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20620rS {
    public final ScheduledExecutorService LIZ;
    public final java.util.Map<String, RunnableC20610rR> LIZIZ;
    public final java.util.Map<String, InterfaceC20600rQ> LIZJ;
    public final Object LIZLLL;

    static {
        C0VW.LIZIZ("WorkTimer");
    }

    public C20620rS() {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0rP
            public int LJLIL;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("WorkManager-WorkTimer-thread-");
                LIZ.append(this.LJLIL);
                newThread.setName(X1D.LIZIZ(LIZ));
                this.LJLIL++;
                return newThread;
            }
        };
        this.LIZIZ = new HashMap();
        this.LIZJ = new HashMap();
        this.LIZLLL = new Object();
        this.LIZ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(threadFactory);
    }

    public final void LIZIZ(String str) {
        synchronized (this.LIZLLL) {
            if (((RunnableC20610rR) ((HashMap) this.LIZIZ).remove(str)) != null) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Stopping timer for %s", new Object[]{str});
                LIZ.getClass();
                ((HashMap) this.LIZJ).remove(str);
            }
        }
    }

    public final void LIZ(final String str, InterfaceC20600rQ interfaceC20600rQ) {
        synchronized (this.LIZLLL) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Starting timer for %s", new Object[]{str});
            LIZ.getClass();
            LIZIZ(str);
            Runnable runnable = new Runnable(this, str) { // from class: X.0rR
                public final C20620rS LJLIL;
                public final String LJLILLLLZI;

                public final void LIZ() {
                    synchronized (this.LJLIL.LIZLLL) {
                        if (((RunnableC20610rR) ((HashMap) this.LJLIL.LIZIZ).remove(this.LJLILLLLZI)) != null) {
                            InterfaceC20600rQ interfaceC20600rQ2 = (InterfaceC20600rQ) ((HashMap) this.LJLIL.LIZJ).remove(this.LJLILLLLZI);
                            if (interfaceC20600rQ2 != null) {
                                interfaceC20600rQ2.LIZ(this.LJLILLLLZI);
                            }
                        } else {
                            C0VW LIZ2 = C0VW.LIZ();
                            C16880lQ.LLLZ("Timer with %s is already marked as complete.", new Object[]{this.LJLILLLLZI});
                            LIZ2.getClass();
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }

                {
                    this.LJLIL = this;
                    this.LJLILLLLZI = str;
                }
            };
            ((HashMap) this.LIZIZ).put(str, runnable);
            ((HashMap) this.LIZJ).put(str, interfaceC20600rQ);
            this.LIZ.schedule(runnable, 600000L, TimeUnit.MILLISECONDS);
        }
    }
}
