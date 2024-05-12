package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.s;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.model.ChatUserSetting;

/* renamed from: X.3Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80993Fv {
    public static C80993Fv LIZJ;
    public static volatile long LIZLLL;
    public final SharedPreferences LIZ;
    public final SharedPreferences LIZIZ;

    public static synchronized C80993Fv LIZ() {
        C80993Fv c80993Fv;
        synchronized (C80993Fv.class) {
            long LIZIZ = C36L.LIZIZ();
            if (LIZJ == null || LIZIZ != LIZLLL) {
                synchronized (C80993Fv.class) {
                    if (LIZJ == null || LIZIZ != LIZLLL) {
                        LIZJ = new C80993Fv();
                    }
                }
            }
            c80993Fv = LIZJ;
        }
        return c80993Fv;
    }

    public final ChatUserSetting LIZIZ() {
        try {
            return (ChatUserSetting) C62070OXq.LIZ(ChatUserSetting.class, this.LIZ.getString("chat_user_setting", ""));
        } catch (s e) {
            C16880lQ.LLLLIIL(e);
            C34B.LIZIZ("IMSPUtils", "No cached chat user settings");
            return null;
        }
    }

    public C80993Fv() {
        LIZLLL = C36L.LIZIZ();
        Context LIZIZ = EF7.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("imbase_");
        LIZ.append(LIZLLL);
        this.LIZ = F9J.LIZIZ(LIZIZ, 0, X1D.LIZIZ(LIZ));
        this.LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "iuserstate");
    }

    public final void LIZJ(ChatUserSetting chatUserSetting) {
        this.LIZ.edit().putString("chat_user_setting", C62070OXq.LIZIZ(chatUserSetting)).apply();
    }

    public final void LIZLLL(long j) {
        this.LIZ.edit().putLong("last_relation_fetch_max_time", j).commit();
    }
}
