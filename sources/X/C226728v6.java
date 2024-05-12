package X;

import java.util.Objects;

/* renamed from: X.8v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226728v6 extends AbstractC226768vA {
    public final String LIZ;

    public C226728v6() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Loading:%s", this.LIZ);
    }

    public C226728v6(int i) {
        this.LIZ = "loading";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226728v6)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C226728v6) obj).LIZ}, new Object[]{this.LIZ});
    }
}
