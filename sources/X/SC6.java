package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SC6 {
    public final String LIZ;
    public final SC7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SC6)) {
            return false;
        }
        SC6 sc6 = (SC6) obj;
        return o.LJ(this.LIZ, sc6.LIZ) && o.LJ(this.LIZIZ, sc6.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OcrResult(cardNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", date=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SC6(String str, SC7 sc7) {
        this.LIZ = str;
        this.LIZIZ = sc7;
    }
}
