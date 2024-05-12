package X;

import java.util.Objects;

/* renamed from: X.309, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass309 extends C3UY {
    public final int LIZLLL;

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass309) {
            return C78966Uyw.LJIIIZ(((AnonymousClass309) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("SharePanelLoadContactEventBody:%s", LIZ());
    }

    public AnonymousClass309(int i) {
        super(null, C51029K0z.LJJIIZI(new OSZ("number_of_contacts", Integer.valueOf(i))), null, 5);
        this.LIZLLL = i;
    }
}
