package X;

import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0ME, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ME {
    public final Object LIZ;
    public boolean LIZIZ;
    public final C1HX LIZJ;

    public final void LIZ(java.util.Map<Object, java.util.Map<String, List<Object>>> map) {
        o.LJIIIZ(map, "map");
        if (this.LIZIZ) {
            java.util.Map<String, List<Object>> LIZJ = this.LIZJ.LIZJ();
            if (LIZJ.isEmpty()) {
                map.remove(this.LIZ);
            } else {
                map.put(this.LIZ, LIZJ);
            }
        }
    }

    public C0ME(C1HU c1hu, Object key) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
        this.LIZIZ = true;
        this.LIZJ = new C1HX(c1hu.LIZ.get(key), new IDqS416S0100000(c1hu, 94));
    }
}
