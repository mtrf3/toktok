package com.aweme.storage;

import X.C10I;
import X.C10K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38995FSd;
import X.C66163Pxv;
import X.C84763XOl;
import Y.IDCallableS414S0100000;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import com.aweme.storage.CompatJobService;

/* loaded from: classes.dex */
public class CompatJobService extends android.app.job.JobService {
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
    public final boolean onStartJob(final JobParameters jobParameters) {
        C10K.LIZIZ(new IDCallableS414S0100000(this, 3), C38995FSd.LIZLLL(), null).LJIILLIIL(new C10I<String, String>() { // from class: X.1FG
            @Override // X.C10I
            public final String then(C10K<String> c10k) {
                CompatJobService compatJobService = CompatJobService.this;
                if (compatJobService != null) {
                    C10K.LIZIZ(new IDCallableS414S0100000(C16880lQ.LLLLL(compatJobService), 7), C38995FSd.LIZLLL(), null);
                }
                return null;
            }
        }, C10K.LJIIIIZZ).LJFF(new C10I<String, C10K<String>>() { // from class: X.1FF
            @Override // X.C10I
            public final C10K<String> then(C10K<String> c10k) {
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.LJLIL = false;
                return null;
            }
        });
        return true;
    }
}
