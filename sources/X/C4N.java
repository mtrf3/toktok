package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C4N extends BroadcastReceiver {
    public final InterfaceC65784Pro<C76800UCe> LIZ;

    public C4N(C4Q onChanged) {
        o.LJIIIZ(onChanged, "onChanged");
        this.LIZ = onChanged;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (o.LJ(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
                this.LIZ.invoke();
            }
        } else {
            C38523F9z.LIZ();
            if (!o.LJ(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
                return;
            }
            this.LIZ.invoke();
        }
    }
}
