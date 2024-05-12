package com.ss.android.ugc.aweme.effect;

import X.C10K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38995FSd;
import X.C66163Pxv;
import X.C84763XOl;
import Y.ACallableS41S0000000_6;
import Y.AgS109S0200000_6;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* loaded from: classes7.dex */
public class EffectCompatJobService extends JobService {
    public static volatile boolean LJLIL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        if (!AVExternalServiceImpl.LIZ().configService().cacheConfig().isHasEffectCache()) {
            return false;
        }
        C10K.LIZIZ(new ACallableS41S0000000_6(1), C38995FSd.LIZLLL(), null).LJIILLIIL(new AgS109S0200000_6(this, jobParameters, 1), C10K.LJIIIIZZ);
        return true;
    }
}
