package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.aNi, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93242aNi extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        float f;
        int i;
        o.LJIIJ(context, "context");
        o.LJIIJ(intent, "intent");
        C93243aNj.LIZ = intent.getIntExtra("temperature", -1) / 10;
        C93243aNj.LIZIZ = intent.getIntExtra("level", -1);
        C93243aNj.LIZJ = intent.getIntExtra("scale", -1);
        if (C93243aNj.LIZJ > 0) {
            f = C93243aNj.LIZIZ / C93243aNj.LIZJ;
        } else {
            f = -1;
        }
        C93243aNj.LIZLLL = f;
        C93243aNj.LJ = intent.getIntExtra("status", -1);
        if (C93243aNj.LJ == 2 || C93243aNj.LJ == 5) {
            i = 1;
        } else {
            i = 0;
        }
        C93243aNj.LJFF = i;
        C93243aNj.LJI = intent.getIntExtra("plugged", -1);
        C93243aNj.LJII = intent.getIntExtra("voltage", -1);
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
