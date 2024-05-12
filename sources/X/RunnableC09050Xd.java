package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC09050Xd implements Runnable {
    public static final /* synthetic */ int LJZI = 0;
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final List<C0XZ> LJLJI;
    public C19380pS LJLJJI;
    public final InterfaceC23750wV LJLJJLL;
    public final C0CW LJLJLJ;
    public final InterfaceC17840my LJLJLLL;
    public final WorkDatabase LJLL;
    public final InterfaceC19390pT LJLLI;
    public final InterfaceC19270pH LJLLILLLL;
    public final InterfaceC19410pV LJLLJ;
    public List<String> LJLLL;
    public String LJLLLL;
    public volatile boolean LJZ;
    public C0CS LJLJL = new C29241Cu();
    public final C43731nd<Boolean> LJLLLLLL = new C43731nd<>();
    public C76L<C0CS> LJLZ = null;
    public ListenableWorker LJLJJL = null;

    static {
        C0VW.LIZIZ("WorkerWrapper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r1.LJIIJ > 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC09050Xd.LIZ():void");
    }

    public final void LJ() {
        this.LJLL.LIZJ();
        try {
            ((C1Y1) this.LJLLI).LJIILL(EnumC08510Vb.ENQUEUED, this.LJLILLLLZI);
            ((C1Y1) this.LJLLI).LJIILJJIL(System.currentTimeMillis(), this.LJLILLLLZI);
            ((C1Y1) this.LJLLI).LJIIJJI(-1L, this.LJLILLLLZI);
            this.LJLL.LJIILLIIL();
        } finally {
            this.LJLL.LJIIJJI();
            LJI(true);
        }
    }

    public final void LJFF() {
        this.LJLL.LIZJ();
        try {
            ((C1Y1) this.LJLLI).LJIILJJIL(System.currentTimeMillis(), this.LJLILLLLZI);
            ((C1Y1) this.LJLLI).LJIILL(EnumC08510Vb.ENQUEUED, this.LJLILLLLZI);
            ((C1Y1) this.LJLLI).LJIIL(this.LJLILLLLZI);
            ((C1Y1) this.LJLLI).LJIIJJI(-1L, this.LJLILLLLZI);
            this.LJLL.LJIILLIIL();
        } finally {
            this.LJLL.LJIIJJI();
            LJI(false);
        }
    }

    public final void LJII() {
        EnumC08510Vb LJFF = ((C1Y1) this.LJLLI).LJFF(this.LJLILLLLZI);
        if (LJFF == EnumC08510Vb.RUNNING) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.LJLILLLLZI});
            LIZ.getClass();
            LJI(true);
            return;
        }
        C0VW LIZ2 = C0VW.LIZ();
        C16880lQ.LLLZ("Status for %s is %s; not doing any work", new Object[]{this.LJLILLLLZI, LJFF});
        LIZ2.getClass();
        LJI(false);
    }

    public final void LJIIIIZZ() {
        this.LJLL.LIZJ();
        try {
            LIZJ(this.LJLILLLLZI);
            C0CY c0cy = ((C29241Cu) this.LJLJL).LIZ;
            ((C1Y1) this.LJLLI).LJIILIIL(this.LJLILLLLZI, c0cy);
            this.LJLL.LJIILLIIL();
        } finally {
            this.LJLL.LJIIJJI();
            LJI(false);
        }
    }

    public final boolean LJIIIZ() {
        if (!this.LJZ) {
            return false;
        }
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Work interrupted for %s", new Object[]{this.LJLLLL});
        LIZ.getClass();
        if (((C1Y1) this.LJLLI).LJFF(this.LJLILLLLZI) == null) {
            LJI(false);
        } else {
            LJI(!r0.isFinished());
        }
        return true;
    }

    public final void LIZLLL() {
        if (!LJIIIZ()) {
            this.LJLL.LIZJ();
            try {
                EnumC08510Vb LJFF = ((C1Y1) this.LJLLI).LJFF(this.LJLILLLLZI);
                ((C34751Xz) this.LJLL.LJIL()).LIZ(this.LJLILLLLZI);
                if (LJFF != null) {
                    if (LJFF == EnumC08510Vb.RUNNING) {
                        LIZIZ(this.LJLJL);
                    } else if (!LJFF.isFinished()) {
                        LJ();
                    }
                } else {
                    LJI(false);
                }
                this.LJLL.LJIILLIIL();
            } finally {
                this.LJLL.LJIIJJI();
            }
        }
        List<C0XZ> list = this.LJLJI;
        if (list != null) {
            Iterator<C0XZ> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZ(this.LJLILLLLZI);
            }
            C09020Xa.LIZ(this.LJLJLJ, this.LJLL, this.LJLJI);
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

    public RunnableC09050Xd(C09040Xc c09040Xc) {
        this.LJLIL = c09040Xc.LIZ;
        this.LJLJJLL = c09040Xc.LIZJ;
        this.LJLJLLL = c09040Xc.LIZIZ;
        this.LJLILLLLZI = c09040Xc.LJFF;
        this.LJLJI = c09040Xc.LJI;
        this.LJLJLJ = c09040Xc.LIZLLL;
        WorkDatabase workDatabase = c09040Xc.LJ;
        this.LJLL = workDatabase;
        this.LJLLI = workDatabase.LJJ();
        this.LJLLILLLL = workDatabase.LJIJ();
        this.LJLLJ = workDatabase.LJJI();
    }

    public final void LIZIZ(C0CS c0cs) {
        if (c0cs instanceof C29261Cw) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Worker result SUCCESS for %s", new Object[]{this.LJLLLL});
            LIZ.getClass();
            if (this.LJLJJI.LIZJ()) {
                LJFF();
                return;
            }
            this.LJLL.LIZJ();
            try {
                ((C1Y1) this.LJLLI).LJIILL(EnumC08510Vb.SUCCEEDED, this.LJLILLLLZI);
                ((C1Y1) this.LJLLI).LJIILIIL(this.LJLILLLLZI, ((C29261Cw) this.LJLJL).LIZ);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((C34711Xv) this.LJLLILLLL).LIZ(this.LJLILLLLZI)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((C1Y1) this.LJLLI).LJFF(str) == EnumC08510Vb.BLOCKED && ((C34711Xv) this.LJLLILLLL).LIZIZ(str)) {
                        C0VW LIZ2 = C0VW.LIZ();
                        C16880lQ.LLLZ("Setting status to enqueued for %s", new Object[]{str});
                        LIZ2.getClass();
                        ((C1Y1) this.LJLLI).LJIILL(EnumC08510Vb.ENQUEUED, str);
                        ((C1Y1) this.LJLLI).LJIILJJIL(currentTimeMillis, str);
                    }
                }
                this.LJLL.LJIILLIIL();
                return;
            } finally {
                this.LJLL.LJIIJJI();
                LJI(false);
            }
        }
        if (c0cs instanceof C29251Cv) {
            C0VW LIZ3 = C0VW.LIZ();
            C16880lQ.LLLZ("Worker result RETRY for %s", new Object[]{this.LJLLLL});
            LIZ3.getClass();
            LJ();
            return;
        }
        C0VW LIZ4 = C0VW.LIZ();
        C16880lQ.LLLZ("Worker result FAILURE for %s", new Object[]{this.LJLLLL});
        LIZ4.getClass();
        if (this.LJLJJI.LIZJ()) {
            LJFF();
        } else {
            LJIIIIZZ();
        }
    }

    public final void LIZJ(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C1Y1) this.LJLLI).LJFF(str2) != EnumC08510Vb.CANCELLED) {
                ((C1Y1) this.LJLLI).LJIILL(EnumC08510Vb.FAILED, str2);
            }
            linkedList.addAll(((C34711Xv) this.LJLLILLLL).LIZ(str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0043, B:15:0x005d, B:17:0x0061, B:19:0x0065, B:21:0x006b, B:22:0x0073, B:30:0x0082, B:32:0x0083, B:38:0x0098, B:39:0x009e, B:24:0x0074, B:25:0x007e, B:5:0x0022, B:7:0x0029), top: B:2:0x0005, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0043, B:15:0x005d, B:17:0x0061, B:19:0x0065, B:21:0x006b, B:22:0x0073, B:30:0x0082, B:32:0x0083, B:38:0x0098, B:39:0x009e, B:24:0x0074, B:25:0x007e, B:5:0x0022, B:7:0x0029), top: B:2:0x0005, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r7) {
        /*
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r6.LJLL
            r0.LIZJ()
            androidx.work.impl.WorkDatabase r0 = r6.LJLL     // Catch: java.lang.Throwable -> L9f
            X.0pT r1 = r0.LJJ()     // Catch: java.lang.Throwable -> L9f
            X.1Y1 r1 = (X.C1Y1) r1     // Catch: java.lang.Throwable -> L9f
            r1.getClass()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r5 = 0
            X.1CD r2 = X.C1CD.LIZJ(r5, r0)     // Catch: java.lang.Throwable -> L9f
            X.0Ba r0 = r1.LIZ     // Catch: java.lang.Throwable -> L9f
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L9f
            X.0Ba r0 = r1.LIZ     // Catch: java.lang.Throwable -> L9f
            android.database.Cursor r1 = X.C25080ye.LIZIZ(r0, r2, r5)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L97
            r4 = 1
            if (r0 == 0) goto L31
            int r0 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L9f
            r2.LIZLLL()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L41
            android.content.Context r1 = r6.LJLIL     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r0 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            X.C20480rE.LIZ(r1, r0, r5)     // Catch: java.lang.Throwable -> L9f
        L41:
            if (r7 == 0) goto L5d
            X.0pT r3 = r6.LJLLI     // Catch: java.lang.Throwable -> L9f
            X.0Vb r2 = X.EnumC08510Vb.ENQUEUED     // Catch: java.lang.Throwable -> L9f
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L9f
            r1[r5] = r0     // Catch: java.lang.Throwable -> L9f
            X.1Y1 r3 = (X.C1Y1) r3     // Catch: java.lang.Throwable -> L9f
            r3.LJIILL(r2, r1)     // Catch: java.lang.Throwable -> L9f
            X.0pT r3 = r6.LJLLI     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L9f
            X.1Y1 r3 = (X.C1Y1) r3     // Catch: java.lang.Throwable -> L9f
            r0 = -1
            r3.LJIIJJI(r0, r2)     // Catch: java.lang.Throwable -> L9f
        L5d:
            X.0pS r0 = r6.LJLJJI     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L83
            androidx.work.ListenableWorker r0 = r6.LJLJJL     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L83
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L83
            X.0my r3 = r6.LJLJLLL     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L9f
            X.1OR r3 = (X.C1OR) r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r3.LJLLI     // Catch: java.lang.Throwable -> L9f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.String, X.0Xd> r0 = r3.LJLJJLL     // Catch: java.lang.Throwable -> L80
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L80
            r0.remove(r2)     // Catch: java.lang.Throwable -> L80
            r3.LJIIIIZZ()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            goto L83
        L80:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L9f
        L83:
            androidx.work.impl.WorkDatabase r0 = r6.LJLL     // Catch: java.lang.Throwable -> L9f
            r0.LJIILLIIL()     // Catch: java.lang.Throwable -> L9f
            androidx.work.impl.WorkDatabase r0 = r6.LJLL
            r0.LJIIJJI()
            X.1nd<java.lang.Boolean> r1 = r6.LJLLLLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.LJIIIIZZ(r0)
            return
        L97:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L9f
            r2.LIZLLL()     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r0 = r6.LJLL
            r0.LJIIJJI()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC09050Xd.LJI(boolean):void");
    }
}
