package X;

import Y.ARunnableS16S1100000_15;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class X3N extends BroadcastReceiver {
    public static final String LIZ = C16880lQ.LJLLJ(X3N.class);

    public static void LIZ(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZ, "onReceive", "Action:android.net.conn.CONNECTIVITY_CHANGE");
            }
            if (!C84212X3g.LJJJI) {
                return;
            }
            long j = 2000;
            long LJIIJ = X4H.LJFF.LJIIJ("delay_refresh_unsuccess_task_ms", 2000L);
            if (LJIIJ > 0) {
                j = LJIIJ;
            }
            C84212X3g.LJJIIZ(new ARunnableS16S1100000_15(context, action, 5), j, TimeUnit.MILLISECONDS);
            return;
        }
        if (!action.equals("android.intent.action.MEDIA_UNMOUNTED") && !action.equals("android.intent.action.MEDIA_REMOVED") && !action.equals("android.intent.action.MEDIA_BAD_REMOVAL") && !action.equals("android.intent.action.MEDIA_EJECT")) {
            return;
        }
        C84212X3g.LJJIII(new ARunnableS16S1100000_15(context, action, 6));
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
