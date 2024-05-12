package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Q5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q5 {
    public final C3Q6 LIZ;
    public final List<C63120Opw> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3Q5)) {
            return false;
        }
        C3Q5 c3q5 = (C3Q5) obj;
        return this.LIZ == c3q5.LIZ && o.LJ(this.LIZIZ, c3q5.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("action ");
        LIZ.append(this.LIZ.LJLIL);
        LIZ.append(" raw conversation list size ");
        LIZ.append(this.LIZIZ.size());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3Q5(C3Q6 c3q6, List<? extends C63120Opw> conversationList) {
        o.LJIIIZ(conversationList, "conversationList");
        this.LIZ = c3q6;
        this.LIZIZ = conversationList;
    }
}
