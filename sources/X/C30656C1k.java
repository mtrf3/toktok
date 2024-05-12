package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.C1k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30656C1k extends BroadcastReceiver {
    public final C2T LIZ;

    public C30656C1k(C2T c2t) {
        this.LIZ = c2t;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!"android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                return;
            }
            this.LIZ.T6(C16880lQ.LLJJIJIIJIL(intent, "state"));
            return;
        }
        C38523F9z.LIZ();
        if (!"android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            return;
        }
        this.LIZ.T6(C16880lQ.LLJJIJIIJIL(intent, "state"));
    }
}
