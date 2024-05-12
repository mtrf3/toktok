package X;

import Y.ACallableS35S1200000_6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F7C extends BroadcastReceiver {
    public final long LIZ = SystemClock.elapsedRealtime();

    public final void LIZ(Context context, Intent intent) {
        o.LJIIJ(context, "context");
        o.LJIIJ(intent, "intent");
        if (SystemClock.elapsedRealtime() - this.LIZ < 30000) {
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        if (o.LJ("android.intent.action.SIM_STATE_CHANGED", action) || o.LJ("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED", action)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimStateChangeReceiver onReceive action:");
            LIZ.append(action);
            String message = X1D.LIZIZ(LIZ);
            o.LJIIJ(message, "message");
            F7E.LJI.getClass();
            F7I f7i = (F7I) F7E.LIZLLL.getValue();
            f7i.getClass();
            C10K.LIZJ(new ACallableS35S1200000_6(f7i, context, "sim_change", 2));
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
