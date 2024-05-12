package X;

import Y.IDRunnableS87S0100000_28;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.ZoE, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public class C91042ZoE extends BroadcastReceiver {
    public final /* synthetic */ C91043ZoF LIZ;

    public C91042ZoE(C91043ZoF c91043ZoF) {
        this.LIZ = c91043ZoF;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.LIZ.LIZ.post(new IDRunnableS87S0100000_28(this, 1));
        } else {
            C38523F9z.LIZ();
            this.LIZ.LIZ.post(new IDRunnableS87S0100000_28(this, 1));
        }
    }
}
