package com.google.ar.core;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.C93538aSU;
import X.EnumC93540aSW;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes34.dex */
public final class aa extends BroadcastReceiver {
    public final /* synthetic */ C93538aSU a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com_google_ar_core_aa_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public aa(C93538aSU c93538aSU) {
        this.a = c93538aSU;
    }

    public final void com_google_ar_core_aa__onReceive$___twin___(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && LLJJIJI != null && LLJJIJI.containsKey("install.status")) {
            int i = LLJJIJI.getInt("install.status");
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        return;
                    }
                    this.a.LIZ(EnumC93540aSW.CANCELLED);
                    return;
                }
                this.a.LIZ(EnumC93540aSW.COMPLETED);
                return;
            }
            this.a.LIZ(EnumC93540aSW.ACCEPTED);
        }
    }

    public static void com_google_ar_core_aa_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(aa aaVar, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            aaVar.com_google_ar_core_aa__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            aaVar.com_google_ar_core_aa__onReceive$___twin___(context, intent);
        }
    }

    public static void com_google_ar_core_aa_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(aa aaVar, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_google_ar_core_aa_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(aaVar, context, intent);
    }
}
