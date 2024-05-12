package com.amazon.device.iap;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ResponseReceiver extends BroadcastReceiver {
    public static final String TAG = C16880lQ.LJLLJ(ResponseReceiver.class);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_amazon_device_iap_ResponseReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void com_amazon_device_iap_ResponseReceiver__onReceive$___twin___(Context context, Intent intent) {
        try {
            d.d().a(context, intent);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error in onReceive: ");
            LIZ.append(e);
            e.b(str, X1D.LIZIZ(LIZ));
        }
    }

    public static void com_amazon_device_iap_ResponseReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(ResponseReceiver responseReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            responseReceiver.com_amazon_device_iap_ResponseReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            responseReceiver.com_amazon_device_iap_ResponseReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_amazon_device_iap_ResponseReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(ResponseReceiver responseReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_amazon_device_iap_ResponseReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(responseReceiver, context, intent);
    }
}
