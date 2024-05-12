package com.appsflyer;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.ai;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void com_appsflyer_SingleInstallBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "referrer");
            if (LLJJIJIIJIL != null && ai.values(context).getString("referrer", null) != null) {
                ai.valueOf().AFKeystoreWrapper(context, LLJJIJIIJIL);
                return;
            }
        } catch (Throwable th) {
            AFLogger.valueOf("error in BroadcastReceiver ", th);
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string != null && currentTimeMillis - CastLongProtector.valueOf(string).longValue() < 2000) {
            return;
        }
        AFLogger.valueOf("SingleInstallBroadcastReceiver called");
        ai.valueOf().values(context, intent);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
    }

    public static void com_appsflyer_SingleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(SingleInstallBroadcastReceiver singleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            singleInstallBroadcastReceiver.com_appsflyer_SingleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            singleInstallBroadcastReceiver.com_appsflyer_SingleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(SingleInstallBroadcastReceiver singleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_appsflyer_SingleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(singleInstallBroadcastReceiver, context, intent);
    }
}
