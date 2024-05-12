package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.8v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226708v4 extends AbstractC226768vA {
    public final String LIZ;
    public final String LIZIZ;

    public C226708v4() {
        this(null, 3);
    }

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C226708v4) {
            return C78966Uyw.LJIIIZ(((C226708v4) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Fail:%s,%s", LIZ());
    }

    public C226708v4(String errorMessage, int i) {
        String name;
        if ((i & 1) != 0) {
            name = "fail";
        } else {
            name = null;
        }
        errorMessage = (i & 2) != 0 ? "" : errorMessage;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(errorMessage, "errorMessage");
        this.LIZ = name;
        this.LIZIZ = errorMessage;
    }
}
