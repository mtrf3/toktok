package X;

import java.util.Objects;

/* renamed from: X.8v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226758v9 extends AbstractC226768vA {
    public final String LIZ;

    public C226758v9() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RefreshEmpty:%s", this.LIZ);
    }

    public C226758v9(int i) {
        this.LIZ = "refresh empty";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226758v9)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C226758v9) obj).LIZ}, new Object[]{this.LIZ});
    }
}
