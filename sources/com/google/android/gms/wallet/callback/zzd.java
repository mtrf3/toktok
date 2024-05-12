package com.google.android.gms.wallet.callback;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.HandlerC67288Qay;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public abstract class zzd extends Service {
    public Messenger LJLIL = new Messenger(new HandlerC67288Qay(this, C16880lQ.LLJJJJ()));
    public ExecutorService LJLILLLLZI;

    public abstract void LIZ(CallbackInput callbackInput);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.LJLIL = new Messenger(new HandlerC67288Qay(this, C16880lQ.LLJJJJ()));
        this.LJLILLLLZI = Executors.unconfigurableExecutorService(PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("/callback/zzd")));
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.LJLIL.getBinder();
    }
}
