package X;

import java.util.Objects;

/* renamed from: X.30C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30C extends C3UY {
    public final long LIZLLL;

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30C) {
            return C78966Uyw.LJIIIZ(((C30C) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CommonShareFirstDrawEventBody:%s", LIZ());
    }

    public C30C(long j) {
        super(null, C51029K0z.LJJIIZI(new OSZ("draw_time", Long.valueOf(j))), null, 5);
        this.LIZLLL = j;
    }
}
