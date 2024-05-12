package X;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1J implements InterfaceC66331Q1n {
    public long LIZ;
    public final HashSet<String> LIZIZ;
    public final InterfaceC66331Q1n LIZJ;
    public final java.util.Map<String, ?> LIZLLL;
    public final java.util.Map<String, PQ5> LJ;

    @Override // X.InterfaceC66331Q1n
    public final PQ5 LIZ(String key) {
        o.LJIIJ(key, "key");
        long nanoTime = System.nanoTime();
        PQ5 LIZ = this.LIZJ.LIZ(key);
        if (LIZ != null) {
            this.LIZIZ.add(key);
        } else {
            LIZ = this.LJ.get(key);
        }
        this.LIZ = (System.nanoTime() - nanoTime) + this.LIZ;
        return LIZ;
    }

    @Override // X.InterfaceC66331Q1n
    public final Object getValue(String key) {
        o.LJIIJ(key, "key");
        long nanoTime = System.nanoTime();
        Object value = this.LIZJ.getValue(key);
        HashMap<String, Object> hashMap = null;
        if (value != null) {
            this.LIZIZ.add(key);
        } else {
            value = this.LIZLLL.get(key);
            if (value instanceof FTR) {
                value = ((FTR) value).getValue();
                InterfaceC66331Q1n interfaceC66331Q1n = this.LIZJ;
                if (interfaceC66331Q1n instanceof Q1N) {
                    hashMap = ((Q1N) interfaceC66331Q1n).LIZ;
                }
                if (hashMap instanceof HashMap) {
                    hashMap.put(key, value);
                }
            }
        }
        this.LIZ = (System.nanoTime() - nanoTime) + this.LIZ;
        return value;
    }

    public Q1J(Q1N q1n, java.util.Map map, java.util.Map extraFunctions) {
        o.LJIIJ(extraFunctions, "extraFunctions");
        this.LIZJ = q1n;
        this.LIZLLL = map;
        this.LJ = extraFunctions;
        this.LIZIZ = new HashSet<>();
    }
}
