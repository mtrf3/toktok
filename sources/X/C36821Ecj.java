package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.lang.reflect.Type;

/* renamed from: X.Ecj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36821Ecj<T> {
    public final T LIZ;
    public final String LIZIZ;

    public final T LIZ() {
        T stringSet;
        SharedPreferences LIZIZ = LIZIZ();
        try {
            Class<?> cls = this.LIZ.getClass();
            if (cls == String.class) {
                stringSet = (T) LIZIZ.getString(this.LIZIZ, (String) this.LIZ);
            } else if (cls == Integer.class) {
                stringSet = Integer.valueOf(LIZIZ.getInt(this.LIZIZ, ((Integer) this.LIZ).intValue()));
            } else if (cls == Float.class) {
                stringSet = Float.valueOf(LIZIZ.getFloat(this.LIZIZ, ((Float) this.LIZ).floatValue()));
            } else if (cls == Long.class) {
                stringSet = Long.valueOf(LIZIZ.getLong(this.LIZIZ, ((Long) this.LIZ).longValue()));
            } else if (cls == Boolean.class) {
                stringSet = Boolean.valueOf(LIZIZ.getBoolean(this.LIZIZ, ((Boolean) this.LIZ).booleanValue()));
            } else if (java.util.Set.class.isAssignableFrom(cls)) {
                stringSet = LIZIZ.getStringSet(this.LIZIZ, (java.util.Set) this.LIZ);
            } else {
                throw new AssertionError();
            }
            if (stringSet == null) {
                LIZJ(this.LIZ);
                stringSet = this.LIZ;
            }
            return stringSet.getClass() != this.LIZ.getClass() ? this.LIZ : (T) stringSet;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return this.LIZ;
        }
    }

    public SharedPreferences LIZIZ() {
        return SharePrefCache.inst().getSharePref();
    }

    public final void LIZJ(Object obj) {
        if (obj == null) {
            return;
        }
        SharedPreferences.Editor edit = LIZIZ().edit();
        if (obj instanceof String) {
            edit.putString(this.LIZIZ, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(this.LIZIZ, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            edit.putFloat(this.LIZIZ, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(this.LIZIZ, ((Long) obj).longValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(this.LIZIZ, ((Boolean) obj).booleanValue());
        } else if (obj instanceof java.util.Set) {
            edit.putStringSet(this.LIZIZ, (java.util.Set) obj);
        }
        edit.apply();
    }

    public final void LIZLLL(T t) {
        if (t == null) {
            return;
        }
        LIZJ(t);
    }

    public C36821Ecj(String str, Type type) {
        type.getClass();
        this.LIZ = null;
        this.LIZIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(SharedPreferences.Editor editor, T t) {
        if (editor != null) {
            if (t instanceof String) {
                editor.putString(this.LIZIZ, (String) t);
                return;
            }
            if (t instanceof Integer) {
                editor.putInt(this.LIZIZ, ((Integer) t).intValue());
                return;
            }
            if (t instanceof Float) {
                editor.putFloat(this.LIZIZ, ((Float) t).floatValue());
                return;
            }
            if (t instanceof Long) {
                editor.putLong(this.LIZIZ, ((Long) t).longValue());
                return;
            } else if (t instanceof Boolean) {
                editor.putBoolean(this.LIZIZ, ((Boolean) t).booleanValue());
                return;
            } else {
                if (!(t instanceof java.util.Set)) {
                    return;
                }
                editor.putStringSet(this.LIZIZ, (java.util.Set) t);
                return;
            }
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    public C36821Ecj(String str, T t) {
        t.getClass();
        this.LIZ = t;
        this.LIZIZ = str;
    }
}
