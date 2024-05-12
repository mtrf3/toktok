package X;

import java.util.Objects;

/* renamed from: X.FtE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40392FtE {
    public final boolean LIZ;

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40392FtE) {
            return C78966Uyw.LJIIIZ(((C40392FtE) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("LogoutContext:%s", LIZ());
    }

    public C40392FtE(boolean z) {
        this.LIZ = z;
    }
}
