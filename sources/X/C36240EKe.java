package X;

import java.util.Objects;

/* renamed from: X.EKe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36240EKe extends C35656Dz2 {
    public final boolean LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36240EKe) {
            return C78966Uyw.LJIIIZ(((C36240EKe) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("LoginComponentData:%s", LIZ());
    }

    public C36240EKe(boolean z) {
        super(null);
        this.LIZIZ = z;
    }
}
