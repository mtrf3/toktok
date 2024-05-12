package X;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ttnet.org.chromium.base.PowerMonitor;
import java.util.ArrayList;

/* renamed from: X.IvW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48178IvW extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        String action = intent.getAction();
        if (action.equals(PowerMonitor.LJ) || action.equals(PowerMonitor.LJI)) {
            long j = currentTimeMillis - PowerMonitor.LJIIIZ;
            PowerMonitor.LJIIIZ = currentTimeMillis;
            if (j > 10000) {
                N.MyS7kauI();
                return;
            }
            return;
        }
        if (!action.equals(PowerMonitor.LJFF) && !action.equals(PowerMonitor.LJII)) {
            return;
        }
        long j2 = currentTimeMillis - PowerMonitor.LJIIJ;
        PowerMonitor.LJIIJ = currentTimeMillis;
        if (j2 <= 10000) {
            return;
        }
        N.MBffe1lF();
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
