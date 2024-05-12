package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.aOo, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93310aOo extends BroadcastReceiver {
    public final /* synthetic */ C93309aOn LIZ;

    public C93310aOo(C93309aOn c93309aOn) {
        this.LIZ = c93309aOn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Iterator<InterfaceC93307aOl> it = this.LIZ.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        } else {
            C38523F9z.LIZ();
            Iterator<InterfaceC93307aOl> it2 = this.LIZ.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }
}
