package com.google.android.gms.measurement;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C67280Qaq;
import X.C67597Qfx;
import X.C68033Qmz;
import X.C68241QqL;
import X.C84763XOl;
import X.InterfaceC67599Qfz;
import X.RunnableC67600Qg0;
import X.RunnableC67603Qg3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes12.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC67599Qfz {
    public C67597Qfx LJLIL;

    @Override // X.InterfaceC67599Qfz
    public final void LJIL(Intent intent) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

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
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC67599Qfz
    public final void LJJ(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        LIZ().LIZ(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C67597Qfx LIZ = LIZ();
        C67280Qaq LIZJ = C68033Qmz.LJIIZILJ(LIZ.LIZ, null, null).LIZJ();
        String string = jobParameters.getExtras().getString("action");
        LIZJ.LJIILIIL.LIZIZ(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            RunnableC67600Qg0 runnableC67600Qg0 = new RunnableC67600Qg0(LIZ, LIZJ, jobParameters);
            C68241QqL LJJIZ = C68241QqL.LJJIZ(LIZ.LIZ);
            LJJIZ.LIZIZ().LJIILIIL(new RunnableC67603Qg3(LJJIZ, runnableC67600Qg0));
            return true;
        }
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        LIZ().LIZIZ(intent);
        return true;
    }
}
