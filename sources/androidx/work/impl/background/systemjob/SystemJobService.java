package androidx.work.impl.background.systemjob;

import X.C0VW;
import X.C0XX;
import X.C16880lQ;
import X.C1OU;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements C0XX {
    public C1OU LJLIL;
    public final Map<String, JobParameters> LJLILLLLZI = new HashMap();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    static {
        C0VW.LIZIZ("SystemJobService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            C1OU LJ = C1OU.LJ(applicationContext);
            this.LJLIL = LJ;
            LJ.LJFF.LIZ(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C0VW.LIZ().getClass();
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1OU c1ou = this.LJLIL;
        if (c1ou != null) {
            c1ou.LJFF.LJFF(this);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.1OU r0 = r8.LJLIL
            r4 = 1
            r7 = 0
            if (r0 != 0) goto L11
            X.0VW r0 = X.C0VW.LIZ()
            r0.getClass()
            r8.jobFinished(r9, r4)
            return r7
        L11:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r1 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L25
            if (r1 == 0) goto L25
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L25
            if (r0 == 0) goto L25
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L25
            goto L26
        L25:
            r2 = r3
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L34
            X.0VW r0 = X.C0VW.LIZ()
            r0.getClass()
            return r7
        L34:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r6 = r8.LJLILLLLZI
            monitor-enter(r6)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> La3
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> La3
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L53
            X.0VW r3 = X.C0VW.LIZ()     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La3
            r0[r7] = r2     // Catch: java.lang.Throwable -> La3
            X.C16880lQ.LLLZ(r1, r0)     // Catch: java.lang.Throwable -> La3
            r3.getClass()     // Catch: java.lang.Throwable -> La3
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La3
            return r7
        L53:
            X.0VW r5 = X.C0VW.LIZ()     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "onStartJob for %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La3
            r0[r7] = r2     // Catch: java.lang.Throwable -> La3
            X.C16880lQ.LLLZ(r1, r0)     // Catch: java.lang.Throwable -> La3
            r5.getClass()     // Catch: java.lang.Throwable -> La3
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> La3
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> La3
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La3
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L9d
            X.0CT r3 = new X.0CT
            r3.<init>()
            android.net.Uri[] r0 = r9.getTriggeredContentUris()
            if (r0 == 0) goto L86
            android.net.Uri[] r0 = r9.getTriggeredContentUris()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.LIZIZ = r0
        L86:
            java.lang.String[] r0 = r9.getTriggeredContentAuthorities()
            if (r0 == 0) goto L96
            java.lang.String[] r0 = r9.getTriggeredContentAuthorities()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.LIZ = r0
        L96:
            r0 = 28
            if (r1 < r0) goto L9d
            r9.getNetwork()
        L9d:
            X.1OU r0 = r8.LJLIL
            r0.LJIIIIZZ(r2, r3)
            return r4
        La3:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            X.1OU r0 = r6.LJLIL
            r5 = 1
            if (r0 != 0) goto Ld
            X.0VW r0 = X.C0VW.LIZ()
            r0.getClass()
            return r5
        Ld:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L20
            if (r1 == 0) goto L20
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L20
            if (r0 == 0) goto L20
            java.lang.String r4 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L20
            goto L21
        L20:
            r4 = 0
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            if (r0 == 0) goto L30
            X.0VW r0 = X.C0VW.LIZ()
            r0.getClass()
            return r3
        L30:
            X.0VW r2 = X.C0VW.LIZ()
            java.lang.String r1 = "onStopJob for %s"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            X.C16880lQ.LLLZ(r1, r0)
            r2.getClass()
            java.util.Map<java.lang.String, android.app.job.JobParameters> r1 = r6.LJLILLLLZI
            monitor-enter(r1)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L5b
            r0.remove(r4)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
            X.1OU r0 = r6.LJLIL
            r0.LJIIIZ(r4)
            X.1OU r0 = r6.LJLIL
            X.1OR r0 = r0.LJFF
            boolean r0 = r0.LIZJ(r4)
            r0 = r0 ^ 1
            return r0
        L5b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        JobParameters jobParameters;
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("%s executed on JobScheduler", new Object[]{str});
        LIZ.getClass();
        synchronized (this.LJLILLLLZI) {
            jobParameters = (JobParameters) ((HashMap) this.LJLILLLLZI).remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
