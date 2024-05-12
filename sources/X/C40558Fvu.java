package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.Fvu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40558Fvu extends BroadcastReceiver {
    public final /* synthetic */ AbstractC40557Fvt LIZ;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.LIZ.LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            this.LIZ.LIZ(context, intent);
        }
    }
}
