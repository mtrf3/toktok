package com.ss.android.newmedia.message;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38354F3m;
import X.C38413F5t;
import X.C84763XOl;
import X.QP5;
import X.QRG;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS30S0200000_11;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.reflect.Field;

/* loaded from: classes12.dex */
public abstract class MessageReceiverService extends IntentService implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_ss_android_newmedia_message_MessageReceiverService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public abstract void onHandleMessage(Context context, int i, String str, int i2, String str2);

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    private Messenger getMessenger() {
        if (this.mMessenger == null) {
            this.mHandler = new WeakHandler(this);
            this.mMessenger = new Messenger(this.mHandler);
        }
        return this.mMessenger;
    }

    private Handler getServiceHandler() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    private void tryWakeupScreen() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        QRG.LIZIZ().getClass();
        if (!QRG.LIZLLL().LJIIL() || powerManager.isInteractive()) {
            return;
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435462, "MessageReceiverService");
        QRG.LIZIZ().getClass();
        newWakeLock.acquire(QRG.LIZLLL().LJIJI());
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    private String handleMySelfPushIntent(Intent intent) {
        if (intent == null || !"com.ss.android.message".equals(intent.getAction())) {
            return null;
        }
        return C16880lQ.LLJJIJIIJIL(intent, "message_data");
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent != null) {
            QP5.LIZ().LIZJ(new ARunnableS30S0200000_11(this, intent, 12));
        }
        return getMessenger().getBinder();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        try {
            onReceive(this, intent);
        } catch (Throwable unused) {
        }
    }

    public static void com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(MessageReceiverService messageReceiverService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        messageReceiverService.com_ss_android_newmedia_message_MessageReceiverService__attachBaseContext$___twin___(context);
    }

    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        QRG.LIZIZ().getClass();
        if (!QRG.LJ()) {
            return;
        }
        try {
            if (!"com.ss.android.message".equals(action)) {
                return;
            }
            String handleMySelfPushIntent = handleMySelfPushIntent(intent);
            if (!C38354F3m.LJ(handleMySelfPushIntent)) {
                onHandleMessage(context, 1, handleMySelfPushIntent, 2, null);
                tryWakeupScreen();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
            if (getServiceHandler() == null) {
                QP5.LIZ().LIZJ(new ARunnableS14S0201000_11(i2, intent, this, 5));
                return 2;
            }
            return 2;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
