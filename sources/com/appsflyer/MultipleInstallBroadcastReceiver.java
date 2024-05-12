package com.appsflyer;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.ai;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
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
        AFLogger.valueOf("MultipleInstallBroadcastReceiver called");
        ai.valueOf().values(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                AFLogger.valueOf("trigger onReceive: class: " + ((PackageItemInfo) resolveInfo.activityInfo).name);
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th2) {
                    AFLogger.valueOf("error in BroadcastReceiver " + ((PackageItemInfo) resolveInfo.activityInfo).name, th2);
                }
            }
        }
    }

    public static void com_appsflyer_MultipleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MultipleInstallBroadcastReceiver multipleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            multipleInstallBroadcastReceiver.com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            multipleInstallBroadcastReceiver.com_appsflyer_MultipleInstallBroadcastReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MultipleInstallBroadcastReceiver multipleInstallBroadcastReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_appsflyer_MultipleInstallBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(multipleInstallBroadcastReceiver, context, intent);
    }
}
