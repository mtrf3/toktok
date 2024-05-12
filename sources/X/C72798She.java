package X;

import kotlin.jvm.internal.o;

/* renamed from: X.She, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72798She extends AbstractC72800Shg {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C72798She) && o.LJ(this.LIZ, ((C72798She) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClearPropSearchText(panelUnfold=");
        return JBR.LJFF(LIZ, this.LIZ, ")", LIZ);
    }

    public C72798She(String str) {
        this.LIZ = str;
    }
}
