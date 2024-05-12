package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91593id extends AbstractC89473fD {
    public final List<C109544Rq> LIZ;
    public final java.util.Map<String, java.util.Map<String, String>> LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C91593id) {
            return C78966Uyw.LJIIIZ(((C91593id) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnUpdateMessageEvent:%s,%s", LIZ());
    }

    public /* synthetic */ C91593id(List list) {
        this(list, C113554cx.LJJJLIIL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91593id(List<? extends C109544Rq> list, java.util.Map<String, ? extends java.util.Map<String, String>> oldMsgExtMap) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(oldMsgExtMap, "oldMsgExtMap");
        this.LIZ = list;
        this.LIZIZ = oldMsgExtMap;
    }
}
