package com.ss.android.ugc.aweme.common.net;

import X.C2NU;
import X.C2U8;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C48189Ivh;
import X.C76522zQ;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.common.util.NetworkUtils;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class NetworkReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (C2NU.LIZ.LIZIZ()) {
                if (C48189Ivh.LJI(context)) {
                    C2U8.LIZ(new C76522zQ(2));
                    return;
                } else {
                    if (NetworkUtils.isMobile(context)) {
                        C2U8.LIZ(new C76522zQ(1));
                        return;
                    }
                    return;
                }
            }
            C2U8.LIZ(new C76522zQ(0));
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
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
