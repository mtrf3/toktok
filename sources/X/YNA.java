package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YNA {
    public final String LIZ;
    public final EnumC87257YMj LIZIZ;
    public final YN0 LIZJ;

    public YNA() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YNA)) {
            return false;
        }
        YNA yna = (YNA) obj;
        return o.LJ(this.LIZ, yna.LIZ) && this.LIZIZ == yna.LIZIZ && this.LIZJ == yna.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC87257YMj enumC87257YMj = this.LIZIZ;
        int hashCode2 = (hashCode + (enumC87257YMj == null ? 0 : enumC87257YMj.hashCode())) * 31;
        YN0 yn0 = this.LIZJ;
        return hashCode2 + (yn0 != null ? yn0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonParams(awemeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", actType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public YNA(String str, EnumC87257YMj enumC87257YMj, YN0 yn0) {
        this.LIZ = str;
        this.LIZIZ = enumC87257YMj;
        this.LIZJ = yn0;
    }
}
