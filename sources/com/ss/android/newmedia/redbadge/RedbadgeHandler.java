package com.ss.android.newmedia.redbadge;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.QP5;
import X.QPG;
import X.QQQ;
import X.QQS;
import X.X1D;
import Y.ARunnableS30S0200000_11;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public class RedbadgeHandler extends Service implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_ss_android_newmedia_redbadge_RedbadgeHandler__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onHandleIntent(Intent intent) {
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_PushLancet_onHandleIntent(this, intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mHandler = new WeakHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void com_ss_android_newmedia_redbadge_RedbadgeHandler__onHandleIntent$___twin___(Intent intent) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHandleIntent = ");
        LIZ.append(intent);
        X1D.LIZIZ(LIZ);
        if (intent == null) {
            return;
        }
        try {
            if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                QQQ.LIZJ(this).LIZ(C16880lQ.LLJJIJIIJIL(intent, "message_data"));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        QP5.LIZ().LIZJ(new ARunnableS30S0200000_11(this, intent, 14));
        return this.mMessenger.getBinder();
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_push_lancet_PushCrashFixLancet_onHandleIntent(RedbadgeHandler redbadgeHandler, Intent intent) {
        if (intent == null) {
            return;
        }
        redbadgeHandler.com_ss_android_newmedia_redbadge_RedbadgeHandler__onHandleIntent$___twin___(intent);
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(RedbadgeHandler redbadgeHandler, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        redbadgeHandler.com_ss_android_newmedia_redbadge_RedbadgeHandler__attachBaseContext$___twin___(context);
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_PushLancet_onHandleIntent(RedbadgeHandler redbadgeHandler, Intent intent) {
        if (intent == null) {
            return;
        }
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_push_lancet_PushCrashFixLancet_onHandleIntent(redbadgeHandler, intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        QP5.LIZ().LIZJ(new ARunnableS30S0200000_11(this, intent, 13));
        int onStartCommand = super.onStartCommand(intent, i, i2);
        QQS qqs = (QQS) QPG.LIZ(QQS.class);
        if (qqs == null || qqs.LJ()) {
            return 2;
        }
        return onStartCommand;
    }
}
