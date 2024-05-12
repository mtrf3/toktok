package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91563ia extends AbstractC89473fD {
    public final C109544Rq LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnDelMessageEvent:%s", this.LIZ);
    }

    public C91563ia(C109544Rq message) {
        o.LJIIIZ(message, "message");
        this.LIZ = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91563ia)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C91563ia) obj).LIZ}, new Object[]{this.LIZ});
    }
}
