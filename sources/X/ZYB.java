package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class ZYB extends BroadcastReceiver {
    public final /* synthetic */ ZYD LIZ;

    public ZYB(ZYD zyd) {
        this.LIZ = zyd;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.LIZ.LIZ();
        } else {
            C38523F9z.LIZ();
            this.LIZ.LIZ();
        }
    }
}
