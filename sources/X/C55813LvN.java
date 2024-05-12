package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.LvN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55813LvN {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C55813LvN() {
        this(null, null, null, null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55813LvN)) {
            return false;
        }
        C55813LvN c55813LvN = (C55813LvN) obj;
        return o.LJ(this.LIZ, c55813LvN.LIZ) && o.LJ(this.LIZIZ, c55813LvN.LIZIZ) && o.LJ(this.LIZJ, c55813LvN.LIZJ) && o.LJ(this.LIZLLL, c55813LvN.LIZLLL) && this.LJ == c55813LvN.LJ && o.LJ(this.LJFF, c55813LvN.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str3 = this.LJFF;
        return i2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoppingCartCard(cardType=");
        LIZ.append(this.LIZ);
        LIZ.append(", link=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", buttonName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", badgeCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enableSendButtonShow=");
        LIZ.append(this.LJ);
        LIZ.append(", iconColor=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C55813LvN(Integer num, Integer num2, String str, String str2, boolean z, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        num2 = (i & 8) != 0 ? null : num2;
        z = (i & 16) != 0 ? false : z;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num2;
        this.LJ = z;
        this.LJFF = null;
    }
}
