package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E9K {
    public final LinkedHashMap<String, E9M> LIZ = new LinkedHashMap<>(50);
    public final java.util.Set<String> LIZIZ = new LinkedHashSet(2);

    public final List<E9M> LIZ() {
        Collection<E9M> values = this.LIZ.values();
        o.LJIIIIZZ(values, "mainCache.values");
        return ORZ.LLJI(values);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cache: ");
        LIZ.append(this.LIZ);
        LIZ.append(" Auto Music: ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }
}
