package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Juq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50684Juq implements InterfaceC50310Joo {
    public final java.util.Map<?, ?> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50684Juq) && o.LJ(this.LIZ, ((C50684Juq) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestWordUpdateAction(suggestWords=");
        return C15890jp.LIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50684Juq(java.util.Map<?, ?> suggestWords) {
        o.LJIIIZ(suggestWords, "suggestWords");
        this.LIZ = suggestWords;
    }
}
