package com.heytap.msp.push.service;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.X1D;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.b;
import com.heytap.mcssdk.utils.d;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;

/* loaded from: classes28.dex */
public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_heytap_msp_push_service_CompatibleDataMessageCallbackService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_heytap_msp_push_service_CompatibleDataMessageCallbackService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, DataMessage dataMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Receive DataMessageCallbackService:messageTitle: ");
        LIZ.append(dataMessage.getTitle());
        LIZ.append(" ------content:");
        LIZ.append(dataMessage.getContent());
        LIZ.append("------describe:");
        LIZ.append(dataMessage.getDescription());
        d.b(X1D.LIZIZ(LIZ));
    }

    public static void com_heytap_msp_push_service_CompatibleDataMessageCallbackService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(CompatibleDataMessageCallbackService compatibleDataMessageCallbackService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        compatibleDataMessageCallbackService.com_heytap_msp_push_service_CompatibleDataMessageCallbackService__attachBaseContext$___twin___(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        PushService pushService = PushService.a.a;
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        pushService.innerInit(applicationContext);
        Context applicationContext2 = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext2 == null) {
            applicationContext2 = C38891fp.LJLILLLLZI;
        }
        b.a(applicationContext2, intent, this);
        return 2;
    }
}
