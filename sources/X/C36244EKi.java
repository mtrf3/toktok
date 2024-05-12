package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EKi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36244EKi {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferences LIZ() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "com.ss.spipe_setting");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…SP, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static QTX LIZJ() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_user");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        String str = "";
        String string = LIZIZ.getString("user_info_raw", "");
        if (string != null) {
            str = string;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                QTX qtx = new QTX(new JSONObject(str));
                qtx.LIZ();
                return qtx;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    public static final void LIZIZ(String str) {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_user");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        LIZIZ.edit().putString("user_info_raw", str).apply();
    }
}
