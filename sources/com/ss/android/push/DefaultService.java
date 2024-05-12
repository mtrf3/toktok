package com.ss.android.push;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes12.dex */
public class DefaultService extends IntentService {
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
    }

    @Override // android.app.IntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public DefaultService() {
        super("DefaultService");
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.IntentService, android.app.Service
    public final IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
