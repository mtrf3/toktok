package X;

import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FH7 implements FHP {
    public final java.util.Map<String, j> LIZ;
    public final FHP LIZIZ;

    @Override // X.FHP
    public final java.util.Map<String, ?> getAll() {
        return this.LIZIZ.getAll();
    }

    @Override // X.FHP
    public final void load() {
        this.LIZIZ.load();
    }

    @Override // X.FHP
    public final void LIZ(String str) {
        this.LIZIZ.LIZ(str);
    }

    @Override // X.FHP
    public final boolean LJFF(String str) {
        if (!o.LJ(FHT.LIZIZ(), Boolean.FALSE)) {
            return true;
        }
        if (str != null && this.LIZ.containsKey(str)) {
            return true;
        }
        return this.LIZIZ.LJFF(str);
    }

    @Override // X.FHP
    public final boolean contains(String str) {
        if (!o.LJ(FHT.LIZIZ(), Boolean.FALSE)) {
            return true;
        }
        if (str != null && this.LIZ.containsKey(str)) {
            return true;
        }
        return this.LIZIZ.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FH7(java.util.Map<String, ? extends j> dataSourceMock, FHP fhp) {
        o.LJIIIZ(dataSourceMock, "dataSourceMock");
        this.LIZ = dataSourceMock;
        this.LIZIZ = fhp;
    }

    @Override // X.FHP
    public final void LIZIZ(String str, String str2) {
        this.LIZIZ.LIZIZ(str, str2);
    }

    @Override // X.FHP
    public final void LIZJ(String str, long j) {
        this.LIZIZ.LIZJ(str, j);
    }

    @Override // X.FHP
    public final void LIZLLL(String str, int i) {
        this.LIZIZ.LIZLLL(str, i);
    }

    @Override // X.FHP
    public final void LJ(String str, double d) {
        this.LIZIZ.LJ(str, d);
    }

    @Override // X.FHP
    public final void LJI(String str, boolean z) {
        this.LIZIZ.LJI(str, z);
    }

    @Override // X.FHP
    public final void LJII(String str, float f) {
        this.LIZIZ.LJII(str, f);
    }

    @Override // X.FHP
    public final String[] LJIIIIZZ(String str, String[] strArr) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                return (String[]) configMock.get(str, strArr);
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.LJIIIIZZ(str, strArr);
            }
            Object obj = (j) this.LIZ.get(str);
            if (obj instanceof g) {
                Object[] objArr = new String[0];
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    String LJJIFFI = ((j) it.next()).LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI, "it.asString");
                    objArr = C61898ORa.LJJII(LJJIFFI, objArr);
                }
                return (String[]) objArr;
            }
            return strArr;
        } catch (Throwable unused) {
            return strArr;
        }
    }

    @Override // X.FHP
    public final void LJIIIZ(String str, String[] strArr) {
        this.LIZIZ.LJIIIZ(str, strArr);
    }

    @Override // X.FHP
    public final boolean getBoolean(String str, boolean z) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                Object obj = configMock.get(str, Boolean.valueOf(z));
                o.LJIIIIZZ(obj, "INSTANCE.get(key, defaultValue)");
                return ((Boolean) obj).booleanValue();
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getBoolean(str, z);
            }
            j jVar = this.LIZ.get(str);
            if (jVar != null) {
                return jVar.LJFF();
            }
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // X.FHP
    public final double getDouble(String str, double d) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                Object obj = configMock.get(str, Double.valueOf(d));
                o.LJIIIIZZ(obj, "INSTANCE.get(key, defaultValue)");
                return ((Number) obj).doubleValue();
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getDouble(str, d);
            }
            j jVar = this.LIZ.get(str);
            if (jVar != null) {
                return jVar.LJIIIZ();
            }
            return d;
        } catch (Throwable unused) {
            return d;
        }
    }

    @Override // X.FHP
    public final float getFloat(String str, float f) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                Object obj = configMock.get(str, Float.valueOf(f));
                o.LJIIIIZZ(obj, "INSTANCE.get(key, defaultValue)");
                return ((Number) obj).floatValue();
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getFloat(str, f);
            }
            j jVar = this.LIZ.get(str);
            if (jVar != null) {
                return jVar.LJIIJ();
            }
            return f;
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // X.FHP
    public final int getInt(String str, int i) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                Object obj = configMock.get(str, Integer.valueOf(i));
                o.LJIIIIZZ(obj, "INSTANCE.get(key, defaultValue)");
                return ((Number) obj).intValue();
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getInt(str, i);
            }
            j jVar = this.LIZ.get(str);
            if (jVar != null) {
                return jVar.LJIILJJIL();
            }
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // X.FHP
    public final long getLong(String str, long j) {
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                Object obj = configMock.get(str, Long.valueOf(j));
                o.LJIIIIZZ(obj, "INSTANCE.get(key, defaultValue)");
                return ((Number) obj).longValue();
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getLong(str, j);
            }
            j jVar = this.LIZ.get(str);
            if (jVar != null) {
                return jVar.LJIJJLI();
            }
            return j;
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // X.FHP
    public final String getString(String str, String str2) {
        String LJJIFFI;
        try {
            ConfigMock configMock = ConfigMock.INSTANCE;
            if (configMock.hasMock(str)) {
                return (String) configMock.get(str, str2);
            }
            if (!o.LJ(FHT.LIZIZ(), Boolean.TRUE) && !this.LIZ.containsKey(str)) {
                return this.LIZIZ.getString(str, str2);
            }
            if (this.LIZ.get(str) instanceof m) {
                j jVar = this.LIZ.get(str);
                if (jVar != null) {
                    LJJIFFI = jVar.toString();
                    if (LJJIFFI == null) {
                        return str2;
                    }
                } else {
                    return str2;
                }
            } else {
                j jVar2 = this.LIZ.get(str);
                if (jVar2 != null) {
                    LJJIFFI = jVar2.LJJIFFI();
                    if (LJJIFFI == null) {
                        return str2;
                    }
                } else {
                    return str2;
                }
            }
            return LJJIFFI;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
