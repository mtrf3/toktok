package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQV {
    public final String LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final Y1Y LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IQV)) {
            return false;
        }
        IQV iqv = (IQV) obj;
        return o.LJ(this.LIZ, iqv.LIZ) && o.LJ(this.LIZIZ, iqv.LIZIZ) && this.LIZJ == iqv.LIZJ && o.LJ(this.LIZLLL, iqv.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Y1Y y1y = this.LIZLLL;
        return i2 + (y1y != null ? y1y.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurrentCaptionContext(captionText=");
        LIZ.append(this.LIZ);
        LIZ.append(", languageId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isOriginalLang=");
        LIZ.append(this.LIZJ);
        LIZ.append(", translationStateWhenReceived=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public IQV(String str, Integer num, boolean z, Y1Y y1y) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = y1y;
    }
}
