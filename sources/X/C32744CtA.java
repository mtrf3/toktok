package X;

import java.util.Objects;

/* renamed from: X.CtA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32744CtA extends ZCF {
    public final boolean LIZ;
    public final long LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZ), Long.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32744CtA) {
            return C78966Uyw.LJIIIZ(((C32744CtA) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CheckImageInCacheResult:%s,%s", LIZ());
    }

    public C32744CtA(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
