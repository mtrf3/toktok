package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32741Qg implements C0XZ {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Context LJLIL;
    public final JobScheduler LJLILLLLZI;
    public final C1OU LJLJI;
    public final C12290e1 LJLJJI;

    @Override // X.C0XZ
    public final boolean LIZIZ() {
        return true;
    }

    static {
        C0VW.LIZIZ("SystemJobScheduler");
    }

    @Override // X.C0XZ
    public final void LIZ(String str) {
        List<Integer> LJ = LJ(this.LJLIL, this.LJLILLLLZI, str);
        if (LJ != null) {
            ArrayList arrayList = (ArrayList) LJ;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LIZLLL(this.LJLILLLLZI, ((Integer) it.next()).intValue());
                }
                ((C34731Xx) this.LJLJI.LIZJ.LJIJJ()).LIZJ(str);
            }
        }
    }

    @Override // X.C0XZ
    public final void LIZJ(C19380pS... c19380pSArr) {
        int LIZ;
        List<Integer> LJ;
        int LIZIZ;
        WorkDatabase workDatabase = this.LJLJI.LIZJ;
        C20470rD c20470rD = new C20470rD(workDatabase);
        for (C19380pS c19380pS : c19380pSArr) {
            workDatabase.LIZJ();
            try {
                C19380pS LJIIIIZZ = ((C1Y1) workDatabase.LJJ()).LJIIIIZZ(c19380pS.LIZ);
                if (LJIIIIZZ == null) {
                    C0VW LIZ2 = C0VW.LIZ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Skipping scheduling ");
                    LIZ3.append(c19380pS.LIZ);
                    LIZ3.append(" because it's no longer in the DB");
                    X1D.LIZIZ(LIZ3);
                    LIZ2.getClass();
                    workDatabase.LJIILLIIL();
                } else if (LJIIIIZZ.LIZIZ != EnumC08510Vb.ENQUEUED) {
                    C0VW LIZ4 = C0VW.LIZ();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Skipping scheduling ");
                    LIZ5.append(c19380pS.LIZ);
                    LIZ5.append(" because it is no longer enqueued");
                    X1D.LIZIZ(LIZ5);
                    LIZ4.getClass();
                    workDatabase.LJIILLIIL();
                } else {
                    C19300pK LIZ6 = ((C34731Xx) workDatabase.LJIJJ()).LIZ(c19380pS.LIZ);
                    if (LIZ6 != null) {
                        LIZ = LIZ6.LIZIZ;
                    } else {
                        this.LJLJI.LIZIZ.getClass();
                        int i = this.LJLJI.LIZIZ.LJI;
                        synchronized (C20470rD.class) {
                            LIZ = c20470rD.LIZ("next_job_scheduler_id");
                            if (LIZ < 0 || LIZ > i) {
                                ((C34721Xw) c20470rD.LIZ.LJIJI()).LIZIZ(new C19280pI("next_job_scheduler_id", 1));
                                LIZ = 0;
                            }
                        }
                        ((C34731Xx) this.LJLJI.LIZJ.LJIJJ()).LIZIZ(new C19300pK(c19380pS.LIZ, LIZ));
                    }
                    LJI(c19380pS, LIZ);
                    if (Build.VERSION.SDK_INT == 23 && (LJ = LJ(this.LJLIL, this.LJLILLLLZI, c19380pS.LIZ)) != null) {
                        ArrayList arrayList = (ArrayList) LJ;
                        int indexOf = arrayList.indexOf(Integer.valueOf(LIZ));
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                        }
                        if (!arrayList.isEmpty()) {
                            LIZIZ = ((Integer) arrayList.get(0)).intValue();
                        } else {
                            this.LJLJI.LIZIZ.getClass();
                            LIZIZ = c20470rD.LIZIZ(this.LJLJI.LIZIZ.LJI);
                        }
                        LJI(c19380pS, LIZIZ);
                    }
                    workDatabase.LJIILLIIL();
                }
                workDatabase.LJIIJJI();
            } catch (Throwable th) {
                workDatabase.LJIIJJI();
                throw th;
            }
        }
    }

    public C32741Qg(Context context, C1OU c1ou) {
        JobScheduler jobScheduler = (JobScheduler) C16880lQ.LLILL(context, "jobscheduler");
        C12290e1 c12290e1 = new C12290e1(context);
        this.LJLIL = context;
        this.LJLJI = c1ou;
        this.LJLILLLLZI = jobScheduler;
        this.LJLJJI = c12290e1;
    }

    public static void LIZLLL(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZI(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)});
            LIZ.getClass();
        }
    }

    public static List<JobInfo> LJFF(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            C0VW.LIZ().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r8 >= 24) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ec, code lost:
    
        if (r8 < 26) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C19380pS r14, int r15) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741Qg.LJI(X.0pS, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Integer> LJ(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.List r1 = LJFF(r5, r6)
            r6 = 0
            if (r1 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 2
            r5.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r4 = r1.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r3 = r4.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r3.getExtras()
            if (r1 == 0) goto L33
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L33
            if (r0 == 0) goto L33
            java.lang.String r0 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L33
            goto L34
        L33:
            r0 = r6
        L34:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L14
            int r0 = r3.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L14
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741Qg.LJ(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.List");
    }
}
