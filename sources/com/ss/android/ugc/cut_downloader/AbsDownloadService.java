package com.ss.android.ugc.cut_downloader;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.FL6;
import X.FL7;
import X.FL8;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class AbsDownloadService extends Service {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final Map<Integer, List<FL7>> LJLILLLLZI = new LinkedHashMap();
    public final Map<String, FL6> LJLJI = new LinkedHashMap();

    public abstract void LIZ(String str, String str2, FL6 fl6);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (o.LJ("com.ss.android.ugc.cut_downloader.DOWNLOAD", intent.getAction())) {
            return new FL8(this);
        }
        return null;
    }
}
