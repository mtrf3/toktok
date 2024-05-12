package com.appsflyer;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.content.Context;
import com.appsflyer.internal.bq;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_appsflyer_FirebaseMessagingServiceListener__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        new bq(C16880lQ.LLLLL(this)).values(str);
    }

    public static void com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FirebaseMessagingServiceListener firebaseMessagingServiceListener, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        firebaseMessagingServiceListener.com_appsflyer_FirebaseMessagingServiceListener__attachBaseContext$___twin___(context);
    }
}
