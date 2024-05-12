package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;

/* loaded from: classes7.dex */
public class EZN implements Runnable {
    public final String LJLIL;

    public final void LIZ() {
        Context LIZIZ = EF7.LIZIZ();
        try {
            String str = this.LJLIL;
            synchronized (MessageShowHandler.LIZ) {
                SharedPreferences.Editor edit = F9J.LIZIZ(LIZIZ, 0, "app_notify_info").edit();
                edit.putString("notify_list", str);
                edit.commit();
            }
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public EZN(String str) {
        this.LJLIL = str;
    }
}
