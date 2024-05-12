package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Y7O extends Y7R {
    public static final Keva LJII = KevaImpl.getRepo("hybrid_settings", 1);
    public JSONObject LIZLLL;
    public long LJ;
    public final AtomicBoolean LJFF;
    public final AtomicBoolean LJI;

    @Override // X.Y7R
    public final void LIZJ() {
        String LJIIIIZZ = LJIIIIZZ(false);
        if (LJIIIIZZ == null) {
            Y7Q y7q = this.LIZ;
            if (y7q != null) {
                y7q.LIZ(null);
                return;
            }
            return;
        }
        Y7Q y7q2 = this.LIZ;
        if (y7q2 == null) {
            return;
        }
        y7q2.LIZ(new C39867Fkl(this.LIZLLL, LJIIIIZZ));
    }

    @Override // X.Y7R
    public final JSONObject LIZ() {
        if (!this.LJFF.get() && !this.LJI.get() && this.LJ != LJI()) {
            Y7W.LJIILIIL.LIZ(new ARunnableS51S0100000_15(this, 90));
        }
        return this.LIZLLL;
    }

    public final long LJI() {
        Keva keva = LJII;
        StringBuilder LIZ = X1D.LIZ();
        return keva.getLong(JBR.LJFF(LIZ, this.LIZIZ, "_version", LIZ), 0L);
    }

    public final String LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        return C0MT.LIZ(LIZ, this.LIZIZ, '_', "LastFetchedTime", LIZ);
    }

    public Y7O(String str) {
        super(str);
        this.LIZLLL = new JSONObject();
        this.LJFF = new AtomicBoolean(false);
        this.LJI = new AtomicBoolean(false);
    }

    @Override // X.Y7R
    public final void LIZLLL(C39867Fkl c39867Fkl) {
        Y7Q y7q = this.LIZ;
        if (y7q != null) {
            y7q.LIZIZ(c39867Fkl);
        }
        this.LIZLLL = c39867Fkl.LIZ;
        LJII(this.LJ, c39867Fkl.LIZIZ);
    }

    @Override // X.Y7R
    public final void LJ(Object value) {
        o.LJIIJ(value, "value");
        if (value instanceof Long) {
            LJII.storeLong(LJFF(), ((Number) value).longValue());
            return;
        }
        if (value instanceof Boolean) {
            LJII.storeBoolean(LJFF(), ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Integer) {
            LJII.storeInt(LJFF(), ((Number) value).intValue());
        } else if (value instanceof Double) {
            LJII.storeDouble(LJFF(), ((Number) value).doubleValue());
        } else {
            LJII.storeString(LJFF(), value.toString());
        }
    }

    public final String LJIIIIZZ(boolean z) {
        JSONObject jSONObject;
        Y7Q y7q;
        long LJI = LJI();
        String str = null;
        if (this.LJ != LJI) {
            if (this.LJFF.compareAndSet(false, true)) {
                if (this.LJI.get()) {
                    return null;
                }
                try {
                    String stringJustDisk = LJII.getStringJustDisk(this.LIZIZ, "");
                    try {
                    } catch (Throwable unused) {
                        C39048FUe.LIZIZ.LIZ("update content failed when parsing string to json", EnumC39866Fkk.E, "HybridSettings");
                        LJI = this.LJ;
                        jSONObject = this.LIZLLL;
                    }
                    if (stringJustDisk != null) {
                        jSONObject = new JSONObject(stringJustDisk);
                        if (z && (y7q = this.LIZ) != null) {
                            y7q.LIZIZ(new C39867Fkl(jSONObject, stringJustDisk));
                        }
                        str = stringJustDisk;
                        this.LIZLLL = jSONObject;
                        this.LJ = LJI;
                        return str;
                    }
                    o.LJIIZILJ();
                    throw null;
                } finally {
                    this.LJFF.set(false);
                }
            }
        }
        return null;
    }

    @Override // X.Y7R
    public final Object LIZIZ(Class clazz, Object obj) {
        o.LJIIJ(clazz, "clazz");
        try {
            if (clazz.isAssignableFrom(Long.TYPE)) {
                Keva keva = LJII;
                String LJFF = LJFF();
                if (obj != null) {
                    return Long.valueOf(keva.getLong(LJFF, ((Long) obj).longValue()));
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
            }
            if (clazz.isAssignableFrom(Boolean.TYPE)) {
                Keva keva2 = LJII;
                String LJFF2 = LJFF();
                if (obj != null) {
                    return Boolean.valueOf(keva2.getBoolean(LJFF2, ((Boolean) obj).booleanValue()));
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
            }
            if (clazz.isAssignableFrom(Integer.TYPE)) {
                Keva keva3 = LJII;
                String LJFF3 = LJFF();
                if (obj != null) {
                    return Integer.valueOf(keva3.getInt(LJFF3, ((Integer) obj).intValue()));
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
            }
            if (clazz.isAssignableFrom(Double.TYPE)) {
                Keva keva4 = LJII;
                String LJFF4 = LJFF();
                if (obj != null) {
                    return Double.valueOf(keva4.getDouble(LJFF4, ((Double) obj).doubleValue()));
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Double");
            }
            Keva keva5 = LJII;
            String LJFF5 = LJFF();
            if (obj != null) {
                return keva5.getString(LJFF5, (String) obj);
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable unused) {
            return obj;
        }
    }

    public final void LJII(long j, String str) {
        if (this.LJ > j || this.LJI.get()) {
            return;
        }
        Y7W.LJIILIIL.LIZ(new Y7P(this, j, str));
    }
}
