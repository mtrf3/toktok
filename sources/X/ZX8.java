package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZX8 extends BroadcastReceiver {
    public final Context LIZ;
    public boolean LIZIZ = true;
    public final List<ZX9> LIZJ = new ArrayList();

    public ZX8(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(Intent intent) {
        boolean z;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.LIZIZ != (!intent.getBooleanExtra("noConnectivity", false))) {
            this.LIZIZ = z;
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                ((ZX9) it.next()).LIZJ();
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
