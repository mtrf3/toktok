package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.Iro, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47948Iro extends BroadcastReceiver {
    public final /* synthetic */ C47949Irp LIZ;

    public C47948Iro(C47949Irp c47949Irp) {
        this.LIZ = c47949Irp;
    }

    public final void LIZ(Intent intent) {
        try {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                this.LIZ.LIZ = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
            }
        } catch (Throwable unused) {
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
