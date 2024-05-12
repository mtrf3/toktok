package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;

/* renamed from: X.J0c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48458J0c<T> {
    public final Boolean LIZ;
    public final C48462J0g LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final T LJFF;
    public final Class<T> LJI;

    public C48458J0c(Object obj) {
        this("live-app-core", "play_in_mobile", obj.getClass(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZ(T t) {
        if (this.LIZ.booleanValue()) {
            this.LIZIZ.LJ(this, t);
            return;
        }
        String str = this.LJ;
        if (t == 0) {
            C48457J0b.LIZ(str).edit().remove(this.LIZJ).apply();
            return;
        }
        Class<T> cls = this.LJI;
        if (cls == Boolean.class) {
            C48457J0b.LIZ(str).edit().putBoolean(this.LIZJ, ((Boolean) t).booleanValue()).apply();
            return;
        }
        if (cls == Integer.class) {
            C48457J0b.LIZ(str).edit().putInt(this.LIZJ, ((Integer) t).intValue()).apply();
            return;
        }
        if (cls == Float.class) {
            C48457J0b.LIZ(str).edit().putFloat(this.LIZJ, ((Float) t).floatValue()).apply();
            return;
        }
        if (cls == Long.class) {
            C48457J0b.LIZ(str).edit().putLong(this.LIZJ, ((Long) t).longValue()).apply();
        } else if (cls == Double.class) {
            C48457J0b.LIZ(str).edit().putString(this.LIZJ, String.valueOf(((Double) t).doubleValue())).apply();
        } else if (cls == String.class) {
            C48457J0b.LIZ(str).edit().putString(this.LIZJ, (String) t).apply();
        } else {
            java.util.Map map = (java.util.Map) ((HashMap) C48457J0b.LIZ).get(str);
            if (map != null) {
                map.put(this.LIZJ, t);
            }
            C48457J0b.LIZ(str).edit().putString(this.LIZJ, GsonProtectorUtils.toJson(C48457J0b.LIZIZ, t)).apply();
        }
    }

    public C48458J0c(String str, T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public C48458J0c(String str, String str2, Class<T> cls, T t) {
        this.LIZ = Boolean.TRUE;
        this.LIZIZ = new C48462J0g();
        this.LIZLLL = str;
        this.LJ = str;
        this.LIZJ = str2;
        this.LJFF = t;
        this.LJI = cls;
        if (t == null) {
            if (cls == Integer.class || cls == Short.class) {
                this.LJFF = (T) 0;
                return;
            }
            if (cls == Long.class) {
                this.LJFF = (T) 0L;
                return;
            }
            if (cls == Double.class) {
                this.LJFF = (T) Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            } else if (cls == Float.class) {
                this.LJFF = (T) Float.valueOf(0.0f);
            } else {
                if (cls != Boolean.class) {
                    return;
                }
                this.LJFF = (T) Boolean.FALSE;
            }
        }
    }
}
