package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.8v5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226718v5 extends AbstractC226768vA {
    public final String LIZ;
    public final int LIZIZ;

    public C226718v5() {
        this(0, 3);
    }

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C226718v5) {
            return C78966Uyw.LJIIIZ(((C226718v5) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("NoPermission:%s,%s", LIZ());
    }

    public C226718v5(int i, int i2) {
        String name;
        if ((i2 & 1) != 0) {
            name = "no permission";
        } else {
            name = null;
        }
        i = (i2 & 2) != 0 ? 0 : i;
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = i;
    }
}
