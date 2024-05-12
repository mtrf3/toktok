package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.IqA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47846IqA extends BroadcastReceiver {
    public final /* synthetic */ C47845Iq9 LIZ;

    public C47846IqA(C47845Iq9 c47845Iq9) {
        this.LIZ = c47845Iq9;
    }

    public final void LIZ(Intent intent) {
        InterfaceC47893Iqv interfaceC47893Iqv;
        if (intent != null) {
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED") || (interfaceC47893Iqv = this.LIZ.LIZIZ) == null) {
                    return;
                }
                C78253UnR.LJI("PlayerMetrics", "onStatePowerConnected");
                ((C47873Iqb) interfaceC47893Iqv).LIZ.LJI.LIZJ = 0L;
                return;
            }
            InterfaceC47893Iqv interfaceC47893Iqv2 = this.LIZ.LIZIZ;
            if (interfaceC47893Iqv2 == null) {
                return;
            }
            C47873Iqb c47873Iqb = (C47873Iqb) interfaceC47893Iqv2;
            C78253UnR.LJI("PlayerMetrics", "onStatePowerDisconnected");
            c47873Iqb.LIZ.LJI.LIZJ = System.currentTimeMillis();
            C47769Iov c47769Iov = c47873Iqb.LIZ;
            c47769Iov.LJI.LIZ = C47795IpL.LIZ(c47769Iov.LIZ);
            c47873Iqb.LIZ.LJI.getClass();
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
