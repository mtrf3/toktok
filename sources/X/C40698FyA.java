package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.FyA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40698FyA extends BroadcastReceiver {
    public static C40698FyA LIZIZ;
    public final Context LIZ;

    public final void finalize() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (!C40700FyC.LIZ(this)) {
                C10760bY LIZ = C10760bY.LIZ(this.LIZ);
                o.LJIIIIZZ(LIZ, "getInstance(applicationContext)");
                LIZ.LIZLLL(this);
            }
        } catch (Throwable unused) {
        }
    }

    public C40698FyA(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        this.LIZ = LLLLL;
    }

    public final void LIZ(Intent intent) {
        String LLJJIJIIJIL;
        java.util.Set<String> keySet;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        Bundle bundle = null;
        if (intent == null) {
            LLJJIJIIJIL = null;
        } else {
            try {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "event_name");
            } catch (Throwable unused) {
                return;
            }
        }
        o.LJIILLIIL(LLJJIJIIJIL, "bf_");
        if (intent != null) {
            bundle = C16880lQ.LJJLIIIIJ(intent, "event_args");
        }
        Bundle bundle2 = new Bundle();
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return;
        }
        for (String key : keySet) {
            o.LJIIIIZZ(key, "key");
            bundle2.putString(new OJD("[ -]*$").replace(new OJD("^[ -]*").replace(new OJD("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) C16880lQ.LLJJIII(bundle, key));
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
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
