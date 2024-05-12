package com.ss.android.push.window.oppo;

import X.C16880lQ;
import X.C35532Dx2;
import X.C36916EeG;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ScreenReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Logger.debug();
            if ("android.intent.action.USER_PRESENT".equals(action) && C36916EeG.LIZIZ(context).LIZJ() && C36916EeG.LIZIZ(context).LJ && C36916EeG.LIZIZ(context).LIZ() != null) {
                C36916EeG.LJI.getClass();
            }
        } catch (Exception e) {
            if (Logger.debug()) {
                C16880lQ.LLLLIIL(e);
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
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
