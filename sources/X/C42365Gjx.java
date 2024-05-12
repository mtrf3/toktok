package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42365Gjx extends AbstractC42364Gjw {
    public final Throwable LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CloudMergeFailed:%s", this.LIZ);
    }

    public C42365Gjx(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        this.LIZ = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42365Gjx)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C42365Gjx) obj).LIZ}, new Object[]{this.LIZ});
    }
}
