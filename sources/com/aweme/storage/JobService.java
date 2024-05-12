package com.aweme.storage;

import X.C10I;
import X.C10K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38995FSd;
import X.C66163Pxv;
import X.C84763XOl;
import Y.IDCallableS414S0100000;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.aweme.storage.JobService;

/* loaded from: classes.dex */
public class JobService extends Service {
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C10K.LIZIZ(new IDCallableS414S0100000(this, 4), C38995FSd.LIZLLL(), null).LJIILLIIL(new C10I<String, String>() { // from class: X.1FI
            @Override // X.C10I
            public final String then(C10K<String> c10k) {
                JobService jobService = JobService.this;
                if (jobService != null) {
                    C10K.LIZIZ(new IDCallableS414S0100000(C16880lQ.LLLLL(jobService), 7), C38995FSd.LIZLLL(), null);
                }
                return null;
            }
        }, C10K.LJIIIIZZ).LJFF(new C10I<String, C10K<String>>() { // from class: X.1FH
            @Override // X.C10I
            public final C10K<String> then(C10K<String> c10k) {
                JobService.this.stopSelf();
                return null;
            }
        });
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
