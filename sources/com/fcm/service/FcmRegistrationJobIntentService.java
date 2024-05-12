package com.fcm.service;

import X.C16880lQ;
import X.C32151Nz;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.HG3;
import X.QRM;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.FcmJobIntentService;
import androidx.core.app.JobIntentService;
import com.fcm.FcmPushAdapter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FcmRegistrationJobIntentService extends FcmJobIntentService {
    @Override // androidx.core.app.FcmJobIntentService, androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_fcm_service_FcmRegistrationJobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "key_token");
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getToken = ");
        LIZ.append(LLJJIJIIJIL);
        X1D.LIZIZ(LIZ);
        hg3.getClass();
        try {
            C32151Nz.LJJIJLIJ(this, LLJJIJIIJIL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put("type", FcmPushAdapter.getFcmPush());
            jSONObject.put("token", LLJJIJIIJIL);
            QRM.LJIIIIZZ().getClass();
        } catch (Throwable th) {
            HG3 hg32 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Error = ");
            LIZ2.append(th.getMessage());
            X1D.LIZIZ(LIZ2);
            hg32.getClass();
        }
    }

    public static void com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FcmRegistrationJobIntentService fcmRegistrationJobIntentService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        fcmRegistrationJobIntentService.com_fcm_service_FcmRegistrationJobIntentService__attachBaseContext$___twin___(context);
    }

    public static void enqueueWork(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) FcmRegistrationJobIntentService.class, 101, intent);
    }
}
