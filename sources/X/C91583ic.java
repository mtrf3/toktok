package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91583ic extends AbstractC89473fD {
    public final List<C109544Rq> LIZ;
    public final boolean LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Boolean.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C91583ic) {
            return C78966Uyw.LJIIIZ(((C91583ic) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnLoadOlderEvent:%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91583ic(List<? extends C109544Rq> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
