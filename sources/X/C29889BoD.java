package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;

/* renamed from: X.BoD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29889BoD {
    public static LruCache<String, C29889BoD> LIZJ;
    public final SharedPreferences LIZ;
    public SharedPreferences.Editor LIZIZ;

    public final void LIZ() {
        SharedPreferences.Editor editor = this.LIZIZ;
        if (editor != null) {
            WX6.LIZ(editor);
        }
    }

    public static C29889BoD LIZIZ(Context context) {
        return LIZJ(context, "default_app_sp");
    }

    public C29889BoD(Context context, String str) {
        this.LIZ = F9J.LIZIZ(context, 0, str);
    }

    public static C29889BoD LIZJ(Context context, String str) {
        if (context != null) {
            if (LIZJ == null) {
                LIZJ = new LruCache<>(3);
            }
            C29889BoD c29889BoD = LIZJ.get(str);
            if (c29889BoD == null) {
                C29889BoD c29889BoD2 = new C29889BoD(context, str);
                LIZJ.put(str, c29889BoD2);
                return c29889BoD2;
            }
            return c29889BoD;
        }
        throw new NullPointerException("null context!!");
    }

    public final boolean LJ(String str, boolean z) {
        return ((Boolean) LIZLLL(str, EnumC29921Boj.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    public final int LJFF(String str, int i) {
        return ((Integer) LIZLLL(str, EnumC29921Boj.INTEGER, Integer.valueOf(i))).intValue();
    }

    public final long LJI(String str, long j) {
        return ((Long) LIZLLL(str, EnumC29921Boj.LONG, Long.valueOf(j))).longValue();
    }

    public final void LJII(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = this.LIZ.edit();
        }
        if (obj instanceof String) {
            this.LIZIZ.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            this.LIZIZ.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            this.LIZIZ.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            this.LIZIZ.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            this.LIZIZ.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof java.util.Set) {
            this.LIZIZ.putStringSet(str, (java.util.Set) obj);
        } else {
            this.LIZIZ.putString(str, String.valueOf(obj));
        }
    }

    public final void LJIIIIZZ(Object obj, String str) {
        LJII(obj, str);
        LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LIZLLL(String str, EnumC29921Boj enumC29921Boj, Object obj) {
        switch (enumC29921Boj) {
            case STRING:
                return (T) this.LIZ.getString(str, (String) obj);
            case INTEGER:
                return (T) Integer.valueOf(this.LIZ.getInt(str, ((Integer) obj).intValue()));
            case BOOLEAN:
                return (T) Boolean.valueOf(this.LIZ.getBoolean(str, ((Boolean) obj).booleanValue()));
            case FLOAT:
                return (T) Float.valueOf(this.LIZ.getFloat(str, ((Float) obj).floatValue()));
            case LONG:
                return (T) Long.valueOf(this.LIZ.getLong(str, ((Long) obj).longValue()));
            case STRING_SET:
                return (T) this.LIZ.getStringSet(str, (java.util.Set) obj);
            case ALL:
                return (T) this.LIZ.getAll();
            default:
                return obj;
        }
    }
}
