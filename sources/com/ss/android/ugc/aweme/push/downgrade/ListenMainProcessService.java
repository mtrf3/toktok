package com.ss.android.ugc.aweme.push.downgrade;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C39121FWz;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public class ListenMainProcessService extends Service {
    public Messenger messenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_ugc_aweme_push_downgrade_ListenMainProcessService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_ss_android_ugc_aweme_push_downgrade_ListenMainProcessService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    private void listenerMainProcessAlive(Bundle bundle) {
        IBinder binder;
        if (bundle == null || (binder = bundle.getBinder("main_process_binder")) == null) {
            return;
        }
        Messenger messenger = new Messenger(binder);
        this.messenger = messenger;
        messenger.send(Message.obtain());
        binder.linkToDeath(new C39121FWz(this), 0);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent != null && C16880lQ.LLJJIJI(intent) != null) {
            try {
                listenerMainProcessAlive(C16880lQ.LLJJIJI(intent).getBundle("main_process_bundle"));
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    public static void com_ss_android_ugc_aweme_push_downgrade_ListenMainProcessService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(ListenMainProcessService listenMainProcessService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        listenMainProcessService.com_ss_android_ugc_aweme_push_downgrade_ListenMainProcessService__attachBaseContext$___twin___(context);
    }
}
