package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SC7 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SC7)) {
            return false;
        }
        SC7 sc7 = (SC7) obj;
        return o.LJ(this.LIZ, sc7.LIZ) && o.LJ(this.LIZIZ, sc7.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean LIZ() {
        if (C78685UuP.LJJJZ(this.LIZ) || C78685UuP.LJJJZ(this.LIZIZ)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        String str = this.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append('/');
        String str3 = this.LIZ;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public SC7(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
