package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28008Ayy {
    public final String LIZ;
    public final Double LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28008Ayy)) {
            return false;
        }
        C28008Ayy c28008Ayy = (C28008Ayy) obj;
        return o.LJ(this.LIZ, c28008Ayy.LIZ) && o.LJ(this.LIZIZ, c28008Ayy.LIZIZ) && o.LJ(this.LIZJ, c28008Ayy.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.LIZIZ;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurrencyOriginalSalePrice(currency=");
        LIZ.append(this.LIZ);
        LIZ.append(", originalPriceVal=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", salePriceVal=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C28008Ayy(String str, Double d, String str2) {
        this.LIZ = str;
        this.LIZIZ = d;
        this.LIZJ = str2;
    }
}
