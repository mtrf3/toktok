package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.loginlog.LoginLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.LogManager;

/* loaded from: classes7.dex */
public final class FQP extends BroadcastReceiver {
    public static void LIZ() {
        HG3.LJIIIIZZ().logout("expired_logout", "sdk_expired_logout");
        if (C55V.LIZIZ == null) {
            synchronized (LogManager.class) {
                if (C55V.LIZIZ == null) {
                    C55V.LIZIZ = new C55V(0);
                }
            }
        }
        C55V c55v = C55V.LIZIZ;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        c55v.getClass();
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = "session_expire";
        loginLog.errorUrl = "";
        loginLog.isSuccess = false;
        loginLog.isLogin = isLogin;
        loginLog.platform = "user_login_out";
        loginLog.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        ArrayList arrayList = c55v.LIZ;
        if (arrayList != null) {
            arrayList.add(loginLog);
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("errorDesc", "session_expire");
        C8HX.LIZIZ("aweme_user_logout", "", c198517qh.LJ());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ();
        } else {
            C38523F9z.LIZ();
            LIZ();
        }
    }
}
