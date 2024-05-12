package com.ss.android.ugc.aweme.now.shortcut;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.MCT;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowCameraShortcutReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            o.LJIIIZ(context, "context");
            MCT.LIZ("NowCameraShortcutReceiver", "Now camera shortcut added.");
        } else {
            C38523F9z.LIZ();
            o.LJIIIZ(context, "context");
            MCT.LIZ("NowCameraShortcutReceiver", "Now camera shortcut added.");
        }
    }
}
