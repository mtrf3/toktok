package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LvR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55817LvR {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C55817LvR() {
        this(31, (Integer) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55817LvR)) {
            return false;
        }
        C55817LvR c55817LvR = (C55817LvR) obj;
        return o.LJ(this.LIZ, c55817LvR.LIZ) && o.LJ(this.LIZIZ, c55817LvR.LIZIZ) && o.LJ(this.LIZJ, c55817LvR.LIZJ) && o.LJ(this.LIZLLL, c55817LvR.LIZLLL) && this.LJ == c55817LvR.LJ;
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
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
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
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C55817LvR(int i, Integer num, String str, String str2, boolean z) {
        this((i & 1) != 0 ? null : num, (Integer) null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 16) != 0 ? false : z);
    }

    public C55817LvR(Integer num, Integer num2, String str, String str2, boolean z) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num2;
        this.LJ = z;
    }
}
