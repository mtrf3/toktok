package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1OR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OR implements C0XX, InterfaceC17840my {
    public final Context LJLILLLLZI;
    public final C0CW LJLJI;
    public final InterfaceC23750wV LJLJJI;
    public final WorkDatabase LJLJJL;
    public final List<C0XZ> LJLJLJ;
    public final java.util.Map<String, RunnableC09050Xd> LJLJL = new HashMap();
    public final java.util.Map<String, RunnableC09050Xd> LJLJJLL = new HashMap();
    public final java.util.Set<String> LJLJLLL = new HashSet();
    public final List<C0XX> LJLL = new ArrayList();
    public PowerManager.WakeLock LJLIL = null;
    public final Object LJLLI = new Object();

    static {
        C0VW.LIZIZ("Processor");
    }

    public final void LJIIIIZZ() {
        synchronized (this.LJLLI) {
            if (!(!((HashMap) this.LJLJJLL).isEmpty())) {
                Intent intent = new Intent(this.LJLILLLLZI, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    C16880lQ.LLLL(this.LJLILLLLZI, intent);
                } catch (Throwable unused) {
                    C0VW.LIZ().getClass();
                }
                PowerManager.WakeLock wakeLock = this.LJLIL;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.LJLIL = null;
                }
            }
        }
    }

    public final void LIZ(C0XX c0xx) {
        synchronized (this.LJLLI) {
            ((ArrayList) this.LJLL).add(c0xx);
        }
    }

    public final boolean LIZJ(String str) {
        boolean contains;
        synchronized (this.LJLLI) {
            contains = ((HashSet) this.LJLJLLL).contains(str);
        }
        return contains;
    }

    public final boolean LIZLLL(String str) {
        boolean z;
        synchronized (this.LJLLI) {
            if (!((HashMap) this.LJLJL).containsKey(str) && !((HashMap) this.LJLJJLL).containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final void LJFF(C0XX c0xx) {
        synchronized (this.LJLLI) {
            ((ArrayList) this.LJLL).remove(c0xx);
        }
    }

    public final boolean LJIIIZ(String str) {
        boolean LIZIZ;
        synchronized (this.LJLLI) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Processor stopping foreground work %s", new Object[]{str});
            LIZ.getClass();
            LIZIZ = LIZIZ(str, (RunnableC09050Xd) ((HashMap) this.LJLJJLL).remove(str));
        }
        return LIZIZ;
    }

    public final boolean LJIIJ(String str) {
        boolean LIZIZ;
        synchronized (this.LJLLI) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Processor stopping background work %s", new Object[]{str});
            LIZ.getClass();
            LIZIZ = LIZIZ(str, (RunnableC09050Xd) ((HashMap) this.LJLJL).remove(str));
        }
        return LIZIZ;
    }

    public static boolean LIZIZ(String str, RunnableC09050Xd runnableC09050Xd) {
        boolean z;
        if (runnableC09050Xd != null) {
            runnableC09050Xd.LJZ = true;
            runnableC09050Xd.LJIIIZ();
            C76L<C0CS> c76l = runnableC09050Xd.LJLZ;
            if (c76l != null) {
                z = c76l.isDone();
                runnableC09050Xd.LJLZ.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = runnableC09050Xd.LJLJJL;
            if (listenableWorker != null && !z) {
                listenableWorker.LJI();
            } else {
                C16880lQ.LLLZ("WorkSpec %s is already done. Not interrupting.", new Object[]{runnableC09050Xd.LJLJJI});
                C0VW.LIZ().getClass();
            }
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("WorkerWrapper interrupted for %s", new Object[]{str});
            LIZ.getClass();
            return true;
        }
        C0VW LIZ2 = C0VW.LIZ();
        C16880lQ.LLLZ("WorkerWrapper could not be found for %s", new Object[]{str});
        LIZ2.getClass();
        return false;
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        synchronized (this.LJLLI) {
            ((HashMap) this.LJLJL).remove(str);
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("%s %s executed; reschedule = %s", new Object[]{C16880lQ.LJLLJ(C1OR.class), str, Boolean.valueOf(z)});
            LIZ.getClass();
            Iterator it = ((ArrayList) this.LJLL).iterator();
            while (it.hasNext()) {
                ((C0XX) it.next()).LJ(str, z);
            }
        }
    }

    public final void LJI(String str, C0VT c0vt) {
        synchronized (this.LJLLI) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Moving WorkSpec (%s) to the foreground", new Object[]{str});
            LIZ.getClass();
            RunnableC09050Xd runnableC09050Xd = (RunnableC09050Xd) ((HashMap) this.LJLJL).remove(str);
            if (runnableC09050Xd != null) {
                if (this.LJLIL == null) {
                    PowerManager.WakeLock LIZ2 = C20550rL.LIZ(this.LJLILLLLZI, "ProcessorForegroundLck");
                    this.LJLIL = LIZ2;
                    LIZ2.acquire();
                }
                ((HashMap) this.LJLJJLL).put(str, runnableC09050Xd);
                Intent LIZIZ = C1DA.LIZIZ(this.LJLILLLLZI, str, c0vt);
                Context context = this.LJLILLLLZI;
                if (Build.VERSION.SDK_INT >= 26) {
                    C04300Ew.LIZ(context, LIZIZ);
                } else {
                    C16880lQ.LLLL(context, LIZIZ);
                }
            }
        }
    }

    public final boolean LJII(final String str, C0CT c0ct) {
        synchronized (this.LJLLI) {
            if (LIZLLL(str)) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Work %s is already enqueued for processing", new Object[]{str});
                LIZ.getClass();
                return false;
            }
            C09040Xc c09040Xc = new C09040Xc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this, this.LJLJJL, str);
            c09040Xc.LJI = this.LJLJLJ;
            if (c0ct != null) {
                c09040Xc.LJII = c0ct;
            }
            RunnableC09050Xd runnableC09050Xd = new RunnableC09050Xd(c09040Xc);
            final C43731nd<Boolean> c43731nd = runnableC09050Xd.LJLLLLLL;
            c43731nd.LJFF(new Runnable(this, str, c43731nd) { // from class: X.0XY
                public final C0XX LJLIL;
                public final String LJLILLLLZI;
                public final C76L<Boolean> LJLJI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    boolean z;
                    try {
                        try {
                            z = this.LJLJI.get().booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            z = true;
                        }
                        this.LJLIL.LJ(this.LJLILLLLZI, z);
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }

                {
                    this.LJLIL = this;
                    this.LJLILLLLZI = str;
                    this.LJLJI = c43731nd;
                }
            }, ((C35591aV) this.LJLJJI).LIZJ);
            ((HashMap) this.LJLJL).put(str, runnableC09050Xd);
            ((C35591aV) this.LJLJJI).LIZ.execute(runnableC09050Xd);
            C0VW LIZ2 = C0VW.LIZ();
            C16880lQ.LLLZ("%s: processing %s", new Object[]{C16880lQ.LJLLJ(C1OR.class), str});
            LIZ2.getClass();
            return true;
        }
    }

    public C1OR(Context context, C0CW c0cw, C35591aV c35591aV, WorkDatabase workDatabase, List list) {
        this.LJLILLLLZI = context;
        this.LJLJI = c0cw;
        this.LJLJJI = c35591aV;
        this.LJLJJL = workDatabase;
        this.LJLJLJ = list;
    }
}
