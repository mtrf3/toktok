package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;

/* loaded from: classes9.dex */
public final class JFB extends JFC {
    public final SharedPreferences LIZIZ;
    public final SharedPreferences LIZJ;

    public JFB(Context context) {
        if (context != null) {
            this.LIZIZ = F9J.LIZIZ(context, 0, C48841JEv.LJIIJJI());
            this.LIZJ = C48841JEv.LJIIJ(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    @Override // X.JFC
    public final void LIZ(String str) {
        Logger.debug();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = LJ("device_id").edit();
        edit.putString("device_id", str);
        edit.apply();
    }

    @Override // X.JFC
    public final void LIZIZ(String str) {
        SharedPreferences LJ = LJ(str);
        if (LJ != null && LJ.contains(str)) {
            LJ(str).edit().remove(str).commit();
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("SharePreferenceCacheHandler#clear key=", str, " getCachedString(key)=");
        LIZIZ.append(LIZJ(str));
        X1D.LIZIZ(LIZIZ);
        super.LIZIZ(str);
    }

    @Override // X.JFC
    public final String LIZJ(String str) {
        String string = LJ(str).getString(str, null);
        Logger.debug();
        return string;
    }

    public final SharedPreferences LJ(String str) {
        if ("device_id".equals(str)) {
            return this.LIZJ;
        }
        return this.LIZIZ;
    }
}
