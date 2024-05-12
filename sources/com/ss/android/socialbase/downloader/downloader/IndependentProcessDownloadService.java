package com.ss.android.socialbase.downloader.downloader;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84212X3g;
import X.C84763XOl;
import X.InterfaceC84204X2y;
import X.X36;
import X.X3J;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class IndependentProcessDownloadService extends DownloadService {
    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C84212X3g.LJIL(this);
        if (C84212X3g.LJFF == null) {
            C84212X3g.LJJII(new X3J());
        }
        InterfaceC84204X2y LJIILLIIL = C84212X3g.LJIILLIIL();
        this.LJLIL = LJIILLIIL;
        ((X36) LJIILLIIL).LJLIL = new WeakReference<>(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
