package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1N implements InterfaceC66331Q1n {
    public final HashMap<String, Object> LIZ = new HashMap<>();
    public final String LIZIZ;

    @Override // X.InterfaceC66331Q1n
    public final PQ5 LIZ(String key) {
        o.LJIIJ(key, "key");
        return null;
    }

    public Q1N(String str) {
        this.LIZIZ = str == null ? "" : str;
    }

    @Override // X.InterfaceC66331Q1n
    public final Object getValue(String key) {
        o.LJIIJ(key, "key");
        if (this.LIZ.containsKey(key)) {
            return this.LIZ.get(key);
        }
        FTR<?> ftr = Q16.LIZ.get(key);
        if (ftr != null) {
            this.LIZ.put(key, ftr.getValue());
            return this.LIZ.get(key);
        }
        FTR<?> LIZ = FJI.LIZ(this.LIZIZ, key);
        if (LIZ != null) {
            this.LIZ.put(key, LIZ.getValue());
            return this.LIZ.get(key);
        }
        return null;
    }
}
