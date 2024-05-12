package com.ss.android.socialbase.downloader.downloader;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C65210PiY;
import X.C66163Pxv;
import X.C84212X3g;
import X.C84763XOl;
import X.InterfaceC84204X2y;
import X.X1D;
import X.X36;
import X.X37;
import X.X4H;
import Y.ARunnableS51S0100000_15;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* loaded from: classes16.dex */
public class DownloadService extends Service {
    public static final String LJLILLLLZI = C16880lQ.LJLLJ(DownloadService.class);
    public InterfaceC84204X2y LJLIL;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C84212X3g.LJIL(this);
        if (C84212X3g.LIZLLL == null) {
            synchronized (C84212X3g.class) {
                if (C84212X3g.LIZLLL == null) {
                    C84212X3g.LIZLLL = new X37();
                }
            }
        }
        X37 x37 = C84212X3g.LIZLLL;
        this.LJLIL = x37;
        x37.LJLIL = new WeakReference<>(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLILLLLZI, "onDestroy", "Run");
        }
        InterfaceC84204X2y interfaceC84204X2y = this.LJLIL;
        if (interfaceC84204X2y != null) {
            ((X36) interfaceC84204X2y).LJLJI = false;
            this.LJLIL = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        boolean z;
        if (C65210PiY.LIZ()) {
            String str = LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DownloadServiceHandler != null:");
            if (this.LJLIL != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C65210PiY.LIZIZ(str, "onBind", X1D.LIZIZ(LIZ));
        }
        InterfaceC84204X2y interfaceC84204X2y = this.LJLIL;
        if (interfaceC84204X2y != null) {
            return interfaceC84204X2y.LIZIZ(intent);
        }
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLILLLLZI, "onStartCommand", "Run");
        }
        try {
            InterfaceC84204X2y interfaceC84204X2y = this.LJLIL;
            if (interfaceC84204X2y != null) {
                interfaceC84204X2y.LIZJ();
            }
        } catch (Throwable unused) {
        }
        ExecutorService LJFF = C84212X3g.LJFF();
        if (LJFF != null) {
            LJFF.execute(new ARunnableS51S0100000_15(this, intent, i, i2, 18));
        }
        if (X4H.LJFF.LJIIIIZZ("switch_not_auto_boot_service", C84212X3g.LJJJIL ? 1 : 0) > 0) {
            return 2;
        }
        return 3;
    }
}
