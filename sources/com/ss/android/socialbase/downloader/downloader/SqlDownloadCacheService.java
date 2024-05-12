package com.ss.android.socialbase.downloader.downloader;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C65210PiY;
import X.C66163Pxv;
import X.C84212X3g;
import X.C84222X3q;
import X.C84763XOl;
import X.InterfaceC84211X3f;
import X.X1D;
import X.X3Y;
import X.X4H;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes16.dex */
public class SqlDownloadCacheService extends Service {
    public static final String LJLIL = C16880lQ.LJLLJ(SqlDownloadCacheService.class);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        C84212X3g.LJIL(applicationContext);
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
        X3Y x3y;
        InterfaceC84211X3f LJIIJ = C84212X3g.LJIIJ();
        if (LJIIJ instanceof C84222X3q) {
            x3y = ((C84222X3q) LJIIJ).LJLILLLLZI;
        } else if (LJIIJ instanceof X3Y) {
            x3y = (X3Y) LJIIJ;
        } else {
            x3y = null;
        }
        if (x3y instanceof IBinder) {
            return (IBinder) x3y;
        }
        return new Binder();
    }

    public static void LIZ(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, (Class<?>) SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    C16880lQ.LLLJL(context, intent, serviceConnection, 1);
                }
                C16880lQ.LLLL(context, intent);
            } catch (Throwable th) {
                String str = LJLIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Exception:");
                LIZ.append(th.toString());
                C65210PiY.LIZJ(str, "startServiceAndBind", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (X4H.LJFF.LJIIIIZZ("switch_not_auto_boot_service", C84212X3g.LJJJIL ? 1 : 0) > 0) {
            return 2;
        }
        return onStartCommand;
    }
}
