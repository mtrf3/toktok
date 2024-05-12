package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CFr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31027CFr extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            boolean z = false;
            if (hashCode != -1676458352) {
                if (hashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && C31026CFq.LIZLLL) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    C31026CFq c31026CFq = C31026CFq.LIZ;
                    if (intExtra == 1 || intExtra == 2) {
                        z = true;
                    }
                    C31026CFq.LJFF = z;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("wireless change:");
                    if (!C31026CFq.LIZIZ) {
                        c31026CFq.LJ();
                    }
                    C19U.LIZJ(LIZ, C31026CFq.LJFF, LIZ, "HeadsetDetector");
                }
            } else if (action.equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                C31026CFq c31026CFq2 = C31026CFq.LIZ;
                if (intent.getIntExtra("state", 0) == 1) {
                    z = true;
                }
                C31026CFq.LJ = z;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("wired change:");
                LIZ2.append(c31026CFq2.LIZ());
                C0NB.LIZIZ("HeadsetDetector", X1D.LIZIZ(LIZ2));
            }
        }
        C31026CFq.LIZ.LIZJ();
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
