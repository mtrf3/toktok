package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FJu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38778FJu extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (Build.VERSION.SDK_INT <= 30 && TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS") && o.LJ("homekey", C16880lQ.LLJJIJIIJIL(intent, "reason"))) {
            C38779FJv LIZ = C38779FJv.LIZ();
            AbstractC38780FJw abstractC38780FJw = (AbstractC38780FJw) ((HashMap) LIZ.LIZ).get("attract_user_without_login_home");
            if (abstractC38780FJw != null) {
                if (LIZ.LIZIZ == null) {
                    try {
                        if (C38777FJt.LIZIZ == null) {
                            synchronized (C38777FJt.class) {
                                if (C38777FJt.LIZIZ == null) {
                                    C38777FJt.LIZIZ = new C38777FJt();
                                }
                            }
                        }
                        LIZ.LIZIZ = new JSONObject((String) C38777FJt.LIZIZ.LIZJ(EF7.LIZIZ(), String.class, "ab_test_model"));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                Object opt = LIZ.LIZIZ.opt("attract_user_without_login_home");
                if (opt == null) {
                    opt = abstractC38780FJw.LIZIZ();
                }
                abstractC38780FJw.LIZ(opt);
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
