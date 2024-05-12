package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* renamed from: X.Is5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47965Is5 extends BroadcastReceiver {
    public final /* synthetic */ C47966Is6 LIZ;

    public C47965Is5(C47966Is6 c47966Is6) {
        this.LIZ = c47966Is6;
    }

    public final void LIZ(Intent intent) {
        int i;
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo LJJLI = C16880lQ.LJJLI(this.LIZ.LJIILJJIL);
                synchronized (this.LIZ.LJIIJ) {
                    if (LJJLI != null) {
                        if (LJJLI.isConnected()) {
                            this.LIZ.LIZIZ();
                            this.LIZ.LIZLLL = LJJLI.getTypeName();
                        }
                    } else {
                        this.LIZ.LIZLLL = "DISCONNECTED";
                    }
                    this.LIZ.LIZLLL = "DISCONNECTED";
                }
                if ("DISCONNECTED".equals(this.LIZ.LIZLLL)) {
                    synchronized (this.LIZ.LJIIJJI) {
                        C47966Is6 c47966Is6 = this.LIZ;
                        c47966Is6.LJFF = -2;
                        c47966Is6.LJI = -2;
                    }
                    return;
                }
                return;
            }
            if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction())) {
                synchronized (this.LIZ.LJIIJJI) {
                    int intExtra = intent.getIntExtra("newRssi", -70);
                    C47966Is6 c47966Is62 = this.LIZ;
                    c47966Is62.getClass();
                    if (intExtra <= -88) {
                        i = 0;
                    } else if (intExtra >= -55) {
                        i = 4;
                    } else {
                        i = ((intExtra - (-88)) * 4) / 33;
                    }
                    c47966Is62.LJFF = i;
                }
                return;
            }
            return;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C16880lQ.LLLLIIL(e);
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
