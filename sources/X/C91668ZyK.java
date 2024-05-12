package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZyK, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91668ZyK {
    public final AbstractC13490fx LIZ;
    public final AbstractC13490fx LIZIZ;

    public C91668ZyK() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91668ZyK)) {
            return false;
        }
        C91668ZyK c91668ZyK = (C91668ZyK) obj;
        return o.LJ(this.LIZ, c91668ZyK.LIZ) && o.LJ(this.LIZIZ, c91668ZyK.LIZIZ);
    }

    public final int hashCode() {
        AbstractC13490fx abstractC13490fx = this.LIZ;
        int hashCode = (abstractC13490fx == null ? 0 : abstractC13490fx.hashCode()) * 31;
        AbstractC13490fx abstractC13490fx2 = this.LIZIZ;
        return hashCode + (abstractC13490fx2 != null ? abstractC13490fx2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoFonts(defaultFontFamily=");
        LIZ.append(this.LIZ);
        LIZ.append(", displayFontFamily=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91668ZyK(AbstractC13490fx abstractC13490fx, AbstractC13490fx abstractC13490fx2) {
        this.LIZ = abstractC13490fx;
        this.LIZIZ = abstractC13490fx2;
    }
}
