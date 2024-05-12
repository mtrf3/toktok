package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59862Wo {
    public final String LIZ = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C59862Wo) && o.LJ(this.LIZ, ((C59862Wo) obj).LIZ);
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
        LIZ.append("SecId(SecId=");
        return JBR.LJFF(LIZ, this.LIZ, ")", LIZ);
    }
}
