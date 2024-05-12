package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.8W3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8W3 extends SZD {
    public final Object LIZJ;
    public final C8W1 LIZLLL;

    public final Object[] LIZ() {
        return new Object[]{this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8W3) {
            return C78966Uyw.LJIIIZ(((C8W3) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("AssemLifecyclePerformanceParams:%s,%s", LIZ());
    }

    public C8W3(Object host, C8W1 lifecycleStage) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(lifecycleStage, "lifecycleStage");
        this.LIZJ = host;
        this.LIZLLL = lifecycleStage;
    }
}
