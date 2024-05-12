package X;

import java.util.Objects;

/* renamed from: X.SYs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72290SYs extends AbstractC72297SYz {
    public final double LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{Double.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72290SYs) {
            return C78966Uyw.LJIIIZ(((C72290SYs) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ListFpsPerformanceParams:%s", LIZ());
    }

    public C72290SYs(double d) {
        this.LIZIZ = d;
    }
}
