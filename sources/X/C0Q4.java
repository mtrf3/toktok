package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0Q4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Q4<T> {
    public int LIZ = 300;
    public final java.util.Map<Integer, C0Q3<T>> LIZIZ = new LinkedHashMap();

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31 * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0Q4) {
            C0Q4 c0q4 = (C0Q4) obj;
            c0q4.getClass();
            if (this.LIZ == c0q4.LIZ && o.LJ(this.LIZIZ, c0q4.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public final C0Q3 LIZ(int i, Object obj) {
        C0Q3<T> c0q3 = new C0Q3<>(obj);
        this.LIZIZ.put(Integer.valueOf(i), c0q3);
        return c0q3;
    }
}
