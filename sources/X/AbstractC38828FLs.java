package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.FLs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38828FLs {
    public String LIZ;

    public abstract void LJII();

    public AbstractC38828FLs() {
        LJII();
    }

    public final SharedPreferences LIZLLL(Context context) {
        if (context == null) {
            return null;
        }
        if (!TextUtils.isEmpty(this.LIZ)) {
            return F9J.LIZIZ(context, 0, this.LIZ);
        }
        throw new IllegalStateException("filename can not bo null");
    }

    public final long LIZIZ(Context context, String str) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return 0L;
        }
        return LIZLLL.getLong(str, 0L);
    }

    public final String LJ(Context context, String str) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return null;
        }
        return LIZLLL.getString(str, "");
    }

    public final String LJFF(Context context, String str) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return null;
        }
        return LIZLLL.getString(str, "");
    }

    public final boolean LIZ(Context context, String str, boolean z) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return false;
        }
        return LIZLLL.getBoolean(str, z);
    }

    public final Object LIZJ(Context context, Class cls, String str) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return null;
        }
        String string = LIZLLL.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JsonParseUtils.LIZJ(cls, string);
        } catch (Error e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }

    public final void LJI(Context context, String str, boolean z) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return;
        }
        SharedPreferences.Editor edit = LIZLLL.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void LJIIIIZZ(Context context, String str, int i) {
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, this.LIZ).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void LJIIIZ(Context context, String str, long j) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return;
        }
        SharedPreferences.Editor edit = LIZLLL.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public final void LJIIJ(Context context, Object obj, String str) {
        try {
            SharedPreferences LIZLLL = LIZLLL(context);
            if (LIZLLL == null || obj == null) {
                return;
            }
            SharedPreferences.Editor edit = LIZLLL.edit();
            edit.putString(str, JsonParseUtils.LIZLLL(obj));
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJJI(Context context, String str, String str2) {
        SharedPreferences LIZLLL = LIZLLL(context);
        if (LIZLLL == null) {
            return;
        }
        SharedPreferences.Editor edit = LIZLLL.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
