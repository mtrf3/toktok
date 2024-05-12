package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS28S0010000_15;

/* loaded from: classes16.dex */
public final class Y74 extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String action;
        boolean z = true;
        if (!Y75.LIZLLL && !Y75.LJ && Y75.LIZ()) {
            C2VP.LIZIZ(new AqS28S0010000_15(true, 0));
        }
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1676458352) {
                if (hashCode != 545516589 || !action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || !Y75.LIZJ) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra != 1 && intExtra != 2) {
                    z = false;
                }
                if (Y75.LJ == z) {
                    return;
                }
                Y75.LJ = z;
                C2VP.LIZIZ(new AqS28S0010000_15(z, 0));
                return;
            }
            if (!action.equals("android.intent.action.HEADSET_PLUG") || !intent.hasExtra("state")) {
                return;
            }
            if (intent.getIntExtra("state", 0) != 1) {
                z = false;
            }
            if (Y75.LIZLLL == z) {
                return;
            }
            Y75.LIZLLL = z;
            C2VP.LIZIZ(new AqS28S0010000_15(z, 1));
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
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
