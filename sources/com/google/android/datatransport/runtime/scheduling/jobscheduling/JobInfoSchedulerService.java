package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC67354Qc2;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C67350Qby;
import X.C67352Qc0;
import X.C67356Qc4;
import X.C67380QcS;
import X.C84763XOl;
import Y.ARunnableS11S0301000_11;
import Y.ARunnableS8S0201000_5;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes12.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        C67350Qby.LIZIZ(applicationContext);
        C67352Qc0 LIZ = AbstractC67354Qc2.LIZ();
        LIZ.LIZIZ(string);
        LIZ.LIZJ(C67356Qc4.LIZIZ(i));
        if (string2 != null) {
            LIZ.LIZIZ = Base64.decode(string2, 0);
        }
        C67380QcS c67380QcS = C67350Qby.LIZ().LIZLLL;
        c67380QcS.LJ.execute(new ARunnableS11S0301000_11(i2, c67380QcS, LIZ.LIZ(), new ARunnableS8S0201000_5(1, this, jobParameters, 12), 4));
        return true;
    }
}
