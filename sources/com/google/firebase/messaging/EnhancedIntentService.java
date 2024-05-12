package com.google.firebase.messaging;

import X.AbstractC67638Qgc;
import X.BinderC67171QXv;
import X.C35532Dx2;
import X.C38413F5t;
import X.C67159QXj;
import X.C67172QXw;
import X.C67637Qgb;
import X.C67649Qgn;
import X.C84763XOl;
import X.InterfaceC67661Qgz;
import X.ThreadFactoryC39014FSw;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.firebase.messaging.EnhancedIntentService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public abstract class EnhancedIntentService extends Service {
    public Binder binder;
    public final ExecutorService executor;
    public int lastStartId;
    public final Object lock;
    public int runningTasks;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_google_firebase_messaging_EnhancedIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public EnhancedIntentService() {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39014FSw("Firebase-Messaging-Intent-Handle"));
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(pThreadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C67159QXj.LIZIZ(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC67638Qgc<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C67637Qgb.LJ(null);
        }
        final C67649Qgn c67649Qgn = new C67649Qgn();
        this.executor.execute(new Runnable() { // from class: X.QXx
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.lambda$processIntent$0(intent, c67649Qgn);
            }
        });
        return c67649Qgn.LIZ;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.binder == null) {
            this.binder = new BinderC67171QXv(new C67172QXw(this));
        }
        return this.binder;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public static void com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(EnhancedIntentService enhancedIntentService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        enhancedIntentService.com_google_firebase_messaging_EnhancedIntentService__attachBaseContext$___twin___(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, AbstractC67638Qgc abstractC67638Qgc) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, C67649Qgn c67649Qgn) {
        try {
            handleIntent(intent);
        } finally {
            c67649Qgn.LIZIZ(null);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        AbstractC67638Qgc<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.LJIIL()) {
            finishTask(intent);
            return 2;
        }
        processIntent.LIZJ(new Executor() { // from class: X.QXz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new InterfaceC67661Qgz() { // from class: X.QXy
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                EnhancedIntentService.this.lambda$onStartCommand$1(intent, abstractC67638Qgc);
            }
        });
        return 3;
    }
}
