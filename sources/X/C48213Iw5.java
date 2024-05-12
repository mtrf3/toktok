package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* renamed from: X.Iw5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48213Iw5 extends BroadcastReceiver {
    public RunnableC48214Iw6 LIZ;

    public final void LIZ() {
        RunnableC48214Iw6 runnableC48214Iw6 = this.LIZ;
        if (runnableC48214Iw6 == null || !runnableC48214Iw6.LIZIZ()) {
            return;
        }
        RunnableC48214Iw6 runnableC48214Iw62 = this.LIZ;
        runnableC48214Iw62.LJLJI.getClass();
        FirebaseMessaging.LIZIZ(0L, runnableC48214Iw62);
        C16880lQ.LJJLIIIJL(this.LIZ.LJLJI.LIZLLL, this);
        this.LIZ = null;
    }

    public C48213Iw5(RunnableC48214Iw6 runnableC48214Iw6) {
        this.LIZ = runnableC48214Iw6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ();
        } else {
            C38523F9z.LIZ();
            LIZ();
        }
    }
}
