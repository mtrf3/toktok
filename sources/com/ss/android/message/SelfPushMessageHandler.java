package com.ss.android.message;

import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.QPG;
import X.QQS;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes12.dex */
public class SelfPushMessageHandler extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
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
        int onStartCommand = super.onStartCommand(intent, i, i2);
        QQS qqs = (QQS) QPG.LIZ(QQS.class);
        if (qqs == null || qqs.LJ()) {
            return 2;
        }
        return onStartCommand;
    }
}
