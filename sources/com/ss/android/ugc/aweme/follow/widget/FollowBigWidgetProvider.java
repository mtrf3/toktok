package com.ss.android.ugc.aweme.follow.widget;

import X.C10K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.InterfaceC30442Bx8;
import X.MAV;
import Y.ACallableS86S0200000_9;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowBigWidgetProvider extends MAV {
    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        InterfaceC30442Bx8.W1.LIZ(Boolean.FALSE);
    }

    @Override // X.MAV, android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onEnabled(context);
        InterfaceC30442Bx8.W1.LIZ(Boolean.TRUE);
    }

    @Override // X.MAZ, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            super.onReceive(context, intent);
            if (o.LJ("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE", intent.getAction())) {
                C10K.LIZIZ(new ACallableS86S0200000_9(context, this, 0), C10K.LJI, null);
                return;
            }
            return;
        }
        C38523F9z.LIZ();
        super.onReceive(context, intent);
        if (!o.LJ("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE", intent.getAction())) {
            return;
        }
        C10K.LIZIZ(new ACallableS86S0200000_9(context, this, 0), C10K.LJI, null);
    }
}
