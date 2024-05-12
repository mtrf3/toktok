package X;

import Y.ARunnableS44S0100000_8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class J7U extends BroadcastReceiver {
    public boolean LIZ = true;
    public final /* synthetic */ J7V LIZIZ;

    public J7U(J7V j7v) {
        this.LIZIZ = j7v;
    }

    public final void LIZ(Intent intent) {
        if (this.LIZ) {
            this.LIZ = false;
            return;
        }
        if (intent != null && !intent.getBooleanExtra("noConnectivity", false) && C78886Uxe.LJJIL(this.LIZIZ.LIZJ)) {
            J7V j7v = this.LIZIZ;
            synchronized (j7v) {
                JFV.LIZLLL(new ARunnableS44S0100000_8(j7v, 84), JFV.LIZ(JFV.LIZLLL));
            }
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
