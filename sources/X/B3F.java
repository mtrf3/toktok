package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B3F {
    public final String LIZ;
    public String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B3F)) {
            return false;
        }
        B3F b3f = (B3F) obj;
        return o.LJ(this.LIZ, b3f.LIZ) && o.LJ(this.LIZIZ, b3f.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("defaultResolution = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(",pullStreamData = ");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public B3F(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
