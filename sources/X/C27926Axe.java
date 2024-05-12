package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Axe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27926Axe {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27926Axe)) {
            return false;
        }
        C27926Axe c27926Axe = (C27926Axe) obj;
        return o.LJ(this.LIZ, c27926Axe.LIZ) && o.LJ(this.LIZIZ, c27926Axe.LIZIZ) && o.LJ(this.LIZJ, c27926Axe.LIZJ) && o.LJ(this.LIZLLL, c27926Axe.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangedSkuDto(sellerId=");
        LIZ.append(this.LIZ);
        LIZ.append(", skuId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", originQuantity=");
        LIZ.append(this.LIZJ);
        LIZ.append(", newQuantity=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C27926Axe(String str, String str2, Integer num, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
