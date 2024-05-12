package com.ss.android.newmedia.redbadge;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.QP5;
import X.QP8;
import X.QQR;
import X.QQS;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes12.dex */
public class RedBadgePushProcessService extends Service {
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
        Bundle bundle;
        C66163Pxv.LIZ(this, intent, i, i2);
        if (intent != null) {
            bundle = C16880lQ.LLJJIJI(intent);
        } else {
            bundle = null;
        }
        QQS LIZ = QP8.LIZ();
        QP5.LIZ().LIZJ(new QQR(bundle, LIZ));
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (LIZ == null || LIZ.LJ()) {
            return 2;
        }
        return onStartCommand;
    }
}
