package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.util.HashMap;

/* renamed from: X.J0d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48459J0d<T> extends C48458J0c<T> {
    public final T LIZIZ() {
        if (this.LIZ.booleanValue()) {
            return (T) this.LIZIZ.LIZLLL(this);
        }
        return (T) C48457J0b.LIZIZ(this);
    }

    public final T LIZJ() {
        T t;
        if (this.LIZ.booleanValue()) {
            T t2 = (T) C48461J0f.LIZIZ.LIZLLL(this);
            if (t2 == null) {
                return (T) this.LIZIZ.LIZLLL(this);
            }
            return t2;
        }
        java.util.Map<String, Object> map = C48460J0e.LIZIZ;
        HashMap hashMap = (HashMap) map;
        if (hashMap.containsKey(this.LIZJ)) {
            t = (T) hashMap.get(this.LIZJ);
        } else {
            Class<T> cls = this.LJI;
            if (cls == Boolean.class) {
                t = (T) Boolean.valueOf(C48460J0e.LIZ().getBoolean(this.LIZJ, ((Boolean) this.LJFF).booleanValue()));
                hashMap.put(this.LIZJ, t);
            } else if (cls == Integer.class || cls == Short.class) {
                t = (T) Integer.valueOf(C48460J0e.LIZ().getInt(this.LIZJ, ((Integer) this.LJFF).intValue()));
                hashMap.put(this.LIZJ, t);
            } else if (cls == Float.class) {
                t = (T) Float.valueOf(C48460J0e.LIZ().getFloat(this.LIZJ, ((Float) this.LJFF).floatValue()));
                hashMap.put(this.LIZJ, t);
            } else if (cls == Long.class) {
                t = (T) Long.valueOf(C48460J0e.LIZ().getLong(this.LIZJ, ((Long) this.LJFF).longValue()));
                hashMap.put(this.LIZJ, t);
            } else if (cls == Double.class) {
                String str = this.LIZJ;
                double doubleValue = ((Double) this.LJFF).doubleValue();
                try {
                    doubleValue = CastDoubleProtector.parseDouble(C48460J0e.LIZ().getString(str, String.valueOf(doubleValue)));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                t = (T) Double.valueOf(doubleValue);
                ((HashMap) C48460J0e.LIZIZ).put(this.LIZJ, t);
            } else if (cls == String.class) {
                t = (T) C48460J0e.LIZ().getString(this.LIZJ, (String) this.LJFF);
                if (t == null) {
                    hashMap.remove(this.LIZJ);
                } else {
                    hashMap.put(this.LIZJ, t);
                }
            } else {
                String str2 = this.LIZJ;
                t = this.LJFF;
                try {
                    if (((HashMap) map).containsKey(str2)) {
                        t = (T) ((HashMap) map).get(str2);
                    } else {
                        Object LJI = C48460J0e.LIZJ.LJI(C48460J0e.LIZ().getString(str2, ""), cls);
                        if (LJI == null) {
                            ((HashMap) map).remove(str2);
                        } else {
                            ((HashMap) map).put(str2, LJI);
                        }
                        t = (T) LJI;
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    ((HashMap) C48460J0e.LIZIZ).remove(str2);
                }
            }
        }
        if (t != null) {
            return t;
        }
        T t3 = (T) C48457J0b.LIZIZ(this);
        LIZ(t3);
        return t3;
    }

    public final void LIZLLL() {
        if (this.LIZ.booleanValue()) {
            C48461J0f.LIZIZ.LJ(this, LIZJ());
        } else {
            C48460J0e.LIZIZ(this, LIZJ());
        }
    }

    public C48459J0d(Object obj) {
        super("random_linkmic_time", "random_linkmic_time", obj.getClass(), obj);
    }

    @Override // X.C48458J0c
    public final void LIZ(T t) {
        if (this.LIZ.booleanValue()) {
            C48461J0f.LIZIZ.LJ(this, t);
        } else {
            C48460J0e.LIZIZ(this, t);
        }
    }

    public final void LJ(T t) {
        super.LIZ(t);
    }

    public C48459J0d(String str, T t) {
        super("live_sdk_core", str, t.getClass(), t);
    }

    public C48459J0d(Class cls, String str) {
        super("tt_live_sdk", str, cls, null);
    }
}
