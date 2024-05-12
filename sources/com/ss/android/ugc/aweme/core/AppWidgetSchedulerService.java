package com.ss.android.ugc.aweme.core;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.HandlerC67596Qfw;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.PersistableBundle;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppWidgetSchedulerService extends JobService {
    public HandlerC67596Qfw LJLIL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i;
        PersistableBundle extras;
        if (this.LJLIL == null) {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            o.LJIIIIZZ(applicationContext, "applicationContext");
            this.LJLIL = new HandlerC67596Qfw(applicationContext, this);
        }
        Message message = new Message();
        if (jobParameters != null && (extras = jobParameters.getExtras()) != null) {
            i = extras.getInt("app_widget_action_type");
        } else {
            i = -1;
        }
        message.what = i;
        message.obj = jobParameters;
        HandlerC67596Qfw handlerC67596Qfw = this.LJLIL;
        if (handlerC67596Qfw != null) {
            handlerC67596Qfw.sendMessage(message);
            return true;
        }
        return true;
    }
}
