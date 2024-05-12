package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.Bzg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30600Bzg extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            intent.getAction();
            C10760bY.LIZ(context).LIZJ(intent);
        } else {
            C38523F9z.LIZ();
            intent.getAction();
            C10760bY.LIZ(context).LIZJ(intent);
        }
    }
}
