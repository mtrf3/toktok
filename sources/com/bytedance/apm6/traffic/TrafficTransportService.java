package com.bytedance.apm6.traffic;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.PHS;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes8.dex */
public class TrafficTransportService extends Service {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final PHS LJLIL = new PHS();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
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
        PHS phs = this.LJLIL;
        phs.getClass();
        return phs;
    }
}