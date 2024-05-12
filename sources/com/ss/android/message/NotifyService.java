package com.ss.android.message;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.QP5;
import X.QPG;
import X.QQS;
import X.QRS;
import X.QRT;
import Y.ARunnableS47S0100000_11;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes12.dex */
public class NotifyService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        QRT.LIZJ(applicationContext).LIZ();
        QP5.LIZ().LIZJ(new ARunnableS47S0100000_11(this, 36));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            QRS.LJI().LJ();
        } catch (Exception e) {
            try {
                C16880lQ.LLLLIIL(e);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        QP5.LIZ().LIZJ(new ARunnableS47S0100000_11(intent, 37));
        QQS qqs = (QQS) QPG.LIZ(QQS.class);
        if (qqs == null || qqs.LJ()) {
            return 2;
        }
        return onStartCommand;
    }
}
