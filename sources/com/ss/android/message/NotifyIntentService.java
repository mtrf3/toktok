package com.ss.android.message;

import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes12.dex */
public class NotifyIntentService extends IntentService {
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
