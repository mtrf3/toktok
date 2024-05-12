package com.ss.android.ugc.aweme.scheduler;

import X.AnonymousClass078;
import X.C10K;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C41732GZk;
import X.C5L7;
import X.C84763XOl;
import X.GUH;
import X.GUL;
import X.GVR;
import X.X1D;
import Y.ACallableS42S0000000_7;
import Y.AgS124S0100000_7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (o.LJ(C16880lQ.LLJJIJIIJIL(intent, "DEBUG_MSG"), "MSG_SUCCESS")) {
            GUH.LJIJJ("PublishBroadcastReceiver onReceive success");
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "creation_id");
        if (LLJJIJIIJIL != null) {
            C41732GZk.LIZLLL("clear");
            Context LIZ = C5L7.LIZ();
            C41732GZk.LIZJ(LIZ);
            new AnonymousClass078(LIZ).LIZJ(LLJJIJIIJIL.hashCode(), null);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishBroadcastReceiver onReceive intentCreationId:");
        LIZ2.append(LLJJIJIIJIL);
        GUH.LJIJJ(X1D.LIZIZ(LIZ2));
        C10K.LIZIZ(new ACallableS42S0000000_7(1), GUL.LIZ, null).LJ(new AgS124S0100000_7(new GVR(LLJJIJIIJIL), 19), C10K.LJIIIIZZ, null);
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
