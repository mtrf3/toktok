package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class P5T extends BroadcastReceiver {
    public static P5T LIZ;
    public static boolean LIZIZ;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C82727WdP.LJI = "";
            C82727WdP.LJII = "";
            C82727WdP.LJFF(context);
        } else {
            C38523F9z.LIZ();
            C82727WdP.LJI = "";
            C82727WdP.LJII = "";
            C82727WdP.LJFF(context);
        }
    }
}
