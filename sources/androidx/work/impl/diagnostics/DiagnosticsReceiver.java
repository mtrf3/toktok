package androidx.work.impl.diagnostics;

import X.C0VW;
import X.C1NK;
import X.C1NL;
import X.C1OU;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        C0VW.LIZIZ("DiagnosticsRcvr");
    }

    public static void LIZ(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C0VW.LIZ().getClass();
        try {
            C1OU LJ = C1OU.LJ(context);
            C1NL LIZ = new C1NK(DiagnosticsWorker.class).LIZ();
            LJ.getClass();
            LJ.LIZJ(Collections.singletonList(LIZ));
        } catch (IllegalStateException unused) {
            C0VW.LIZ().getClass();
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
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
