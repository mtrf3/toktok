package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import X.C10760bY;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class MediaSessionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (context != null) {
                Intent intent2 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
                intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
                C10760bY.LIZ(context).LIZJ(intent2);
                return;
            }
            return;
        }
        C38523F9z.LIZ();
        if (context == null) {
            return;
        }
        Intent intent3 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
        intent3.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        C10760bY.LIZ(context).LIZJ(intent3);
    }
}
