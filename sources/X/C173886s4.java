package X;

import java.util.Objects;

/* renamed from: X.6s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173886s4 extends AbstractC173906s6 {
    public final int LIZ;

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C173886s4) {
            return C78966Uyw.LJIIIZ(((C173886s4) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Start:%s", LIZ());
    }

    public C173886s4(int i) {
        this.LIZ = i;
    }
}
