package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Gaf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41789Gaf extends BroadcastReceiver {
    public boolean LIZ = true;
    public final /* synthetic */ QKF LIZIZ;

    public C41789Gaf(QKF qkf) {
        this.LIZIZ = qkf;
    }

    public final void LIZ(Intent intent) {
        boolean z = false;
        if (this.LIZ) {
            this.LIZ = false;
            return;
        }
        if (intent == null || intent.getBooleanExtra("noConnectivity", false)) {
            return;
        }
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z) {
            Iterator<WeakReference<InterfaceC41790Gag>> it = this.LIZIZ.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC41790Gag interfaceC41790Gag = it.next().get();
                if (interfaceC41790Gag != null) {
                    interfaceC41790Gag.LIZ();
                }
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
