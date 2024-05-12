package com.ss.android.ugc.aweme.im.sdk.notification;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C780334l;
import X.C78613UtF;
import X.C84763XOl;
import X.C92903kk;
import X.XKX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class PushQuickActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (context != null) {
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C92903kk(this, context, intent, null), 2);
            }
        } else {
            C38523F9z.LIZ();
            if (context == null) {
                return;
            }
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C92903kk(this, context, intent, null), 2);
        }
    }
}
