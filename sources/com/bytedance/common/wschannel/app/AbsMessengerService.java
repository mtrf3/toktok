package com.bytedance.common.wschannel.app;

import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.QOW;
import X.RunnableC39007FSp;
import Y.ARunnableS47S0100000_11;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public abstract class AbsMessengerService extends Service implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_common_wschannel_app_AbsMessengerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_common_wschannel_app_AbsMessengerService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // android.app.Service
    public void onCreate() {
        RunnableC39007FSp.LIZIZ(new ARunnableS47S0100000_11(this, 18));
        this.mHandler = new WeakHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void tryInitInPushProcess() {
        QOW.LIZIZ(getApplication(), null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public static void com_bytedance_common_wschannel_app_AbsMessengerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AbsMessengerService absMessengerService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        absMessengerService.com_bytedance_common_wschannel_app_AbsMessengerService__attachBaseContext$___twin___(context);
    }
}
