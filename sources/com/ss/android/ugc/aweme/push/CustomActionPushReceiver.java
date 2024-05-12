package com.ss.android.ugc.aweme.push;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.IO7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0200000_10;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class CustomActionPushReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Intent intent) {
        if (intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "message_extra");
            if (TextUtils.isEmpty(LLJJIJIIJIL)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(LLJJIJIIJIL);
                String optString = jSONObject.optString("in_app_push", null);
                if (optString != null && TextUtils.equals("live", optString)) {
                    IO7.LIZ(new AqS157S0200000_10(intent, jSONObject, 14));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
