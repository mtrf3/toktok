package X;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.0rC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20460rC implements Runnable {
    public final C50591yh LJLIL;
    public final C1OQ LJLILLLLZI = new C1OQ();

    static {
        C0VW.LIZIZ("EnqueueRunnable");
    }

    public final void LIZ() {
        try {
            C50591yh c50591yh = this.LJLIL;
            c50591yh.getClass();
            if (!C50591yh.LLLLZIL(c50591yh, new HashSet())) {
                WorkDatabase workDatabase = this.LJLIL.LJLIL.LIZJ;
                workDatabase.LIZJ();
                try {
                    boolean LIZIZ = LIZIZ(this.LJLIL);
                    workDatabase.LJIILLIIL();
                    if (LIZIZ) {
                        C20480rE.LIZ(this.LJLIL.LJLIL.LIZ, RescheduleReceiver.class, true);
                        C1OU c1ou = this.LJLIL.LJLIL;
                        C09020Xa.LIZ(c1ou.LIZIZ, c1ou.LIZJ, c1ou.LJ);
                    }
                    this.LJLILLLLZI.LIZ(C0VZ.LIZ);
                    return;
                } finally {
                    workDatabase.LJIIJJI();
                }
            }
            throw new IllegalStateException(C16880lQ.LLLZ("WorkContinuation has cycles (%s)", new Object[]{this.LJLIL}));
        } catch (Throwable th) {
            this.LJLILLLLZI.LIZ(new C1NM(th));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC20460rC(C50591yh c50591yh) {
        this.LJLIL = c50591yh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C50591yh r22) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC20460rC.LIZIZ(X.1yh):boolean");
    }

    public static void LIZJ(C19380pS c19380pS) {
        C0VP c0vp = c19380pS.LJIIIZ;
        String str = c19380pS.LIZJ;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (c0vp.LIZLLL || c0vp.LJ) {
                C0CX c0cx = new C0CX();
                c0cx.LIZIZ(c19380pS.LJ.LIZ);
                ((HashMap) c0cx.LIZ).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                c19380pS.LIZJ = ConstraintTrackingWorker.class.getName();
                c19380pS.LJ = c0cx.LIZ();
            }
        }
    }
}
