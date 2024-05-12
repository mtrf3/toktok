package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91603ie extends AbstractC89473fD {
    public final int LIZ;
    public final C109544Rq LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LIZ), this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C91603ie) {
            return C78966Uyw.LJIIIZ(((C91603ie) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnAddMessageEvent:%s,%s", LIZ());
    }

    public C91603ie(int i, C109544Rq message) {
        o.LJIIIZ(message, "message");
        this.LIZ = i;
        this.LIZIZ = message;
    }
}
