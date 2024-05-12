package X;

import X.C0M9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class QBT extends BroadcastReceiver {
    public static final AtomicReference<QBT> LIZIZ = new AtomicReference<>();
    public final Context LIZ;

    public final void LIZ() {
        synchronized (C67195QYt.LJIIIZ) {
            Iterator it = ((C0M9.e) C67195QYt.LJIIJJI.values()).iterator();
            while (it.hasNext()) {
                ((C67195QYt) it.next()).LIZLLL();
            }
        }
        C16880lQ.LJJLIIIJL(this.LIZ, this);
    }

    public QBT(Context context) {
        this.LIZ = context;
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
