package androidx.work.impl.background.systemalarm;

import X.C0VW;
import X.C16880lQ;
import X.C1OU;
import X.C35532Dx2;
import X.C35591aV;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import Y.IDRunnableS2S0300000;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VW.LIZIZ("ConstrntProxyUpdtRecvr");
    }

    public final void LIZ(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C0VW LIZ2 = C0VW.LIZ();
            C16880lQ.LLLZ("Ignoring unknown action %s", new Object[]{str});
            LIZ2.getClass();
        } else {
            ((C35591aV) C1OU.LJ(context).LIZLLL).LIZ(new IDRunnableS2S0300000(intent, context, goAsync(), 5));
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
