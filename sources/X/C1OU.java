package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1OU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OU extends AbstractC08530Vd {
    public static C1OU LJIIIZ;
    public static C1OU LJIIJ;
    public static final Object LJIIJJI;
    public Context LIZ;
    public C0CW LIZIZ;
    public WorkDatabase LIZJ;
    public InterfaceC23750wV LIZLLL;
    public List<C0XZ> LJ;
    public C1OR LJFF;
    public C20490rF LJI;
    public boolean LJII;
    public BroadcastReceiver.PendingResult LJIIIIZZ;

    static {
        C0VW.LIZIZ("WorkManagerImpl");
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = new Object();
    }

    public static C1OU LIZLLL() {
        synchronized (LJIIJJI) {
            C1OU c1ou = LJIIIZ;
            if (c1ou != null) {
                return c1ou;
            }
            return LJIIJ;
        }
    }

    public final void LJI() {
        synchronized (LJIIJJI) {
            this.LJII = true;
            BroadcastReceiver.PendingResult pendingResult = this.LJIIIIZZ;
            if (pendingResult != null) {
                pendingResult.finish();
                this.LJIIIIZZ = null;
            }
        }
    }

    public final void LJII() {
        List<JobInfo> LJFF;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.LIZ;
            JobScheduler jobScheduler = (JobScheduler) C16880lQ.LLILL(context, "jobscheduler");
            if (jobScheduler != null && (LJFF = C32741Qg.LJFF(context, jobScheduler)) != null) {
                ArrayList arrayList = (ArrayList) LJFF;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C32741Qg.LIZLLL(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
            }
        }
        C1Y1 c1y1 = (C1Y1) this.LIZJ.LJJ();
        c1y1.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = c1y1.LJIIIIZZ.LIZ();
        c1y1.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            c1y1.LIZ.LJIILLIIL();
            c1y1.LIZ.LJIIJJI();
            c1y1.LJIIIIZZ.LIZJ(LIZ);
            C09020Xa.LIZ(this.LIZIZ, this.LIZJ, this.LJ);
        } catch (Throwable th) {
            c1y1.LIZ.LJIIJJI();
            c1y1.LJIIIIZZ.LIZJ(LIZ);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1OU LJ(Context context) {
        C1OU LIZLLL;
        synchronized (LJIIJJI) {
            LIZLLL = LIZLLL();
            if (LIZLLL == null) {
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LLLLL instanceof C0CV) {
                    LJFF(LLLLL, ((C0CV) LLLLL).LIZ());
                    LIZLLL = LJ(LLLLL);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.AbstractC08530Vd
    public final C1OQ LIZIZ(final String str) {
        AbstractRunnableC20450rB abstractRunnableC20450rB = new AbstractRunnableC20450rB() { // from class: X.1Yd
            @Override // X.AbstractRunnableC20450rB
            public final void LIZIZ() {
                WorkDatabase workDatabase = C1OU.this.LIZJ;
                workDatabase.LIZJ();
                try {
                    Iterator it = ((ArrayList) ((C1Y1) workDatabase.LJJ()).LJII(str)).iterator();
                    while (it.hasNext()) {
                        AbstractRunnableC20450rB.LIZ(C1OU.this, (String) it.next());
                    }
                    workDatabase.LJIILLIIL();
                    workDatabase.LJIIJJI();
                    C1OU c1ou = C1OU.this;
                    C09020Xa.LIZ(c1ou.LIZIZ, c1ou.LIZJ, c1ou.LJ);
                } catch (Throwable th) {
                    workDatabase.LJIIJJI();
                    throw th;
                }
            }
        };
        ((C35591aV) this.LIZLLL).LIZ(abstractRunnableC20450rB);
        return abstractRunnableC20450rB.LJLIL;
    }

    public final C0VZ LIZJ(List<? extends AbstractC08550Vf> list) {
        if (!list.isEmpty()) {
            return new C50591yh(this, null, C0VS.KEEP, list).LLLLZ();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void LJIIIZ(String str) {
        ((C35591aV) this.LIZLLL).LIZ(new RunnableC20540rK(this, str, false));
    }

    public static void LJFF(Context context, C0CW c0cw) {
        synchronized (LJIIJJI) {
            if (LJIIIZ != null) {
                if (LJIIJ != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } else {
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LJIIJ == null) {
                    LJIIJ = new C1OU(LLLLL, c0cw, new C35591aV(c0cw.LIZIZ));
                }
                LJIIIZ = LJIIJ;
            }
        }
    }

    public final void LJIIIIZZ(final String str, final C0CT c0ct) {
        ((C35591aV) this.LIZLLL).LIZ(new Runnable(this, str, c0ct) { // from class: X.0rJ
            public final C1OU LJLIL;
            public final String LJLILLLLZI;
            public final C0CT LJLJI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    this.LJLIL.LJFF.LJII(this.LJLILLLLZI, this.LJLJI);
                } finally {
                    if (LIZ) {
                    }
                }
            }

            {
                this.LJLIL = this;
                this.LJLILLLLZI = str;
                this.LJLJI = c0ct;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0173, code lost:
    
        if (r4 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1OU(android.content.Context r15, X.C0CW r16, X.C35591aV r17) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1OU.<init>(android.content.Context, X.0CW, X.1aV):void");
    }

    @Override // X.AbstractC08530Vd
    public final C50591yh LIZ(String str, C0VS c0vs, List list) {
        if (!list.isEmpty()) {
            return new C50591yh(this, str, c0vs, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
}
