package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.PQk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64430PQk extends BroadcastReceiver {
    public final /* synthetic */ C64433PQn LIZ;

    public C64430PQk(C64433PQn c64433PQn) {
        this.LIZ = c64433PQn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.LIZ.LIZJ(intent);
            C64432PQm.LIZIZ().LIZLLL();
        } else {
            C38523F9z.LIZ();
            this.LIZ.LIZJ(intent);
            C64432PQm.LIZIZ().LIZLLL();
        }
    }
}
