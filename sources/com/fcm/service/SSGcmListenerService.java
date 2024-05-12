package com.fcm.service;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.HG3;
import X.QR4;
import X.QRC;
import X.QRM;
import X.QRR;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* loaded from: classes12.dex */
public class SSGcmListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_fcm_service_SSGcmListenerService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    private void sendToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) FcmRegistrationJobIntentService.class);
            intent.putExtra("key_token", str);
            FcmRegistrationJobIntentService.enqueueWork(this, intent);
        } catch (Throwable th) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            th.getMessage();
            hg3.getClass();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        try {
            Map<String, String> LJJJJL = remoteMessage.LJJJJL();
            QR4 LJIIIIZZ = QRM.LJIIIIZZ();
            QRR qrr = LJIIIIZZ.LIZIZ;
            if (qrr == null || TextUtils.isEmpty(qrr.LJIJ)) {
                str = "payload";
            } else {
                str = LJIIIIZZ.LIZIZ.LJIJ;
            }
            String str2 = LJJJJL.get(str);
            ((QRC) QRM.LJI()).LJ(FcmPushAdapter.getFcmPush(), str2);
        } catch (Exception e) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            e.getMessage();
            hg3.getClass();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    public static void com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(SSGcmListenerService sSGcmListenerService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        sSGcmListenerService.com_fcm_service_SSGcmListenerService__attachBaseContext$___twin___(context);
    }
}
