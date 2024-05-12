package com.ss.android.ugc.trill.abtest.impl;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.FMX;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        int intExtra = intent.getIntExtra("type", -1);
        if (intExtra != -1) {
            ((NotificationManager) C16880lQ.LLILL(context, "notification")).cancel(intExtra);
        }
        if (action.equals("notification_clicked")) {
            Intent intent2 = new Intent();
            intent2.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent2.setFlags(335544320);
            C16880lQ.LIZJ(context, intent2);
            MobClick obtain = MobClick.obtain();
            obtain.setLabelName("click");
            obtain.setEventName("recall_push");
            FMX.onEvent(obtain);
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
