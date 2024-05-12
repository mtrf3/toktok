package X;

import java.util.Objects;

/* renamed from: X.8v8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226748v8 extends AbstractC226768vA {
    public final String LIZ;

    public C226748v8() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("NoNetwork:%s", this.LIZ);
    }

    public C226748v8(int i) {
        this.LIZ = "no network";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226748v8)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C226748v8) obj).LIZ}, new Object[]{this.LIZ});
    }
}
