package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.Ix2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48272Ix2 extends BroadcastReceiver {
    public final InterfaceC48273Ix3 LIZ;

    public C48272Ix2(C48274Ix4 c48274Ix4) {
        this.LIZ = c48274Ix4;
    }

    public final void LIZ(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode != -1454123155 || !action.equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                this.LIZ.LIZ(true);
                return;
            }
            if (!action.equals("android.intent.action.SCREEN_OFF")) {
                return;
            }
            this.LIZ.LIZ(false);
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
