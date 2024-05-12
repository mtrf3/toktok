package com.google.android.gms.measurement;

import X.AbstractC07890Sr;
import X.BinderC68232QqC;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C67280Qaq;
import X.C67597Qfx;
import X.C68033Qmz;
import X.C68241QqL;
import X.C84763XOl;
import X.InterfaceC67599Qfz;
import X.RunnableC67603Qg3;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;

/* loaded from: classes12.dex */
public final class AppMeasurementService extends Service implements InterfaceC67599Qfz {
    public C67597Qfx LJLIL;

    public final C67597Qfx LIZ() {
        if (this.LJLIL == null) {
            this.LJLIL = new C67597Qfx(this);
        }
        return this.LJLIL;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C68033Qmz.LJIIZILJ(LIZ().LIZ, null, null).LIZJ().LJIILIIL.LIZ("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C68033Qmz.LJIIZILJ(LIZ().LIZ, null, null).LIZJ().LJIILIIL.LIZ("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // X.InterfaceC67599Qfz
    public final boolean LJIJJLI(int i) {
        return stopSelfResult(i);
    }

    @Override // X.InterfaceC67599Qfz
    public final void LJIL(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = AbstractC07890Sr.LJLIL;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
            }
        }
    }

    @Override // X.InterfaceC67599Qfz
    public final void LJJ(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
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
        C67597Qfx LIZ = LIZ();
        if (intent == null) {
            LIZ.LIZJ().LJFF.LIZ("onBind called with null intent");
        } else {
            LIZ.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new BinderC68232QqC(C68241QqL.LJJIZ(LIZ.LIZ));
            }
            LIZ.LIZJ().LJIIIIZZ.LIZIZ(action, "onBind received unknown action");
        }
        return null;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        LIZ().LIZ(intent);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        LIZ().LIZIZ(intent);
        return true;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        final C67597Qfx LIZ = LIZ();
        final C67280Qaq LIZJ = C68033Qmz.LJIIZILJ(LIZ.LIZ, null, null).LIZJ();
        if (intent == null) {
            LIZJ.LJIIIIZZ.LIZ("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        LIZJ.LJIILIIL.LIZJ(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: X.Qfy
            public final void LIZ() {
                C67597Qfx c67597Qfx = C67597Qfx.this;
                int i3 = i2;
                C67280Qaq c67280Qaq = LIZJ;
                Intent intent2 = intent;
                if (((InterfaceC67599Qfz) c67597Qfx.LIZ).LJIJJLI(i3)) {
                    c67280Qaq.LJIILIIL.LIZIZ(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    c67597Qfx.LIZJ().LJIILIIL.LIZ("Completed wakeful intent.");
                    ((InterfaceC67599Qfz) c67597Qfx.LIZ).LJIL(intent2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        };
        C68241QqL LJJIZ = C68241QqL.LJJIZ(LIZ.LIZ);
        LJJIZ.LIZIZ().LJIILIIL(new RunnableC67603Qg3(LJJIZ, runnable));
        return 2;
    }
}
