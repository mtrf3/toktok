package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89463fC extends AbstractC89473fD {
    public final List<C109544Rq> LIZ;
    public final int LIZIZ;
    public final C107074Id LIZJ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ), this.LIZJ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C89463fC) {
            return C78966Uyw.LJIIIZ(((C89463fC) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnGetMessageEvent:%s,%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C89463fC(List<? extends C109544Rq> list, int i, C107074Id extra) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(extra, "extra");
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = extra;
    }
}
