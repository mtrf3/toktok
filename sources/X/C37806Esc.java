package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Esc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37806Esc {
    public final boolean LIZ;
    public final EnumC37807Esd LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37806Esc)) {
            return false;
        }
        C37806Esc c37806Esc = (C37806Esc) obj;
        return this.LIZ == c37806Esc.LIZ && this.LIZIZ == c37806Esc.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LIZIZ.hashCode() + (r0 * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTPState(shouldHook=");
        LIZ.append(this.LIZ);
        LIZ.append(", ttp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37806Esc(EnumC37807Esd ttp) {
        o.LJIIIZ(ttp, "ttp");
        this.LIZ = true;
        this.LIZIZ = ttp;
    }
}
