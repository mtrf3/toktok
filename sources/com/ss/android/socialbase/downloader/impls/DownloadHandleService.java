package com.ss.android.socialbase.downloader.impls;

import X.C35532Dx2;
import X.C38413F5t;
import X.C65210PiY;
import X.C66163Pxv;
import X.C84212X3g;
import X.C84763XOl;
import X.X3C;
import X.X3K;
import X.X3L;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes16.dex */
public class DownloadHandleService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C84212X3g.LJIL(this);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra;
        C66163Pxv.LIZ(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (intExtra = intent.getIntExtra("extra_download_id", 0)) == 0) {
            return 2;
        }
        if (action.equals("com.ss.android.downloader.action.DOWNLOAD_WAKEUP")) {
            if (!C65210PiY.LIZ()) {
                return 2;
            }
            C65210PiY.LJ(intExtra, "DownloadHandleService", "handleIntent", "Retry delay disable");
            return 2;
        }
        if (action.equals("com.ss.android.downloader.action.PROCESS_NOTIFY")) {
            X3K.LJ().LJII(intExtra, true);
            X3L LIZ = X3C.LIZ(true);
            if (LIZ == null) {
                return 2;
            }
            LIZ.LIZ();
            return 2;
        }
        if (!action.equals("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY")) {
            return 2;
        }
        C84212X3g.LJJIFFI();
        return 2;
    }
}
