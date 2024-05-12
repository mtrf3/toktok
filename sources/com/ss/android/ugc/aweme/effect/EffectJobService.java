package com.ss.android.ugc.aweme.effect;

import X.C10K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38995FSd;
import X.C66163Pxv;
import X.C84763XOl;
import Y.ACallableS24S0001000_6;
import Y.AgS123S0100000_6;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* loaded from: classes7.dex */
public class EffectJobService extends Service {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!AVExternalServiceImpl.LIZ().configService().cacheConfig().isHasEffectCache()) {
            return;
        }
        C10K.LIZIZ(new ACallableS24S0001000_6(1, 5), C38995FSd.LIZLLL(), null).LJIILLIIL(new AgS123S0100000_6(this, 1), C10K.LJIIIIZZ);
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
