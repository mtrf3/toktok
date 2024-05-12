package com.ss.android.ugc.awemepushlib.di.ies;

import X.C0EH;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C39115FWt;
import X.C66163Pxv;
import X.C84763XOl;
import X.EL2;
import X.FMX;
import X.JBR;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MessageHandler extends MessageReceiverService {
    @Override // com.ss.android.newmedia.message.MessageReceiverService, android.app.IntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.ss.android.newmedia.message.MessageReceiverService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.newmedia.message.MessageReceiverService
    public final void onHandleMessage(Context context, int i, String str, int i2, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("context = [");
        LIZ.append(context);
        LIZ.append("], type = [");
        LIZ.append(i);
        LIZ.append("], obj = [");
        C0EH.LIZLLL(LIZ, str, "], from = [", i2, "], extra = [");
        String LJFF = JBR.LJFF(LIZ, str2, "]", LIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(System.currentTimeMillis());
            LIZ2.append("");
            jSONObject.put("receive_time", X1D.LIZIZ(LIZ2));
            jSONObject.put("message", LJFF);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FMX.LJIILJJIL("push_receive_in_mt", jSONObject);
        EL2.LIZ.LIZ(2);
        C39115FWt.LIZ.getClass();
        MessageShowHandler.LIZJ(context, i, str, i2);
    }
}
