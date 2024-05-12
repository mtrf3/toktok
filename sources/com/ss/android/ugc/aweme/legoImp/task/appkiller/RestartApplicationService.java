package com.ss.android.ugc.aweme.legoImp.task.appkiller;

import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.FK6;
import X.FL9;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes7.dex */
public class RestartApplicationService extends Service {
    public final FL9 LJLIL = new FL9();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        int intExtra = intent.getIntExtra("s_FLAG_RESTART_MAIN_PROCESS", 0);
        if (intExtra != 0) {
            new FK6(this, intExtra).start();
        }
        return this.LJLIL;
    }
}
