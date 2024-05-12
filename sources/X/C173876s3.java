package X;

import java.util.Objects;

/* renamed from: X.6s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173876s3 extends AbstractC173906s6 {
    public final float LIZ;

    public final Object[] LIZ() {
        return new Object[]{Float.valueOf(this.LIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C173876s3) {
            return C78966Uyw.LJIIIZ(((C173876s3) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Processing:%s", LIZ());
    }

    public C173876s3(float f) {
        this.LIZ = f;
    }
}
