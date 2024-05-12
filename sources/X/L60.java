package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L60 {
    public static final java.util.Map<L61, L6O> LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = C221108m2.LIZIZ(L62.LJLIL);
        linkedHashMap.put(L61.STORY, C53582L1e.LIZIZ.LIZJ());
    }

    public static L6O LIZ(L61 tag) {
        o.LJIIIZ(tag, "tag");
        L6O l6o = (L6O) ((LinkedHashMap) LIZ).get(tag);
        if (l6o == null) {
            return (L6O) LIZIZ.getValue();
        }
        return l6o;
    }
}
