package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Is3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47963Is3 extends BroadcastReceiver {
    public RunnableC48015Ist LIZ;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        LIZIZ(this, context, intent);
    }

    public final synchronized void LIZ(Context context) {
        RunnableC48015Ist runnableC48015Ist = this.LIZ;
        if (runnableC48015Ist == null) {
            return;
        }
        if (!runnableC48015Ist.LIZLLL()) {
            return;
        }
        RunnableC48015Ist runnableC48015Ist2 = this.LIZ;
        runnableC48015Ist2.LJLJJI.LJFF.schedule(runnableC48015Ist2, 0L, TimeUnit.SECONDS);
        C16880lQ.LJJLIIIJL(context, this);
        this.LIZ = null;
    }

    public C47963Is3(RunnableC48015Ist runnableC48015Ist, RunnableC48015Ist runnableC48015Ist2) {
        this.LIZ = runnableC48015Ist2;
    }

    public static void LIZIZ(C47963Is3 c47963Is3, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c47963Is3.LIZ(context);
        } else {
            C38523F9z.LIZ();
            c47963Is3.LIZ(context);
        }
    }
}
