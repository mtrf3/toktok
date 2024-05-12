package X;

import java.util.Objects;

/* renamed from: X.8v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226738v7 extends AbstractC226768vA {
    public final String LIZ;

    public C226738v7() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Success:%s", this.LIZ);
    }

    public C226738v7(int i) {
        this.LIZ = "success";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226738v7)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C226738v7) obj).LIZ}, new Object[]{this.LIZ});
    }
}
