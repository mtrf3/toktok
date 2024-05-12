package X;

import android.content.SharedPreferences;

/* renamed from: X.EdR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36865EdR {
    public boolean LIZ;
    public SharedPreferences LIZIZ;
    public SharedPreferences.Editor LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LIZ(String str, T t) {
        if (t instanceof String) {
            return (T) this.LIZIZ.getString(str, (String) t);
        }
        if (t instanceof Integer) {
            return (T) Integer.valueOf(this.LIZIZ.getInt(str, ((Integer) t).intValue()));
        }
        if (t instanceof Boolean) {
            return (T) Boolean.valueOf(this.LIZIZ.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Float) {
            return (T) Float.valueOf(this.LIZIZ.getFloat(str, ((Float) t).floatValue()));
        }
        if (t instanceof Long) {
            return (T) Long.valueOf(this.LIZIZ.getLong(str, ((Long) t).longValue()));
        }
        return (T) this.LIZIZ.getString(str, null);
    }

    public final void LIZIZ(String str, boolean z, Object obj) {
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = this.LIZIZ.edit();
            }
        }
        if (obj instanceof String) {
            this.LIZJ.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.LIZJ.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.LIZJ.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.LIZJ.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.LIZJ.putLong(str, ((Long) obj).longValue());
        } else if (obj == null) {
            return;
        } else {
            this.LIZJ.putString(str, obj.toString());
        }
        if (z) {
            this.LIZJ.apply();
        } else {
            this.LIZJ.commit();
        }
    }
}
