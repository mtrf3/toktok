package com.ss.android.ugc.aweme.push.am;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CrossProcReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        try {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (o.LJ("com.process.fore.back.monitor", intent.getAction())) {
                    intent.getBooleanExtra("status", false);
                }
            } else {
                C38523F9z.LIZ();
                if (o.LJ("com.process.fore.back.monitor", intent.getAction())) {
                    intent.getBooleanExtra("status", false);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
