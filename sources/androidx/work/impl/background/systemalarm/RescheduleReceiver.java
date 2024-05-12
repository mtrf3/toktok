package androidx.work.impl.background.systemalarm;

import X.C0VW;
import X.C16880lQ;
import X.C1OU;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        C0VW.LIZIZ("RescheduleReceiver");
    }

    public final void LIZ(Context context, Intent intent) {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Received intent %s", new Object[]{intent});
        LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C1OU LJ = C1OU.LJ(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                LJ.getClass();
                synchronized (C1OU.LJIIJJI) {
                    LJ.LJIIIIZZ = goAsync;
                    if (LJ.LJII) {
                        goAsync.finish();
                        LJ.LJIIIIZZ = null;
                    }
                }
                return;
            } catch (IllegalStateException unused) {
                C0VW.LIZ().getClass();
                return;
            }
        }
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        C16880lQ.LLLL(context, intent2);
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
