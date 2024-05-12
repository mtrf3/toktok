package com.facebook;

import X.C10760bY;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C66423Q5b;
import X.C66440Q5s;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthenticationTokenManager {
    public static final C66440Q5s LIZLLL = new C66440Q5s();
    public static AuthenticationTokenManager LJ;
    public final C10760bY LIZ;
    public final C66423Q5b LIZIZ;
    public AuthenticationToken LIZJ;

    /* loaded from: classes6.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                o.LJIIIZ(context, "context");
            } else {
                C38523F9z.LIZ();
                o.LJIIIZ(context, "context");
            }
        }
    }

    public AuthenticationTokenManager(C10760bY c10760bY, C66423Q5b c66423Q5b) {
        this.LIZ = c10760bY;
        this.LIZIZ = c66423Q5b;
    }
}
