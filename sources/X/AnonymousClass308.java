package X;

import java.util.Objects;

/* renamed from: X.308, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass308 extends C3UY {
    public final long LIZLLL;

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass308) {
            return C78966Uyw.LJIIIZ(((AnonymousClass308) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("SharePanelFirstFrameEventBody:%s", LIZ());
    }

    public AnonymousClass308(long j) {
        super(null, C51029K0z.LJJIIZI(new OSZ("drawing_time", Long.valueOf(j))), null, 5);
        this.LIZLLL = j;
    }
}
