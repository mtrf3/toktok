package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Shh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72801Shh extends AbstractC72800Shg {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C72801Shh) && o.LJ(this.LIZ, ((C72801Shh) obj).LIZ);
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
        LIZ.append("ClickSearchIcon(enterMethod=");
        return JBR.LJFF(LIZ, this.LIZ, ")", LIZ);
    }

    public C72801Shh(String str) {
        this.LIZ = str;
    }
}
