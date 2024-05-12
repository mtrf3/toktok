package com.ss.android.ugc.awemepushlib;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class PushDirectReplyReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        CharSequence charSequence;
        if (intent == null || context == null) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "content_str");
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null && (charSequence = resultsFromIntent.getCharSequence("key_text_reply")) != null && charSequence.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LLJJIJIIJIL);
            LIZ.append("&reply_text=");
            LIZ.append((Object) charSequence);
            String LIZIZ = X1D.LIZIZ(LIZ);
            Intent intent2 = new Intent();
            intent2.putExtra("reply_content_str", LIZIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getPackageName());
            LIZ2.append(".action.PUSH_DIRECT_REPLY_CONTENT_ACHIEVE");
            intent2.setAction(X1D.LIZIZ(LIZ2));
            intent2.setPackage(context.getPackageName());
            context.sendBroadcast(intent2);
        }
        if (intent.getIntExtra("need_clear_notification_push_id", -1) == -1) {
            return;
        }
        new PushService().clearNotificationId(C16880lQ.LLJJIJIIJIL(intent, "cancel_TAG"), context, intent.getIntExtra("need_clear_notification_push_id", -1));
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
